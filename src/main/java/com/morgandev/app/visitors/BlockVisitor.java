package com.morgandev.app.visitors;

import com.morgandev.app.blocks.BlockAction;
import com.morgandev.app.errorhandling.MapleParseException;
import com.morgandev.app.gen.MapleParser;

import java.util.List;

public class BlockVisitor extends AbstractMapleVisitor {

    private boolean preparedMode;
    private static BlockVisitor ourInstance = new BlockVisitor();

    public static BlockVisitor getInstance() {
        return ourInstance;
    }

    private BlockVisitor() {
    }

    public boolean isPreparedMode() {
        return preparedMode;
    }

    @Override
    public String visitBlock_statement(MapleParser.Block_statementContext ctx) {
        if (ctx.select_stmt() != null) {
            return visit(ctx.select_stmt());
        }
        if (ctx.insert_stmt() != null) {
            return visit(ctx.insert_stmt());
        }
        if (ctx.delete_stmt() != null) {
            return visit(ctx.delete_stmt());
        }
        if (ctx.update_stmt() != null) {
            return visit(ctx.update_stmt());
        }
        if (ctx.variable_stmt() != null) {
            return visit(ctx.variable_stmt());
        }
        if (ctx.maple_block() != null) {
            return visit(ctx.maple_block());
        }
        if (ctx.embedded_sql() != null) {
            return visit(ctx.embedded_sql());
        }
        if (ctx.utility_stmt() != null) {
            return visit(ctx.utility_stmt());
        }
        return null;
    }

    @Override
    public String visitMaple_block(MapleParser.Maple_blockContext ctx) {
        String actionName = ctx.block_action_name().getText();
        BlockAction action = new BlockAction();
        return action.processAction(actionName, ctx);
    }

    @Override
    public String visitBlock_params_declaration(MapleParser.Block_params_declarationContext ctx) {
        List<MapleParser.Block_datatype_paramContext> blockParamsDataContexts = ctx.block_datatype_param();
        if (blockParamsDataContexts.isEmpty()) {
            return "";
        }
        String paramsDeclaration = "";
        int params = 0;
        for (MapleParser.Block_datatype_paramContext blockParamsDataContext : blockParamsDataContexts) {
            paramsDeclaration += (params == 0 ? "" : ",") + " " + visit(blockParamsDataContext);
            params++;
        }
        return paramsDeclaration;
    }

    @Override
    public String visitBlock_params_expr_declaration(MapleParser.Block_params_expr_declarationContext ctx) {
        String exprStmt = "";
        for (MapleParser.ExprContext exprContext : ctx.expr()) {
            exprStmt += visit(exprContext);
        }
        return exprStmt;
    }

    @Override
    public String visitBlock_datatype_param(MapleParser.Block_datatype_paramContext ctx) {
        return ctx.any_name().getText() + " " + visit(ctx.parameter_type());
    }

    /**
     * Returns '?' for every prepared variable ':?' it encounters during parsing. If this method is called and <code>preparedMode</code>
     * is <code>false</code>, a {@link MapleParseException} with error code 10103 will be raised. Ideally, this method
     * will only be called while parsing prepared blocks.
     *
     * @param ctx the context
     * @return '?' if <code>preparedMode</code> is <code>true</code>, otherwise an MapleParseException is raised.
     */
    @Override
    public String visitPrepared_literal_value(MapleParser.Prepared_literal_valueContext ctx) {
        if (!preparedMode) {
            throw new MapleParseException(10103, ctx);
        }
        return "?";
    }

    /**
     * Visits the statement within the given {@link com.morgandev.app.gen.MapleParser.Block_statementContext} treating
     * it as prepared. If a statement is prepared, all prepared literal values ':?' found within the statement will be
     * replaced with '?'. Used for prepared blocks.
     *
     * @param blockStatementContext
     * @return
     */
    public String visitStatementAsPrepared(MapleParser.Block_statementContext blockStatementContext) {
        preparedMode = true;
        String stmt = visitBlock_statement(blockStatementContext);
        preparedMode = false;
        return stmt;
    }
}
