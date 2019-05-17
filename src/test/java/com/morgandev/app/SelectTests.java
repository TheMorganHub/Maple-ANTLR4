package com.morgandev.app;

import com.morgandev.app.bootstrap.MapleRuntime;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SelectTests {

    private MapleRuntime runtime;

    public SelectTests() {
        runtime = new MapleRuntime();
    }

    @Test
    public void testImplicitSelect() {
        System.out.println("[SELECT] testImplicitSelect...");

        String converted = runtime.convert("people");
        assertEquals("SELECT * FROM `people`;", converted);
        converted = runtime.convert("people ? id = 6");
        assertEquals("SELECT * FROM `people` WHERE id = 6;", converted);
    }

    @Test
    public void testSelectWithColumns() {
        System.out.println("[SELECT] testSelectWithColumns...");

        String converted = runtime.convert("people -> name");
        assertEquals("SELECT name FROM `people`;", converted);
        converted = runtime.convert("people -> name, surname");
        assertEquals("SELECT name, surname FROM `people`;", converted);
    }

    @Test
    public void testSelectFunctions() {
        System.out.println("[SELECT] testSelectFunctions...");

        String converted = runtime.convert("people -> COUNT(*);");
        assertEquals("SELECT COUNT(*) FROM `people`;" , converted);
        converted = runtime.convert("people -> SUM(age), CONCAT('age:', ' ', age)");
        assertEquals("SELECT SUM(age), CONCAT('age:', ' ', age) FROM `people`;", converted);
        converted = runtime.convert("people -> SUM(SUM(age)) + 1, COUNT(*), CONCAT(1, ' ', COUNT(*) + 5 / 5), name, surname");
        assertEquals("SELECT SUM(SUM(age)) + 1, COUNT(*), CONCAT(1, ' ', COUNT(*) + 5 / 5), name, surname FROM `people`;", converted);
    }

    @Test
    public void testSelectConditionals() {
        System.out.println("[SELECT] testSelectConditionals...");

        String converted = runtime.convert("people ? id = 6 AND age > 5");
        assertEquals("SELECT * FROM `people` WHERE id = 6 AND age > 5;", converted);
        converted = runtime.convert("people ? id = 6 AND age > 5 OR ((AVG(height) > 5) AND dob BETWEEN '1993-03-07' AND '1994-03-04')");
        assertEquals("SELECT * FROM `people` WHERE id = 6 AND age > 5 OR ((AVG(height) > 5) AND dob BETWEEN '1993-03-07' AND '1994-03-04');", converted);
    }

    @Test
    public void testSelectJoins() {
        //TODO: test select implicit and explicit joins
    }
}
