package com.morgandev.app.blocks;

import com.morgandev.app.errorhandling.MapleParseException;
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
        String procedureBody = "\nBEGIN" + parseFreeBlockBody(blockContext) + "\nEND//\nDELIMITER ;";
        return procedureStmt + paramsStmt + procedureBody;
    }

    private String prepareAction(MapleParser.Maple_blockContext blockContext) {
        String preparedStmt = "";
        visitor.setPreparedMode(true);
        List<MapleParser.Block_statementContext> stmtList = blockContext.block_statement();
        if (stmtList.isEmpty()) {
            throw new MapleParseException(10100);
        }
        if (stmtList.get(0).maple_block() != null) {
            throw new MapleParseException(10101, blockContext, "Prepare");
        }
        if (stmtList.size() > 1) {
            throw new MapleParseException(10102, blockContext, "Prepare", 1, stmtList.size());
        }
        preparedStmt += "PREPARE stmt1 FROM '" + visitor.visit(stmtList.get(0)) + "';";
        List<String> literals = visitor.getLiterals();
        if (literals == null || literals.isEmpty()) {
            throw new MapleParseException(10103);
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
            throw new MapleParseException(10104, blockContext, "While");
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
