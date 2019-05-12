package com.morgandev.app;

import com.morgandev.app.gen.MapleParser;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class BlockAction {

    private MapleCustomVisitor visitor;

    public BlockAction(MapleCustomVisitor visitor) {
        this.visitor = visitor;
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

    private String transactionAction(MapleParser.Maple_blockContext blockContext) {
//        String transactionStmt = "DROP PROCEDURE IF EXISTS `maple_temp_trans`;\n" +
//                "DELIMITER $$\n" +
//                "CREATE PROCEDURE `maple_temp_trans`()\n" +
//                "BEGIN\n" +
//                "    DECLARE EXIT HANDLER FOR SQLEXCEPTION\n" +
//                "    BEGIN\n" +
//                "        ROLLBACK;\n" +
//                "        RESIGNAL;\n" +
//                "    END;\n" +
//                "\n" +
//                "    START TRANSACTION;";
//        String mapleStmts = visitor.visit(blockContext.maple_stmt_list());
//        transactionStmt += mapleStmts;
//        transactionStmt += "IF fail_condition_meet THEN\n" +
//                "        SIGNAL SQLSTATE '45000';\n" +
//                "    END IF;\n" +
//                "    COMMIT; -- this will not be executed\n" +
//                "END$$\n" +
//                "DELIMITER ;\n" +
//                "CALL `maple_temp_trans`;\n" +
//                "DROP PROCEDURE IF EXISTS `maple_temp_trans`";
        return null;
    }

    private String prepareAction(MapleParser.Maple_blockContext blockContext) {
        String preparedStmt = "";
        visitor.setPreparedMode(true);
        List<MapleParser.Maple_stmtContext> stmtList = blockContext.maple_stmt_list().maple_stmt();
        if (stmtList.isEmpty()) {
            //TODO: return error
            return "";
        }
        if (stmtList.get(0).maple_block() != null) {
            //TODO: return error. Block not allowed here
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

}
