package com.morgandev.app.visitors;

import com.morgandev.app.gen.MapleParser;

public class ExpressionVisitor extends AbstractMapleVisitor {

    private static ExpressionVisitor ourInstance = new ExpressionVisitor();

    public static ExpressionVisitor getInstance() {
        return ourInstance;
    }

    private ExpressionVisitor() {
    }

    @Override
    public String visitExpr(MapleParser.ExprContext ctx) {
        if (ctx.select_stmt() != null) {
            return " (" + visit(ctx.select_stmt()) + ")";
        }
        if (ctx.function() != null) {
            return " " + visit(ctx.function());
        }
        if (ctx.database_name() != null || ctx.table_name() != null || ctx.column_name() != null) {
            MapleParser.Database_nameContext databaseName = ctx.database_name();
            MapleParser.Table_nameContext tableName = ctx.table_name();
            MapleParser.Column_nameContext columnName = ctx.column_name();

            return " " + (databaseName != null ? databaseName.getText() + "." : "")
                    + (tableName != null ? tableName.getText() + "." : "")
                    + (columnName != null ? columnName.getText() : "");
        }
        if (ctx.literal_value() != null) {
            return " " + visit(ctx.literal_value());
        }
        if (ctx.prepared_literal_value() != null) {
            return " " + visit(ctx.prepared_literal_value());
        }

        //an expression enclosed in parentheses would fall into this category
        if (ctx.left == null && ctx.right == null && ctx.operator == null) {
            return " (" + visit(ctx.expr(0)).trim() + ")";
        }

        return (ctx.left != null ? visit(ctx.left) : ctx.getText()) + (ctx.operator != null ? " " + ctx.operator.getText() + "" : "") + (ctx.right != null ? visit(ctx.right) : "");
    }
}
