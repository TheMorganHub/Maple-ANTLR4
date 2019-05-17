package com.morgandev.app.utils;

public class MapleUtils {

    /**
     * Creates a table alias for a given table name. <br>
     * If the table name contains the '_' character, the alias will be the
     * first character of every portion of the string split by '_'. For example: sales_flat_order will become sfo.<br>
     * However, if the table name is over 3 chars long, the alias will be the first 3 characters.
     * If not, the table alias will be the table name.
     *
     * @param tableName the name of the table from which the alias will be produced
     * @return a string to be used as a table alias.
     */
    public static String createTableAlias(String tableName) {
        if (tableName.length() < 3) {
            return tableName;
        }
        String alias = "";
        if (tableName.contains("_")) {
            String[] tableNameArr = tableName.split("_");
            for (String fragment : tableNameArr) {
                alias += fragment.charAt(0);
            }
        } else {
            alias += tableName.substring(0, 2) + tableName.charAt(tableName.length() - 1);
        }

        return alias;
    }
}
