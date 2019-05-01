package com.morgandev.app;

import com.morgandev.app.gen.MapleBaseVisitor;
import com.morgandev.app.gen.MapleParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.misc.Interval;

import java.util.ArrayList;
import java.util.List;

public class MapleCustomVisitor extends MapleBaseVisitor<String> {

    private String lastVisitedTable;
    private String currentTable;
    private String lastTableAlias;
    private String currentTableAlias;

    @Override
    public String visitParse(MapleParser.ParseContext ctx) {
        return visit(ctx.maple_stmt_list(0));
    }

    @Override
    public String visitMaple_stmt_list(MapleParser.Maple_stmt_listContext ctx) {
        StringBuilder mapleStmts = new StringBuilder();
        List<MapleParser.Maple_stmtContext> mapleStmtsContexts = ctx.maple_stmt();
        for (MapleParser.Maple_stmtContext mapleStmtCtx : mapleStmtsContexts) {
            mapleStmts.append(visit(mapleStmtCtx)).append(";\n");
        }
        return mapleStmts.toString();
    }

    @Override
    public String visitEmbedded_sql(MapleParser.Embedded_sqlContext ctx) {
        CharStream cs = ctx.start.getTokenSource().getInputStream();
        return cs.getText(new Interval(ctx.start.getStopIndex() + 1, ctx.stop.getStartIndex() - 1));
    }

    @Override
    public String visitMaple_stmt(MapleParser.Maple_stmtContext ctx) {
        MapleParser.Select_stmtContext select_stmtContext = ctx.select_stmt();
        MapleParser.Create_table_stmtContext create_table_stmtContext = ctx.create_table_stmt();
        MapleParser.Embedded_sqlContext embeddedSqlCtx = ctx.embedded_sql();
        if (select_stmtContext != null) {
            return visit(select_stmtContext);
        } else if (embeddedSqlCtx != null) {
            return visit(embeddedSqlCtx);
        } else if (create_table_stmtContext != null) {
            return visit(create_table_stmtContext);
        }
        return "";
    }

    @Override
    public String visitCreate_table_stmt(MapleParser.Create_table_stmtContext ctx) {
        String newTableName = ctx.table_name().getText();
        List<MapleParser.Column_defContext> columnDefContexts = ctx.column_def();
        StringBuilder columnDefinitionsStmt = new StringBuilder();
        int definitions = 0;
        List<String> pkColumns = new ArrayList<>();
        for (MapleParser.Column_defContext columnDefCtx : columnDefContexts) {
            columnDefinitionsStmt.append(definitions == 0 ? "" : ",\n").append(visit(columnDefCtx));
            if (columnDefCtx.column_modifier() != null) {
                switch (columnDefCtx.column_modifier().getText()) {
                    case "$":
                        pkColumns.add(columnDefCtx.column_name().getText());
                        break;
                }
            } else {
                columnDefinitionsStmt.append(" NOT NULL ");
            }
            String defaultVal = columnDefCtx.default_value() != null ? "DEFAULT " + columnDefCtx.default_value().getText() : "";
            columnDefinitionsStmt.append(defaultVal);
            definitions++;
        }

        if (!pkColumns.isEmpty()) {
            StringBuilder pkStmt = new StringBuilder(",\nPRIMARY KEY(");
            int pks = 0;
            for (String pkColumnName : pkColumns) {
                pkStmt.append(pks == 0 ? "" : ",").append("`").append(pkColumnName).append("`");
                pks++;
            }
            pkStmt.append(")\n");
            columnDefinitionsStmt.append(pkStmt);
        } else {
            columnDefinitionsStmt.insert(0, "`id` int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY" + (columnDefinitionsStmt.length() == 0 ? "" : ",\n"));
        }
        return "CREATE TABLE `" + newTableName + "` (\n" + columnDefinitionsStmt.toString() + "\n)";
    }

    @Override
    public String visitColumn_def(MapleParser.Column_defContext ctx) {
        String columnName = "`" + ctx.column_name().getText() + "`";
        String type = " " + visit(ctx.column_type());
        return columnName + type;
    }

    @Override
    public String visitColumn_type(MapleParser.Column_typeContext ctx) {
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
                    dataTypeLength = new StringBuilder("10,2");
                    break;
            }
        } else {
            int numbers = 0;
            for (MapleParser.Signed_numberContext numberContext : signedNumberContexts) {
                dataTypeLength.append(numbers == 0 ? "" : ",").append(numberContext.getText());
                numbers++;
            }
        }
        return dataTypeName + (dataTypeLength.length() == 0 ? "" : "(" + dataTypeLength + ")");
    }

    @Override
    public String visitSelect_stmt(MapleParser.Select_stmtContext ctx) {
        String tableName = visit(ctx.table_name());
        String tableAlias = ctx.table_alias() == null ? "" : ctx.table_alias().getText();
        List<MapleParser.Result_columnContext> columnContexts = ctx.result_column();
        StringBuilder selectStmt = new StringBuilder("SELECT ");
        if (columnContexts.isEmpty()) {
            selectStmt.append("*");
        } else {
            int columnCount = 0;
            for (MapleParser.Result_columnContext columnCtx : columnContexts) {
                selectStmt.append(columnCount == 0 ? "" : ", ").append(visit(columnCtx));
                columnCount++;
            }
        }

        selectStmt.append(" FROM ").append(tableName).append(" ").append(tableAlias.isEmpty() ? "" : tableAlias + " ");

        List<MapleParser.Join_stmtContext> joinContexts = ctx.join_stmt();
        for (MapleParser.Join_stmtContext joinCtx : joinContexts) {
            selectStmt.append(visit(joinCtx));
        }

        MapleParser.ConditionalContext conditionalContext = ctx.conditional();
        if (conditionalContext != null) {
            selectStmt.append(visit(conditionalContext));
        }
        return selectStmt.toString();
    }

    @Override
    public String visitResult_column(MapleParser.Result_columnContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public String visitJoin_stmt(MapleParser.Join_stmtContext ctx) {
        String join = " INNER JOIN ";
        MapleParser.Table_nameContext tableName = ctx.table_name();
        MapleParser.Table_aliasContext tableAlias = ctx.table_alias();
        String tableNameAndAlias = "";
        if (tableName != null) {
            tableNameAndAlias += visit(tableName);
        }

        if (tableAlias != null) {
            tableNameAndAlias += " " + visit(tableAlias);
        }

        if (!tableNameAndAlias.isEmpty()) {
            join += tableNameAndAlias;
        }
        MapleParser.Select_stmtContext selectStmtCtx = ctx.select_stmt();
        if (selectStmtCtx != null) {
            join += "(" + visit(selectStmtCtx) + ") ";
        }

        join += " ON " + lastVisitedTable + ".id_" + currentTable + " = " + currentTable + ".id ";

        return join;
    }

    @Override
    public String visitTable_name(MapleParser.Table_nameContext ctx) {
        String tableName = ctx.getText();
        lastVisitedTable = currentTable == null ? tableName : currentTable;
        currentTable = tableName;
        return tableName;
    }

    @Override
    public String visitTable_alias(MapleParser.Table_aliasContext ctx) {
        String tableAlias = ctx.getText();
        lastTableAlias = currentTableAlias == null ? tableAlias : currentTableAlias;
        currentTableAlias = tableAlias;
        return tableAlias;
    }

    @Override
    public String visitConditional(MapleParser.ConditionalContext ctx) {
        return "WHERE " + visit(ctx.expr());
    }

    @Override
    public String visitExpr(MapleParser.ExprContext ctx) {
        if (ctx.select_stmt() != null) {
            return "(" + visit(ctx.select_stmt()) + ")";
        }
        if (ctx.function() != null) {
            return visit(ctx.function());
        }
        if (ctx.database_name() != null || ctx.table_name() != null || ctx.column_name() != null) {
            MapleParser.Database_nameContext databaseName = ctx.database_name();
            MapleParser.Table_nameContext tableName = ctx.table_name();
            MapleParser.Column_nameContext columnName = ctx.column_name();

            return (databaseName != null ? databaseName.getText() + "." : "")
                    + (tableName != null ? tableName.getText() + "." : "")
                    + (columnName != null ? columnName.getText() : "");
        }
        if (ctx.literal_value() != null) {
            return ctx.literal_value().getText();
        }

        //an expression enclosed in parentheses would fall into this category
        if (ctx.left == null && ctx.right == null && ctx.operator == null) {
            return "(" + visit(ctx.expr(0)) + ")";
        }

        return (ctx.left != null ? visit(ctx.left) : ctx.getText()) + (ctx.operator != null ? " " + ctx.operator.getText() : "") + (ctx.right != null ? " " + visit(ctx.right) : "");
    }

    @Override
    public String visitFunction(MapleParser.FunctionContext ctx) {
        List<MapleParser.ExprContext> functionExprContexts = ctx.expr();
        StringBuilder func = new StringBuilder(ctx.function_name().getText()).append("(");
        int expressions = 0;
        for (MapleParser.ExprContext functionExprContext : functionExprContexts) {
            func.append(expressions == 0 ? "" : ", ").append(visit(functionExprContext));
            expressions++;
        }
        return func + ")";
    }

}
