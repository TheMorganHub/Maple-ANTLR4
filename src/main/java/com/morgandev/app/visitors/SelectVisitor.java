package com.morgandev.app.visitors;

import com.morgandev.app.utils.MapleUtils;
import com.morgandev.app.gen.MapleParser;

import java.util.ArrayList;
import java.util.List;

public class SelectVisitor extends AbstractMapleVisitor {

    private static SelectVisitor ourInstance = new SelectVisitor();

    public static SelectVisitor getInstance() {
        return ourInstance;
    }

    private SelectVisitor() {
    }

    @Override
    public String visitSelect_stmt(MapleParser.Select_stmtContext ctx) {
        String tableName = visit(ctx.table_name());
        String tableAlias = ctx.table_alias() == null ? "" : ctx.table_alias().getText();
        List<MapleParser.Result_columnContext> columnContexts = ctx.result_column();
        StringBuilder selectStmt = new StringBuilder("SELECT");
        if (columnContexts.isEmpty()) {
            selectStmt.append(" *");
        } else {
            int columnCount = 0;
            for (MapleParser.Result_columnContext columnCtx : columnContexts) {
                selectStmt.append(columnCount == 0 ? "" : ",").append(visit(columnCtx));
                columnCount++;
            }
        }

        selectStmt.append(" FROM").append(" ").append("`").append(tableName).append("`").append(tableAlias.isEmpty() ? "" : " " + tableAlias);

        selectStmt.append(processExplicitJoins(ctx.join_stmt()));
        selectStmt.append(processImplicitJoins(columnContexts, tableName, tableAlias));

        MapleParser.ConditionalContext conditionalContext = ctx.conditional();
        if (conditionalContext != null) {
            selectStmt.append(visit(conditionalContext));
        }
        return selectStmt.toString();
    }

    public String processExplicitJoins(List<MapleParser.Join_stmtContext> joinContexts) {
        if (joinContexts.isEmpty()) {
            return "";
        }

        StringBuilder joinStmts = new StringBuilder();
        for (MapleParser.Join_stmtContext joinCtx : joinContexts) {
            joinStmts.append("\n").append(visit(joinCtx));
        }
        return joinStmts.toString();
    }

    public String processImplicitJoins(List<MapleParser.Result_columnContext> resultColumnContexts, String mainTableName, String mainTableAlias) {
        if (resultColumnContexts.isEmpty()) {
            return "";
        }
        String innerJoins = "";
        List<String> tableJoins = new ArrayList<>();
        List<String> tableAliases = new ArrayList<>();
        for (MapleParser.Result_columnContext resultColumn : resultColumnContexts) {
            if (resultColumn.expr().table_name() == null) {
                continue;
            }

            String tableName = resultColumn.expr().table_name().getText();
            if (!tableName.equals(mainTableName)
                    && !tableName.equals(mainTableAlias)
                    && !tableJoins.contains(tableName)
                    && !tableAliases.contains(tableName)) {
                tableJoins.add(tableName);
                String tableAlias = MapleUtils.createTableAlias(tableName);
                tableAliases.add(tableAlias);
                innerJoins += "\nJOIN `" + tableName + "`" + (tableAlias.equals("") ? "" : " " + tableAlias) + " ON id_" + tableName + " = " + (tableAlias.equals("") ? tableName : tableAlias) + ".id";
            }
        }

        return innerJoins;
    }

    @Override
    public String visitResult_column(MapleParser.Result_columnContext ctx) {
        return visit(ctx.expr()) + (ctx.column_alias() != null ? " " + ctx.column_alias().getText() : "");
    }
}
