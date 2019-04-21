package com.morgandev.app;

import com.morgandev.app.gen.SQLiteBaseVisitor;
import com.morgandev.app.gen.SQLiteParser;

import java.util.ArrayList;
import java.util.List;

public class CustomVisitor extends SQLiteBaseVisitor<String> {

    @Override
    public String visitSelect_or_values(SQLiteParser.Select_or_valuesContext ctx) {
        List<SQLiteParser.Table_or_subqueryContext> tableContexts = ctx.table_or_subquery();
        List<String> tableNames = new ArrayList<>();
        for (SQLiteParser.Table_or_subqueryContext t : tableContexts) {
            tableNames.add(visit(t));
        }
        List<SQLiteParser.Result_columnContext> columnsContexts = ctx.result_column();
        List<String> columnNames = new ArrayList<>();
        for (SQLiteParser.Result_columnContext c : columnsContexts) {
            columnNames.add(visit(c));
        }
        return "";
    }

    @Override
    public String visitResult_column(SQLiteParser.Result_columnContext ctx) {
        return ctx.expr().column_name().getText();
    }

    @Override
    public String visitTable_or_subquery(SQLiteParser.Table_or_subqueryContext ctx) {
        return ctx.table_name().getText();
    }
}
