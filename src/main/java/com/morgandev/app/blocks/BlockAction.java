package com.morgandev.app.blocks;

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
        } catch (SecurityException | NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            return null;
        }
    }

    private String procedureAction(MapleParser.Maple_blockContext blockContext) {
        if (blockContext.block_name() == null) {
            //TODO: return error
            return "";
        }
        String procedureStmt = "DELIMITER //\n CREATE PROCEDURE `" + blockContext.block_name().getText() + "`";
        String paramsStmt = "(" + visitor.visit(blockContext.block_params().block_params_declaration()) + ")";
        String procedureBody = "\nBEGIN" + parseFreeBlockBody(blockContext) + "\nEND//\nDELIMITER ;";
        return procedureStmt + paramsStmt + procedureBody;
    }

    private String prepareAction(MapleParser.Maple_blockContext blockContext) {
        String preparedStmt = "";
        visitor.setPreparedMode(true);
        List<MapleParser.Block_statementContext> stmtList = blockContext.block_statement();
        if (stmtList.isEmpty()) {
            //TODO: return error
            return "";
        }
        if (stmtList.get(0).maple_block() != null) {
            //TODO: return error. Block not allowed here
            return "";
        }
        if (stmtList.size() > 1) {
            //TODO: return error. Only one statement allowed
            return "";
        }
        preparedStmt += "PREPARE stmt1 FROM '" + visitor.visit(stmtList.get(0)) + "';";
        List<String> literals = visitor.getLiterals();
        if (literals == null || literals.isEmpty()) {
            //TODO: return error
            return "";
        }
        String assignments = "";
        String executeStmt = "\nEXECUTE stmt1 USING ";
        String deallocateStmt = "\nDEALLOCATE PREPARE stmt1";
        for (int i = 0; i < literals.size(); i++) {
            String valName = "@val" + i;
            assignments += "\nSET " + valName + " = " + literals.get(i) + ";";
            executeStmt += (i == 0 ? "" : ", ") + valName;
        }
        executeStmt += ";";
        preparedStmt += assignments + executeStmt + deallocateStmt;

        visitor.setPreparedMode(false);
        return preparedStmt;
    }

    private String whileAction(MapleParser.Maple_blockContext blockContext) {
        String whileStmt = "WHILE";
        if (blockContext.block_params() != null) {
            //TODO: return error. WHILE needs condition
        }
        MapleParser.Block_params_expr_declarationContext paramsExprDeclarationContext = blockContext.block_params().block_params_expr_declaration();
        whileStmt += visitor.visit(paramsExprDeclarationContext) + " DO" + parseFreeBlockBody(blockContext) + "\nEND WHILE";
        return whileStmt;
    }

    private String testAction(MapleParser.Maple_blockContext blockContext) {
        return parseFreeBlockBody(blockContext);
    }

    private String parseFreeBlockBody(MapleParser.Maple_blockContext blockContext) {
        String freeStmt = "";
        List<MapleParser.Block_statementContext> blockStmtContext = blockContext.block_statement();
        for (int i = 0; i < blockStmtContext.size(); i++) {
            freeStmt += (i == 0 ? "" : ";") + "\n" + visitor.visit(blockStmtContext.get(i));
        }
        return freeStmt.endsWith(";") ? freeStmt : freeStmt + ";";
    }

}
