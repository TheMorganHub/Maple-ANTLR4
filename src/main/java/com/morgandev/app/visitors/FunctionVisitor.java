package com.morgandev.app.visitors;

import com.morgandev.app.gen.MapleParser;

import java.util.List;

public class FunctionVisitor extends AbstractMapleVisitor {
    private static FunctionVisitor ourInstance = new FunctionVisitor();

    public static FunctionVisitor getInstance() {
        return ourInstance;
    }

    private FunctionVisitor() {
    }

    @Override
    public String visitFunction(MapleParser.FunctionContext ctx) {
        List<MapleParser.ExprContext> functionExprContexts = ctx.expr();
        StringBuilder func = new StringBuilder(ctx.function_name().getText()).append("(");
        int expressions = 0;
        for (MapleParser.ExprContext functionExprContext : functionExprContexts) {
            func.append(expressions == 0 ? "" : ", ").append(visit(functionExprContext).trim());
            expressions++;
        }
        return func + ")";
    }
}
