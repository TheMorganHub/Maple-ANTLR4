package com.morgandev.app.visitors;

import com.morgandev.app.errorhandling.MapleParseException;
import com.morgandev.app.gen.MapleParser;
import com.morgandev.app.utils.MapleUtils;

import java.util.List;

public class ComplexBlockVisitor extends AbstractMapleVisitor {
    private static ComplexBlockVisitor ourInstance = new ComplexBlockVisitor();

    public static ComplexBlockVisitor getInstance() {
        return ourInstance;
    }

    private ComplexBlockVisitor() {
    }

    @Override
    public String visitComplex_block(MapleParser.Complex_blockContext ctx) {
        if (ctx.if_block() != null) {
            return visitIf_block(ctx.if_block());
        }
        return "";
    }

    @Override
    public String visitIf_block(MapleParser.If_blockContext ctx) {
        if (ctx.block_params_expr_declaration() == null) {
            throw new MapleParseException(10104, ctx, "If");
        }
        if (ctx.block_statement().isEmpty()) {
            throw new MapleParseException(10100, ctx, "If");
        }
        String ifStmt = "IF(" + visit(ctx.block_params_expr_declaration()) + ") THEN";
        ifStmt += MapleUtils.parseFreeBlockBody(ctx.block_statement());
        List<MapleParser.Elseif_blockContext> elseIfsBlocks = ctx.elseif_block();
        if (!elseIfsBlocks.isEmpty()) {
            for (MapleParser.Elseif_blockContext elseIfBlockCtx : elseIfsBlocks) {
                ifStmt += visitElseif_block(elseIfBlockCtx);
            }
        }
        MapleParser.Else_blockContext elseBlockContext = ctx.else_block();
        if (elseBlockContext != null) {
            ifStmt += visitElse_block(elseBlockContext);
        }
        ifStmt += "\nEND IF";
        return ifStmt;
    }

    @Override
    public String visitElseif_block(MapleParser.Elseif_blockContext ctx) {
        if (ctx.block_params_expr_declaration() == null) {
            throw new MapleParseException(10104, ctx, "If");
        }
        if (ctx.block_statement().isEmpty()) {
            throw new MapleParseException(10100, ctx, "If");
        }
        String elseIfStmt = "\nELSEIF(" + visit(ctx.block_params_expr_declaration()) + ") THEN" + MapleUtils.parseFreeBlockBody(ctx.block_statement());
        return elseIfStmt;
    }

    @Override
    public String visitElse_block(MapleParser.Else_blockContext ctx) {
        if (ctx.block_statement().isEmpty()) {
            throw new MapleParseException(10100, ctx, "If");
        }
        String elseStmt = "\nELSE" + MapleUtils.parseFreeBlockBody(ctx.block_statement());
        return elseStmt;
    }
}
