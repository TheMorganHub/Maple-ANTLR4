package com.morgandev.app.visitors;

import com.morgandev.app.gen.MapleBaseVisitor;
import com.morgandev.app.gen.MapleParser;
import com.morgandev.app.errorhandling.MapleParseException;
import org.antlr.v4.runtime.misc.Interval;

import java.util.List;

public class MapleMainVisitor extends MapleBaseVisitor<String> {

    private static MapleMainVisitor ourInstance = new MapleMainVisitor();

    public static MapleMainVisitor getInstance() {
        return ourInstance;
    }

    private MapleMainVisitor() {
    }

    @Override
    public String visitParse(MapleParser.ParseContext ctx) {
        return visit(ctx.maple_stmt_list());
    }

    @Override
    public String visitMaple_stmt_list(MapleParser.Maple_stmt_listContext ctx) {
        String mapleStmts = "";
        List<MapleParser.Maple_stmtContext> mapleStmtsContexts = ctx.maple_stmt();
        if (mapleStmtsContexts.isEmpty()) {
            throw new MapleParseException(10002);
        }
        int count = 0;
        for (MapleParser.Maple_stmtContext mapleStmtCtx : mapleStmtsContexts) {
            String mapleStmt = visit(mapleStmtCtx);
            if (mapleStmt.isEmpty()) {
                continue;
            }
            mapleStmts += (count == 0 ? "" : "\n") + mapleStmt + (mapleStmt.endsWith(";") ? "" : ";");
            count++;
        }
        return mapleStmts;
    }

    @Override
    public String visitMaple_stmt(MapleParser.Maple_stmtContext ctx) {
        MapleParser.Select_stmtContext selectStmtContext;
        MapleParser.Create_table_stmtContext createTableStmtContext;
        MapleParser.Insert_stmtContext insertStmtContext;
        MapleParser.Embedded_sqlContext embeddedSqlContext;
        MapleParser.Update_stmtContext updateStmtContext;
        MapleParser.Delete_stmtContext deleteStmtContext;
        MapleParser.Maple_blockContext mapleBlockContext;

        if ((selectStmtContext = ctx.select_stmt()) != null) {
            return visit(selectStmtContext);
        }
        if ((createTableStmtContext = ctx.create_table_stmt()) != null) {
            return visit(createTableStmtContext);
        }
        if ((insertStmtContext = ctx.insert_stmt()) != null) {
            return visit(insertStmtContext);
        }
        if ((embeddedSqlContext = ctx.embedded_sql()) != null) {
            return visit(embeddedSqlContext);
        }
        if ((updateStmtContext = ctx.update_stmt()) != null) {
            return visit(updateStmtContext);
        }
        if ((deleteStmtContext = ctx.delete_stmt()) != null) {
            return visit(deleteStmtContext);
        }
        if ((mapleBlockContext = ctx.maple_block()) != null) {
            return visit(mapleBlockContext);
        }
        return "";
    }

    @Override
    public String visitMaple_block(MapleParser.Maple_blockContext ctx) {
        return BlockVisitor.getInstance().visitMaple_block(ctx);
    }

    @Override
    public String visitBlock_params_declaration(MapleParser.Block_params_declarationContext ctx) {
        return BlockVisitor.getInstance().visitBlock_params_declaration(ctx);
    }

    @Override
    public String visitBlock_datatype_param(MapleParser.Block_datatype_paramContext ctx) {
        return BlockVisitor.getInstance().visitBlock_datatype_param(ctx);
    }

    @Override
    public String visitBlock_params_expr_declaration(MapleParser.Block_params_expr_declarationContext ctx) {
        return BlockVisitor.getInstance().visitBlock_params_expr_declaration(ctx);
    }

    @Override
    public String visitBlock_statement(MapleParser.Block_statementContext ctx) {
        return BlockVisitor.getInstance().visitBlock_statement(ctx);
    }

    @Override
    public String visitPrepared_literal_value(MapleParser.Prepared_literal_valueContext ctx) {
        return BlockVisitor.getInstance().visitPrepared_literal_value(ctx);
    }

    @Override
    public String visitVariable_declaration_stmt(MapleParser.Variable_declaration_stmtContext ctx) {
        return VariableVisitor.getInstance().visitVariable_declaration_stmt(ctx);
    }

    @Override
    public String visitVariable_assignment_stmt(MapleParser.Variable_assignment_stmtContext ctx) {
        return VariableVisitor.getInstance().visitVariable_assignment_stmt(ctx);
    }

    @Override
    public String visitVariable_inc_dec_stmt(MapleParser.Variable_inc_dec_stmtContext ctx) {
        return VariableVisitor.getInstance().visitVariable_inc_dec_stmt(ctx);
    }

    @Override
    public String visitVariable_type(MapleParser.Variable_typeContext ctx) {
        return VariableVisitor.getInstance().visitVariable_type(ctx);
    }

    @Override
    public String visitData_type(MapleParser.Data_typeContext ctx) {
        return VariableVisitor.getInstance().visitData_type(ctx);
    }

    @Override
    public String visitUpdate_stmt(MapleParser.Update_stmtContext ctx) {
        return UpdateVisitor.getInstance().visitUpdate_stmt(ctx);
    }

    @Override
    public String visitDelete_stmt(MapleParser.Delete_stmtContext ctx) {
        return DeleteVisitor.getInstance().visitDelete_stmt(ctx);
    }

    @Override
    public String visitInsert_stmt(MapleParser.Insert_stmtContext ctx) {
        return InsertVisitor.getInstance().visitInsert_stmt(ctx);
    }

    @Override
    public String visitInsert_value_set(MapleParser.Insert_value_setContext ctx) {
        return InsertVisitor.getInstance().visitInsert_value_set(ctx);
    }

    @Override
    public String visitCreate_table_stmt(MapleParser.Create_table_stmtContext ctx) {
        return CreateTableVisitor.getInstance().visitCreate_table_stmt(ctx);
    }

    @Override
    public String visitColumn_def(MapleParser.Column_defContext ctx) {
        return CreateTableVisitor.getInstance().visitColumn_def(ctx);
    }

    @Override
    public String visitStandard_column_def(MapleParser.Standard_column_defContext ctx) {
        return CreateTableVisitor.getInstance().visitStandard_column_def(ctx);
    }

    @Override
    public String visitDefault_value(MapleParser.Default_valueContext ctx) {
        return CreateTableVisitor.getInstance().visitDefault_value(ctx);
    }

    @Override
    public String visitFk_column_def(MapleParser.Fk_column_defContext ctx) {
        return CreateTableVisitor.getInstance().visitFk_column_def(ctx);
    }

    @Override
    public String visitFk_constraint(MapleParser.Fk_constraintContext ctx) {
        return CreateTableVisitor.getInstance().visitFk_constraint(ctx);
    }

    @Override
    public String visitSelect_stmt(MapleParser.Select_stmtContext ctx) {
        return SelectVisitor.getInstance().visitSelect_stmt(ctx);
    }

    @Override
    public String visitResult_column(MapleParser.Result_columnContext ctx) {
        return SelectVisitor.getInstance().visitResult_column(ctx);
    }

    @Override
    public String visitJoin_stmt(MapleParser.Join_stmtContext ctx) {
        return JoinVisitor.getInstance().visitJoin_stmt(ctx);
    }

    @Override
    public String visitJoin_constraint(MapleParser.Join_constraintContext ctx) {
        return JoinVisitor.getInstance().visitJoin_constraint(ctx);
    }

    @Override
    public String visitFunction(MapleParser.FunctionContext ctx) {
        return FunctionVisitor.getInstance().visitFunction(ctx);
    }

    @Override
    public String visitPrint_stmt(MapleParser.Print_stmtContext ctx) {
        return UtilityVisitor.getInstance().visitPrint_stmt(ctx);
    }

    @Override
    public String visitExpr(MapleParser.ExprContext ctx) {
        return ExpressionVisitor.getInstance().visitExpr(ctx);
    }

    @Override
    public String visitEmbedded_sql(MapleParser.Embedded_sqlContext ctx) {
        return visit(ctx.any_stmt());
    }

    @Override
    public String visitTable_name(MapleParser.Table_nameContext ctx) {
        String tableName = ctx.getText();
        return tableName;
    }

    @Override
    public String visitTable_alias(MapleParser.Table_aliasContext ctx) {
        String tableAlias = ctx.getText();
        return tableAlias;
    }

    @Override
    public String visitConditional(MapleParser.ConditionalContext ctx) {
        return " WHERE" + visit(ctx.expr());
    }

    @Override
    public String visitLiteral_value(MapleParser.Literal_valueContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitAny_stmt(MapleParser.Any_stmtContext ctx) {
        if (ctx.getText().isEmpty()) {
            return "";
        }
        int startIndex = ctx.start.getStartIndex();
        int stopIndex = ctx.stop.getStopIndex();
        Interval interval = new Interval(startIndex, stopIndex);
        return ctx.start.getInputStream().getText(interval);
    }

}
