package com.morgandev.app.result;

import com.morgandev.app.errorhandling.MapleParseException;

/**
 * The result obtained after parsing Maple sentences. This class acts as a wrapper for the resulting SQL sentences
 * or any MapleParseExceptions thrown during parsing.
 */
public class MapleResult {

    private boolean errors;
    private String sqlStatements;
    private MapleParseException exception;

    public MapleResult() {
        sqlStatements = "";
    }

    /**
     * Creates a Maple result from a SQL statement. Useful for unit tests and to dynamically compare a result to another.
     * @param sqlStatements SQL statements
     */
    public MapleResult(String sqlStatements) {
        this.sqlStatements = sqlStatements;
    }

    public boolean hasErrors() {
        return errors;
    }

    public void setSqlStatements(String sqlStatements) {
        this.sqlStatements = sqlStatements;
    }

    public String getSqlStatements() {
        return sqlStatements;
    }

    public void setException(MapleParseException exception) {
        this.exception = exception;
        errors = true;
    }

    public MapleParseException getException() {
        return exception;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MapleResult that = (MapleResult) o;

        if (errors != that.errors) return false;
        if (sqlStatements != null ? !sqlStatements.equals(that.sqlStatements) : that.sqlStatements != null)
            return false;
        return exception != null ? exception.equals(that.exception) : that.exception == null;
    }

    @Override
    public int hashCode() {
        int result = (errors ? 1 : 0);
        result = 31 * result + (sqlStatements != null ? sqlStatements.hashCode() : 0);
        result = 31 * result + (exception != null ? exception.hashCode() : 0);
        return result;
    }

    /**
     * Returns a string representation of this result.
     *
     * @return If the result contains any active exceptions, it displays its
     * error code and message, otherwise, it displays the resulting SQL statements.
     */
    @Override
    public String toString() {
        if (exception != null) {
            return "ERR(" + exception.getErrorCode() + ") - " + exception.getMessage();
        }
        return sqlStatements;
    }
}
