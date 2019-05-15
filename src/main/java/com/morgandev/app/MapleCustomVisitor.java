package com.morgandev.app;

import com.morgandev.app.gen.MapleBaseVisitor;
import com.morgandev.app.gen.MapleParser;
import org.antlr.v4.runtime.misc.Interval;

import java.util.ArrayList;
import java.util.List;

public class MapleCustomVisitor extends MapleBaseVisitor<String> {

    private boolean preparedMode;
    private List<String> literals;

    /**
     * If prepared mode is enabled, the Maple engine will replace all literals it encounters with a '?' and store them
     * in order in a list for processing at a later time. This mode is necessary for prepared blocks.
     *
     * @param flag
     */
    public void setPreparedMode(boolean flag) {
        this.preparedMode = flag;
        literals = !flag ? null : new ArrayList<>();
    }

    public List<String> getLiterals() {
        return literals;
    }

    @Override
    public String visitParse(MapleParser.ParseContext ctx) {
        return visit(ctx.maple_stmt_list());
    }

    @Override
    public String visitMaple_stmt_list(MapleParser.Maple_stmt_listContext ctx) {
        String mapleStmts = "";
        List<MapleParser.Maple_stmtContext> mapleStmtsContexts = ctx.maple_stmt();
        for (MapleParser.Maple_stmtContext mapleStmtCtx : mapleStmtsContexts) {
            String mapleStmt = visit(mapleStmtCtx);
            mapleStmts += mapleStmt + (mapleStmt.endsWith(";") ? "" : ";") + "\n";
        }
        return mapleStmts;
    }

    @Override
    public String visitMaple_block(MapleParser.Maple_blockContext ctx) {
        String actionName = ctx.block_action_name().getText();
        BlockAction action = new BlockAction(this);
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
    public String visitBlock_datatype_param(MapleParser.Block_datatype_paramContext ctx) {
        return ctx.any_name().getText() + " " + visit(ctx.parameter_type());
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
    public String visitData_type(MapleParser.Data_typeContext ctx) {
        String dataTypeName = ctx.any_name().getText();
        StringBuilder dataTypeLength = new StringBuilder();
        List<MapleParser.Signed_numberContext> signedNumberContexts = ctx.signed_number();
        if (signedNumberContexts.isEmpty()) {
            switch (dataTypeName) {
                case "varchar":
                    dataTypeLength = new StringBuilder("255");
                    break;
                case "int":
                    dataTypeLength = new StringBuilder("11");
                    break;
                case "double":
                case "decimal":
                case "float":
                    dataTypeLength = new StringBuilder("10, 2");
                    break;
            }
        } else {
            int numbers = 0;
            for (MapleParser.Signed_numberContext numberContext : signedNumberContexts) {
                dataTypeLength.append(numbers == 0 ? "" : ", ").append(numberContext.getText());
                numbers++;
            }
        }
        return dataTypeName + (dataTypeLength.length() == 0 ? "" : "(" + dataTypeLength + ")");
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
    public String visitEmbedded_sql(MapleParser.Embedded_sqlContext ctx) {
        return visit(ctx.any_stmt());
    }

    @Override
    public String visitAny_stmt(MapleParser.Any_stmtContext ctx) {
        int startIndex = ctx.start.getStartIndex();
        int stopIndex = ctx.stop.getStopIndex();
        Interval interval = new Interval(startIndex, stopIndex);
        return ctx.start.getInputStream().getText(interval);
    }

    @Override
    public String visitUpdate_stmt(MapleParser.Update_stmtContext ctx) {
        StringBuilder updateStmt = new StringBuilder("UPDATE `" + (ctx.table_name().getText()) + "` SET ");
        List<MapleParser.Column_nameContext> columnNameContexts = ctx.column_name();
        List<MapleParser.ExprContext> exprContexts = ctx.update_value_set().expr();
        if (exprContexts.size() != columnNameContexts.size()) {
            //TODO: ERROR hay más valores que columnas o viceversa
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

    @Override
    public String visitBlock_statement(MapleParser.Block_statementContext ctx) {
        if (ctx.variable_stmt() != null) {
            return visit(ctx.variable_stmt());
        }
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
    public String visitInsert_stmt(MapleParser.Insert_stmtContext ctx) {
        StringBuilder insertStmt = new StringBuilder("INSERT INTO `" + (ctx.table_name().getText()) + "`");
        if (ctx.select_stmt() != null) {
            insertStmt.append("\n").append(visit(ctx.select_stmt()));
            return insertStmt.toString();
        }
        if (!ctx.column_name().isEmpty()) {
            List<MapleParser.Column_nameContext> columnNameContexts = ctx.column_name();
            int columns = 0;
            insertStmt.append("(");
            for (MapleParser.Column_nameContext columnNameCtx : columnNameContexts) {
                insertStmt.append(columns == 0 ? "" : ", ").append("`").append(columnNameCtx.getText()).append("`");
                columns++;
            }
            insertStmt.append(")");
        }

        insertStmt.append(" VALUES");
        List<MapleParser.Insert_value_setContext> valueSetsContexts = ctx.insert_value_set();
        int valueSets = 0;
        for (MapleParser.Insert_value_setContext valueSetCtx : valueSetsContexts) {
            insertStmt.append(valueSets == 0 ? "" : ", ").append(visit(valueSetCtx));
            valueSets++;
        }
        return insertStmt.toString();
    }

    @Override
    public String visitInsert_value_set(MapleParser.Insert_value_setContext ctx) {
        StringBuilder valueSet = new StringBuilder("(");
        int expressions = 0;
        for (MapleParser.ExprContext exprCtx : ctx.expr()) {
            valueSet.append(expressions == 0 ? "" : ", ").append(visit(exprCtx).trim());
            expressions++;
        }
        return valueSet.append(")").toString();
    }

    @Override
    public String visitVariable_declaration_stmt(MapleParser.Variable_declaration_stmtContext ctx) {
        String variableName = ctx.any_name().getText();
        String assignmentStmt = "DECLARE " + variableName + visit(ctx.variable_type()) + (ctx.expr() != null ? " DEFAULT" + visit(ctx.expr()) : "");
        return assignmentStmt;
    }

    @Override
    public String visitVariable_assignment_stmt(MapleParser.Variable_assignment_stmtContext ctx) {
        return "SET " + ctx.any_name().getText() + " =" + visit(ctx.expr());
    }

    @Override
    public String visitVariable_type(MapleParser.Variable_typeContext ctx) {
        switch (ctx.getText().toLowerCase()) {
            case "string":
                return " VARCHAR(255)";
            case "int":
                return " INT";
            case "uint":
                return " INT UNSIGNED";
        }
        return ctx.getText();
    }

    @Override
    public String visitVariable_inc_dec_stmt(MapleParser.Variable_inc_dec_stmtContext ctx) {
        String incStmt = "";
        String variableName = ctx.any_name().getText();
        switch (ctx.op.getText()) {
            case "++":
                incStmt += variableName + " + 1";
                break;
            case "--":
                incStmt += variableName + " - 1";
                break;
            case "+=":
                incStmt += variableName + " + " + visit(ctx.literal_value());
                break;
            case "-=":
                incStmt += variableName + " - " + visit(ctx.literal_value());
                break;
        }
        return "SET " + variableName + " = " + incStmt;
    }

    @Override
    public String visitPrint_stmt(MapleParser.Print_stmtContext ctx) {
        return "SELECT" + visit(ctx.expr());
    }

    @Override
    public String visitCreate_table_stmt(MapleParser.Create_table_stmtContext ctx) {
        String newTableName = ctx.table_name().getText();
        List<MapleParser.Column_defContext> columnDefContexts = ctx.column_def();
        List<MapleParser.Fk_column_defContext> fkColumnDefContexts = new ArrayList<>();
        StringBuilder columnDefinitionsStmt = new StringBuilder();
        int definitions = 0;
        for (MapleParser.Column_defContext columnDefCtx : columnDefContexts) {
            if (columnDefCtx.fk_column_def() != null) {
                fkColumnDefContexts.add(columnDefCtx.fk_column_def());
            }
            columnDefinitionsStmt.append(definitions == 0 ? "" : ",\n").append(visit(columnDefCtx));
            definitions++;
        }

        List<String> pkColumns = processPks(columnDefContexts);
        String fkConstraints = processFkCreateTableConstraints(newTableName, fkColumnDefContexts);
        if (!pkColumns.isEmpty()) {
            StringBuilder pkStmt = new StringBuilder(",\nPRIMARY KEY(");
            int pks = 0;
            for (String pkColumnName : pkColumns) {
                pkStmt.append(pks == 0 ? "" : ",").append("`").append(pkColumnName).append("`");
                pks++;
            }
            pkStmt.append(")");
            columnDefinitionsStmt.append(pkStmt);
        } else {
            columnDefinitionsStmt.insert(0, "`id` int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY" + (columnDefinitionsStmt.length() == 0 ? "" : ",\n"));
        }
        columnDefinitionsStmt.append(fkConstraints);
        return "CREATE TABLE `" + newTableName + "` (\n" + columnDefinitionsStmt.toString() + "\n)";
    }

    public List<String> processPks(List<MapleParser.Column_defContext> columnDefContexts) {
        List<String> pks = new ArrayList<>();
        for (MapleParser.Column_defContext columnCtx : columnDefContexts) {
            if (columnCtx.standard_column_def() == null) {
                continue;
            }
            if (columnCtx.standard_column_def().column_modifier() != null && "$".equals(columnCtx.standard_column_def().column_modifier().getText())) {
                pks.add(columnCtx.standard_column_def().column_name().getText());
            }
        }
        return pks;
    }

    public String processFkCreateTableConstraints(String tableName, List<MapleParser.Fk_column_defContext> fkColumnContexts) {
        if (fkColumnContexts.isEmpty()) {
            return "";
        }
        String constraintDeclaration = "";
        for (MapleParser.Fk_column_defContext fkColumnContext : fkColumnContexts) {
            String referencedTable = fkColumnContext.column_name().getText();
            String fkColumnName = referencedTable + "_id";
            constraintDeclaration += ",\nCONSTRAINT `fk_" + tableName + "_" + referencedTable + " FOREIGN KEY " +
                    "(`" + fkColumnName + "`) REFERENCES `" + referencedTable + "` (`id`)"
                    + (fkColumnContext.fk_constraint() != null ? visit(fkColumnContext.fk_constraint()) : " ON DELETE CASCADE ON UPDATE CASCADE");
        }
        return constraintDeclaration;
    }

    @Override
    public String visitColumn_def(MapleParser.Column_defContext ctx) {
        if (ctx.standard_column_def() != null) {
            return visit(ctx.standard_column_def());
        }

        if (ctx.fk_column_def() != null) {
            return visit(ctx.fk_column_def());
        }
        return "";
    }

    @Override
    public String visitStandard_column_def(MapleParser.Standard_column_defContext ctx) {
        String columnName = "`" + ctx.column_name().getText() + "`";
        String type = " " + visit(ctx.column_type());
        String nullable = ctx.column_modifier() != null && ctx.column_modifier().getText().equals("?") ? "" : " NOT NULL";
        String defaultVal = ctx.default_value() != null ? visit(ctx.default_value()) : "";
        return columnName + type + nullable + defaultVal;
    }

    @Override
    public String visitDefault_value(MapleParser.Default_valueContext ctx) {
        return " DEFAULT " + ctx.getText();
    }

    @Override
    public String visitFk_column_def(MapleParser.Fk_column_defContext ctx) {
        return "`" + ctx.column_name().getText() + "_id` int(11) NOT NULL" + (ctx.default_value() != null ? visit(ctx.default_value()) : "");
    }

    @Override
    public String visitFk_constraint(MapleParser.Fk_constraintContext ctx) {
        return " " + visit(ctx.any_stmt());
    }

    @Override
    public String visitSelect_stmt(MapleParser.Select_stmtContext ctx) {
        String tableName = visit(ctx.table_name());
        String tableAlias = ctx.table_alias() == null ? "" : ctx.table_alias().getText();
        List<MapleParser.Result_columnContext> columnContexts = ctx.result_column();
        StringBuilder selectStmt = new StringBuilder("SELECT");
        if (columnContexts.isEmpty()) {
            selectStmt.append(" *");
        } else {
            int columnCount = 0;
            for (MapleParser.Result_columnContext columnCtx : columnContexts) {
                selectStmt.append(columnCount == 0 ? "" : ",").append(visit(columnCtx));
                columnCount++;
            }
        }

        selectStmt.append(" FROM").append(" ").append("`").append(tableName).append("`").append(tableAlias.isEmpty() ? "" : " " + tableAlias);

        selectStmt.append(processExplicitJoins(ctx.join_stmt()));
        selectStmt.append(processImplicitJoins(columnContexts, tableName, tableAlias));

        MapleParser.ConditionalContext conditionalContext = ctx.conditional();
        if (conditionalContext != null) {
            selectStmt.append(visit(conditionalContext));
        }
        return selectStmt.toString();
    }

    public String processExplicitJoins(List<MapleParser.Join_stmtContext> joinContexts) {
        if (joinContexts.isEmpty()) {
            return "";
        }

        StringBuilder joinStmts = new StringBuilder();
        for (MapleParser.Join_stmtContext joinCtx : joinContexts) {
            joinStmts.append("\n").append(visit(joinCtx));
        }
        return joinStmts.toString();
    }

    public String processImplicitJoins(List<MapleParser.Result_columnContext> resultColumnContexts, String mainTableName, String mainTableAlias) {
        if (resultColumnContexts.isEmpty()) {
            return "";
        }
        String innerJoins = "";
        List<String> tableJoins = new ArrayList<>();
        List<String> tableAliases = new ArrayList<>();
        for (MapleParser.Result_columnContext resultColumn : resultColumnContexts) {
            if (resultColumn.expr().table_name() == null) {
                continue;
            }

            String tableName = resultColumn.expr().table_name().getText();
            if (!tableName.equals(mainTableName)
                    && !tableName.equals(mainTableAlias)
                    && !tableJoins.contains(tableName)
                    && !tableAliases.contains(tableName)) {
                tableJoins.add(tableName);
                String tableAlias = Utils.createTableAlias(tableName);
                tableAliases.add(tableAlias);
                innerJoins += "\nJOIN `" + tableName + "`" + (tableAlias.equals("") ? "" : " " + tableAlias) + " ON id_" + tableName + " = " + (tableAlias.equals("") ? tableName : tableAlias) + ".id";
            }
        }

        return innerJoins;
    }

    @Override
    public String visitResult_column(MapleParser.Result_columnContext ctx) {
        return visit(ctx.expr()) + (ctx.column_alias() != null ? " " + ctx.column_alias().getText() : "");
    }

    @Override
    public String visitJoin_stmt(MapleParser.Join_stmtContext ctx) {
        String join = (ctx.left != null ? "LEFT JOIN" : ctx.right != null ? "RIGHT JOIN" : "INNER JOIN");

        MapleParser.Select_stmtContext selectStmtCtx = ctx.select_stmt();

        if (ctx.table_name() != null) {
            join += " `" + ctx.table_name().getText() + "`";
        }

        if (selectStmtCtx != null) {
            join += " (" + visit(selectStmtCtx) + ")";
        }

        if (ctx.table_alias() != null) {
            join += " " + ctx.table_alias().getText();
        }

        if (ctx.join_constraint() != null) {
            join += visit(ctx.join_constraint());
        }

        return join;
    }

    @Override
    public String visitJoin_constraint(MapleParser.Join_constraintContext ctx) {
        return " ON" + visit(ctx.expr());
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
        if (preparedMode) {
            literals.add(ctx.getText());
        }
        return (preparedMode ? "?" : ctx.getText());
    }

    @Override
    public String visitExpr(MapleParser.ExprContext ctx) {
        if (ctx.select_stmt() != null) {
            return " (" + visit(ctx.select_stmt()) + ")";
        }
        if (ctx.function() != null) {
            return " " + visit(ctx.function());
        }
        if (ctx.database_name() != null || ctx.table_name() != null || ctx.column_name() != null) {
            MapleParser.Database_nameContext databaseName = ctx.database_name();
            MapleParser.Table_nameContext tableName = ctx.table_name();
            MapleParser.Column_nameContext columnName = ctx.column_name();

            return " " + (databaseName != null ? databaseName.getText() + "." : "")
                    + (tableName != null ? tableName.getText() + "." : "")
                    + (columnName != null ? columnName.getText() : "");
        }
        if (ctx.literal_value() != null) {
            return " " + visit(ctx.literal_value());
        }

        //an expression enclosed in parentheses would fall into this category
        if (ctx.left == null && ctx.right == null && ctx.operator == null) {
            return " (" + visit(ctx.expr(0)).trim() + ")";
        }

        return (ctx.left != null ? visit(ctx.left) : ctx.getText()) + (ctx.operator != null ? " " + ctx.operator.getText() + "" : "") + (ctx.right != null ? visit(ctx.right) : "");
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
