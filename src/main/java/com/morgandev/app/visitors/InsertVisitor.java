package com.morgandev.app.visitors;

import com.morgandev.app.gen.MapleParser;

import java.util.List;

public class InsertVisitor extends AbstractMapleVisitor {
    private static InsertVisitor ourInstance = new InsertVisitor();

    public static InsertVisitor getInstance() {
        return ourInstance;
    }

    private InsertVisitor() {
    }

    @Override
    public String visitInsert_stmt(MapleParser.Insert_stmtContext ctx) {
        StringBuilder insertStmt = new StringBuilder("INSERT INTO `" + (ctx.table_name().getText()) + "`");
        if (ctx.select_stmt() != null) {
            insertStmt.append("\n").append(visit(ctx.select_stmt()));
            return insertStmt.toString();
        }
        if (!ctx.column_name().isEmpty()) {
            List<MapleParser.Column_nameContext> columnNameContexts = ctx.column_name();
            int columns = 0;
            insertStmt.append("(");
            for (MapleParser.Column_nameContext columnNameCtx : columnNameContexts) {
                insertStmt.append(columns == 0 ? "" : ", ").append("`").append(columnNameCtx.getText()).append("`");
                columns++;
            }
            insertStmt.append(")");
        }

        insertStmt.append(" VALUES");
        List<MapleParser.Insert_value_setContext> valueSetsContexts = ctx.insert_value_set();
        int valueSets = 0;
        for (MapleParser.Insert_value_setContext valueSetCtx : valueSetsContexts) {
            insertStmt.append(valueSets == 0 ? "" : ", ").append(visit(valueSetCtx));
            valueSets++;
        }
        return insertStmt.toString();
    }

    @Override
    public String visitInsert_value_set(MapleParser.Insert_value_setContext ctx) {
        StringBuilder valueSet = new StringBuilder("(");
        int expressions = 0;
        for (MapleParser.ExprContext exprCtx : ctx.expr()) {
            valueSet.append(expressions == 0 ? "" : ", ").append(visit(exprCtx).trim());
            expressions++;
        }
        return valueSet.append(")").toString();
    }
}
