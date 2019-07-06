package com.morgandev.app.visitors;

import com.morgandev.app.gen.MapleParser;

import java.util.ArrayList;
import java.util.List;

public class CreateTableVisitor extends AbstractMapleVisitor {

    private static CreateTableVisitor ourInstance = new CreateTableVisitor();

    public static CreateTableVisitor getInstance() {
        return ourInstance;
    }

    private CreateTableVisitor() {
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
            constraintDeclaration += ",\nCONSTRAINT `fk_" + tableName + "_" + referencedTable + "` FOREIGN KEY " +
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
    public String visitFk_column_def(MapleParser.Fk_column_defContext ctx) {
        return "`" + ctx.column_name().getText() + "_id` int(11) NOT NULL" + (ctx.default_value() != null ? visit(ctx.default_value()) : "");
    }

    @Override
    public String visitFk_constraint(MapleParser.Fk_constraintContext ctx) {
        return " " + visit(ctx.any_stmt());
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
}
