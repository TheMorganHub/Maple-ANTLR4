package com.morgandev.app.visitors;

import com.morgandev.app.gen.MapleParser;

public class DeleteVisitor extends AbstractMapleVisitor {
    private static DeleteVisitor ourInstance = new DeleteVisitor();

    public static DeleteVisitor getInstance() {
        return ourInstance;
    }

    private DeleteVisitor() {
    }

    @Override
    public String visitDelete_stmt(MapleParser.Delete_stmtContext ctx) {
        String tableName = ctx.table_name().getText();
        String deleteStmt = "";
        if (ctx.conditional() != null) {
            deleteStmt += "DELETE FROM " + tableName + visit(ctx.conditional());
        } else {
            deleteStmt += "TRUNCATE TABLE " + tableName;
        }
        return deleteStmt;
    }
}
