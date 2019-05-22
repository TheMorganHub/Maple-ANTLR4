package com.morgandev.app.blocks;

import com.morgandev.app.errorhandling.MapleParseException;
import com.morgandev.app.utils.MapleUtils;
import com.morgandev.app.visitors.BlockVisitor;
import com.morgandev.app.visitors.MapleMainVisitor;
import com.morgandev.app.gen.MapleParser;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class BlockAction {

    private MapleMainVisitor visitor;

    public BlockAction() {
        this.visitor = MapleMainVisitor.getInstance();
    }

    public String processAction(String actionName, MapleParser.Maple_blockContext blockContext) {
        Method method;
        try {
            method = getClass().getDeclaredMethod(actionName + "Action", MapleParser.Maple_blockContext.class);
            return (String) method.invoke(this, blockContext);
        } catch (InvocationTargetException e) {
            if (e.getCause() instanceof MapleParseException) {
                throw (MapleParseException) e.getCause();
            } else {
                throw new RuntimeException(e.getCause() != null ? e.getCause() : e);
            }
        } catch (SecurityException | NoSuchMethodException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private String procedureAction(MapleParser.Maple_blockContext blockContext) {
        if (blockContext.block_name() == null) {
            //TODO: return error
            return "";
        }
        String procedureStmt = "DELIMITER //\n CREATE PROCEDURE `" + blockContext.block_name().getText() + "`";
        String paramsStmt = "(" + visitor.visit(blockContext.block_params().block_params_declaration()) + ")";
        String procedureBody = "\nBEGIN" + MapleUtils.parseFreeBlockBody(blockContext.block_statement()) + "\nEND//\nDELIMITER ;";
        return procedureStmt + paramsStmt + procedureBody;
    }

    private String prepareAction(MapleParser.Maple_blockContext blockContext) {
        String preparedStmt = "";
        List<MapleParser.Block_statementContext> stmtList = blockContext.block_statement();
        if (stmtList.isEmpty()) {
            throw new MapleParseException(10100, blockContext, "Prepare");
        }
        if (stmtList.get(0).maple_block() != null) {
            throw new MapleParseException(10101, blockContext, "Prepare");
        }
        if (stmtList.size() > 1) {
            throw new MapleParseException(10102, blockContext, "Prepare", 1, stmtList.size());
        }
        MapleParser.Block_paramsContext paramsContext = blockContext.block_params();
        MapleParser.Block_params_expr_declarationContext paramsExprDeclarationContext = paramsContext != null ? blockContext.block_params().block_params_expr_declaration() : null;
        if (paramsContext == null || paramsExprDeclarationContext == null) {
            throw new MapleParseException(10105, blockContext, "Prepare");
        }

        preparedStmt += "PREPARE stmt1 FROM '" + BlockVisitor.getInstance().visitStatementAsPrepared(stmtList.get(0)) + "';";

        String assignments = "";
        String executeStmt = "\nEXECUTE stmt1 USING ";
        String deallocateStmt = "\nDEALLOCATE PREPARE stmt1";
        List<MapleParser.ExprContext> paramsExpressions = paramsExprDeclarationContext.expr();
        for (int i = 0; i < paramsExpressions.size(); i++) {
            String valName = "@val" + (i + 1);
            assignments += "\nSET " + valName + " =" + visitor.visit(paramsExpressions.get(i)) + ";";
            executeStmt += (i == 0 ? "" : ", ") + valName;
        }
        executeStmt += ";";
        preparedStmt += assignments + executeStmt + deallocateStmt;

        return preparedStmt;
    }

    private String whileAction(MapleParser.Maple_blockContext blockContext) {
        String whileStmt = "WHILE";
        MapleParser.Block_paramsContext blockParams = blockContext.block_params();
        MapleParser.Block_params_expr_declarationContext blockParamsExprDeclaration = blockParams != null ? blockParams.block_params_expr_declaration() : null;
        if (blockParams == null || blockParamsExprDeclaration == null) {
            throw new MapleParseException(10104, blockContext, "While");
        }
        MapleParser.Block_params_expr_declarationContext paramsExprDeclarationContext = blockContext.block_params().block_params_expr_declaration();
        whileStmt += " " + visitor.visit(paramsExprDeclarationContext) + " DO" + MapleUtils.parseFreeBlockBody(blockContext.block_statement()) + "\nEND WHILE";
        return whileStmt;
    }

    private String testAction(MapleParser.Maple_blockContext blockContext) {
        return MapleUtils.parseFreeBlockBody(blockContext.block_statement());
    }



}
