package com.morgandev.app;

import com.morgandev.app.gen.MapleBaseVisitor;
import com.morgandev.app.gen.MapleParser;

import java.util.List;

public class MapleCustomVisitor extends MapleBaseVisitor<String> {


    private String lastVisitedTable;
    private String currentTable;
    private String lastTableAlias;
    private String currentTableAlias;

    @Override
    public String visitMaple_stmt_list(MapleParser.Maple_stmt_listContext ctx) {
        String mapleStmts = "";
        List<MapleParser.Maple_stmtContext> mapleStmtsContexts = ctx.maple_stmt();
//        for (:) {
//
//        }
        return super.visitMaple_stmt_list(ctx);
    }

    @Override
    public String visitMaple_stmt(MapleParser.Maple_stmtContext ctx) {
        MapleParser.Select_stmtContext select_stmt = ctx.select_stmt();
        String mapleStmt = visit(select_stmt);

        return mapleStmt;
    }

    @Override
    public String visitSelect_stmt(MapleParser.Select_stmtContext ctx) {
        String tableName = visit(ctx.table_name());
        String tableAlias = ctx.table_alias() == null ? "" : ctx.table_alias().getText();
        List<MapleParser.Result_columnContext> columnContexts = ctx.result_column();
        String selectStmt = "SELECT ";
        int i = 0;
        for (MapleParser.Result_columnContext columnCtx : columnContexts) {
            selectStmt += (i == 0 ? "" : ", ") + visit(columnCtx);
            i++;
        }

        selectStmt += " FROM " + tableName + " " + (tableAlias.isEmpty() ? "" : tableAlias + " ");

        List<MapleParser.Join_stmtContext> joinContexts = ctx.join_stmt();

        for (MapleParser.Join_stmtContext joinCtx : joinContexts) {
            selectStmt += visit(joinCtx);
        }

        MapleParser.ConditionalContext conditionalContext = ctx.conditional();
        if (conditionalContext != null) {
            selectStmt += visit(conditionalContext);
        }

        return selectStmt;
    }

    @Override
    public String visitResult_column(MapleParser.Result_columnContext ctx) {
        MapleParser.Select_stmtContext selectStmtCtx = ctx.expr().select_stmt();
        MapleParser.Column_nameContext columnName = ctx.expr().column_name();
        if (columnName != null) {
            return columnName.getText();
        }
        if (selectStmtCtx != null) {
            return "(" + visit(selectStmtCtx) + ")";
        }
        return "";
    }

    @Override
    public String visitJoin_stmt(MapleParser.Join_stmtContext ctx) {
        String join = " INNER JOIN ";
        MapleParser.Table_nameContext tableName = ctx.table_name();
        MapleParser.Table_aliasContext tableAlias = ctx.table_alias();
        String tableNameAndAlias = "";
        if (tableName != null) {
            tableNameAndAlias += visit(tableName);
        }

        if (tableAlias != null) {
            tableNameAndAlias += " " + visit(tableAlias);
        }

        if (!tableNameAndAlias.isEmpty()) {
            join += tableNameAndAlias;
        }
        MapleParser.Select_stmtContext selectStmtCtx = ctx.select_stmt();
        if (selectStmtCtx != null) {
            join += "(" + visit(selectStmtCtx) + ") ";
        }

        join += " ON " + lastVisitedTable + ".id_" + currentTable + " = " + currentTable + ".id ";

        return join;
    }

    @Override
    public String visitTable_name(MapleParser.Table_nameContext ctx) {
        String tableName = ctx.getText();
        lastVisitedTable = currentTable == null ? tableName : currentTable;
        currentTable = tableName;
        return tableName;
    }

    @Override
    public String visitTable_alias(MapleParser.Table_aliasContext ctx) {
        String tableAlias = ctx.getText();
        lastTableAlias = currentTableAlias == null ? tableAlias : currentTableAlias;
        currentTableAlias = tableAlias;
        return tableAlias;
    }

    @Override
    public String visitConditional(MapleParser.ConditionalContext ctx) {
        return "WHERE (" + visit(ctx.expr()) + ")";
    }

    @Override
    public String visitExpr(MapleParser.ExprContext ctx) {
        if (ctx.select_stmt() != null) {
            return "(" + visit(ctx.select_stmt()) + ")";
        }

        return (ctx.left != null ? visit(ctx.left) : ctx.getText()) + (ctx.operator != null ? ctx.operator.getText() : "") + " " + (ctx.right != null ? visit(ctx.right) : "");
    }
}
