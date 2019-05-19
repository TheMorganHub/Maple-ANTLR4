package com.morgandev.app;

import com.morgandev.app.bootstrap.MapleRuntime;
import static org.junit.Assert.assertEquals;

import com.morgandev.app.result.MapleResult;
import org.junit.Test;

public class SelectTests {

    private MapleRuntime runtime;

    public SelectTests() {
        runtime = new MapleRuntime();
    }

    @Test
    public void testImplicitSelect() {
        MapleResult converted = runtime.convert("people");
        assertEquals(new MapleResult("SELECT * FROM `people`;"), converted);
        converted = runtime.convert("people ? id = 6");
        assertEquals(new MapleResult("SELECT * FROM `people` WHERE id = 6;"), converted);
    }

    @Test
    public void testSelectWithColumns() {
        MapleResult converted = runtime.convert("people -> name");
        assertEquals(new MapleResult("SELECT name FROM `people`;"), converted);
        converted = runtime.convert("people -> name, surname");
        assertEquals(new MapleResult("SELECT name, surname FROM `people`;"), converted);
    }

    @Test
    public void testSelectFunctions() {
        MapleResult converted = runtime.convert("people -> COUNT(*);");
        assertEquals(new MapleResult("SELECT COUNT(*) FROM `people`;"), converted);
        converted = runtime.convert("people -> SUM(age), CONCAT('age:', ' ', age)");
        assertEquals(new MapleResult("SELECT SUM(age), CONCAT('age:', ' ', age) FROM `people`;"), converted);
        converted = runtime.convert("people -> SUM(SUM(age)) + 1, COUNT(*), CONCAT(1, ' ', COUNT(*) + 5 / 5), name, surname");
        assertEquals(new MapleResult("SELECT SUM(SUM(age)) + 1, COUNT(*), CONCAT(1, ' ', COUNT(*) + 5 / 5), name, surname FROM `people`;"), converted);
    }

    @Test
    public void testSelectConditionals() {
        MapleResult converted = runtime.convert("people ? id = 6 AND age > 5");
        assertEquals(new MapleResult("SELECT * FROM `people` WHERE id = 6 AND age > 5;"), converted);
        converted = runtime.convert("people ? id = 6 AND age > 5 OR ((AVG(height) > 5) AND dob BETWEEN '1993-03-07' AND '1994-03-04')");
        assertEquals(new MapleResult("SELECT * FROM `people` WHERE id = 6 AND age > 5 OR ((AVG(height) > 5) AND dob BETWEEN '1993-03-07' AND '1994-03-04');"), converted);
    }

    @Test
    public void testSelectJoins() {
        //TODO: test select implicit and explicit joins
    }
}
