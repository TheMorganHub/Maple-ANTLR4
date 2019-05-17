package com.morgandev.app.visitors;

import com.morgandev.app.gen.MapleParser;

public class UtilityVisitor extends AbstractMapleVisitor {
    private static UtilityVisitor ourInstance = new UtilityVisitor();

    public static UtilityVisitor getInstance() {
        return ourInstance;
    }

    private UtilityVisitor() {
    }

    @Override
    public String visitPrint_stmt(MapleParser.Print_stmtContext ctx) {
        return "SELECT" + visit(ctx.expr());
    }
}
