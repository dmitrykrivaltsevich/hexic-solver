package com.intetics;

import org.junit.Test;

import static junit.framework.Assert.assertTrue;

/**
 * Date: 10/31/12
 * Time: 1:49 AM
 *
 * @author: dmitry.krivaltsevich@gmail.com
 */
public class HexicSolverRandomColorFillTest {

    private HexicSolver solver = new HexicSolver();

    @Test
    public void testAllColorsWasFilled() {
        int[][] cells = solver.fillRandomColors(solver.getCells());
        for (int[] cell : cells) {
            assertTrue(cell[HexicSolver.COLOR_INDEX] != -1);
        }
    }
}
