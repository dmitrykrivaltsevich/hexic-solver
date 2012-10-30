package com.intetics;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class HexicSolverPointsCalculatorTest {

    private HexicSolver solver = new HexicSolver();

    @Test
    public void testCalculatePoints() {
        assertEquals(0, solver.calculatePoints(0));
        assertEquals(0, solver.calculatePoints(1));
        assertEquals(0, solver.calculatePoints(2));
        assertEquals(3, solver.calculatePoints(3));
        assertEquals(3 * 3, solver.calculatePoints(4));
        assertEquals(3 * 3 * 3, solver.calculatePoints(5));
        assertEquals(3 * 3 * 3 * 3, solver.calculatePoints(6));
    }
}
