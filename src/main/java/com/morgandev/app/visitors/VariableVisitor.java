package com.morgandev.app.visitors;

import com.morgandev.app.gen.MapleParser;

import java.util.List;

public class VariableVisitor extends AbstractMapleVisitor {
    private static VariableVisitor ourInstance = new VariableVisitor();

    public static VariableVisitor getInstance() {
        return ourInstance;
    }

    private VariableVisitor() {
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
    public String visitVariable_assignment_stmt(MapleParser.Variable_assignment_stmtContext ctx) {
        return "SET " + ctx.any_name().getText() + " =" + visit(ctx.expr());
    }

    @Override
    public String visitVariable_declaration_stmt(MapleParser.Variable_declaration_stmtContext ctx) {
        String variableName = ctx.any_name().getText();
        String assignmentStmt = "DECLARE " + variableName + visit(ctx.variable_type()) + (ctx.expr() != null ? " DEFAULT" + visit(ctx.expr()) : "");
        return assignmentStmt;
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
}
