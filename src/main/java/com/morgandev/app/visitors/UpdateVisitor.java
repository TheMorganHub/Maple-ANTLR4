package com.morgandev.app.visitors;

import com.morgandev.app.errorhandling.MapleParseException;
import com.morgandev.app.gen.MapleParser;

import java.util.List;

public class UpdateVisitor extends AbstractMapleVisitor {
    private static UpdateVisitor ourInstance = new UpdateVisitor();

    public static UpdateVisitor getInstance() {
        return ourInstance;
    }

    private UpdateVisitor() {
    }

    @Override
    public String visitUpdate_stmt(MapleParser.Update_stmtContext ctx) {
        StringBuilder updateStmt = new StringBuilder("UPDATE `" + (ctx.table_name().getText()) + "` SET ");
        List<MapleParser.Column_nameContext> columnNameContexts = ctx.column_name();
        List<MapleParser.ExprContext> exprContexts = ctx.update_value_set().expr();
        if (exprContexts.size() != columnNameContexts.size()) {
            throw new MapleParseException(10200, ctx);
        }
        int columnCount = 0;
        for (MapleParser.Column_nameContext columnNameCtx : columnNameContexts) {
            updateStmt.append(columnCount == 0 ? "" : ", ").append("`").append(columnNameCtx.getText()).append("`").append(" =").append(visit(exprContexts.get(columnCount)));
            columnCount++;
        }
        if (ctx.conditional() != null) {
            updateStmt.append(" ").append(visit(ctx.conditional()));
        }
        return updateStmt.toString();
    }
}
