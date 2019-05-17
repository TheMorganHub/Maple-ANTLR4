package com.morgandev.app.visitors;

import com.morgandev.app.gen.MapleParser;

public class JoinVisitor extends AbstractMapleVisitor {
    private static JoinVisitor ourInstance = new JoinVisitor();

    public static JoinVisitor getInstance() {
        return ourInstance;
    }

    private JoinVisitor() {
    }

    @Override
    public String visitJoin_stmt(MapleParser.Join_stmtContext ctx) {
        String join = (ctx.left != null ? "LEFT JOIN" : ctx.right != null ? "RIGHT JOIN" : "INNER JOIN");

        MapleParser.Select_stmtContext selectStmtCtx = ctx.select_stmt();

        if (ctx.table_name() != null) {
            join += " `" + ctx.table_name().getText() + "`";
        }

        if (selectStmtCtx != null) {
            join += " (" + visit(selectStmtCtx) + ")";
        }

        if (ctx.table_alias() != null) {
            join += " " + ctx.table_alias().getText();
        }

        if (ctx.join_constraint() != null) {
            join += visit(ctx.join_constraint());
        }

        return join;
    }

    @Override
    public String visitJoin_constraint(MapleParser.Join_constraintContext ctx) {
        return " ON" + visit(ctx.expr());
    }
}
