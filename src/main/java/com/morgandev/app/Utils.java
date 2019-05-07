package com.morgandev.app;

public class Utils {

    public static String createTableAlias(String tableName) {
        String alias = "";
        if (tableName.contains("_")) {
            String[] tableNameArr = tableName.split("_");
            for (String fragment : tableNameArr) {
                alias += fragment.charAt(0);
            }
        } else {
            if (tableName.length() > 3) {
                alias += tableName.substring(0, 2) + tableName.charAt(tableName.length() - 1);
            }
        }

        return alias;
    }
}
