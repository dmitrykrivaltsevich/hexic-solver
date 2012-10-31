package com.intetics;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
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

        System.out.println(solver.getGameBoard());
    }

    @Test
    public void testNoClustersAfterFill() {
        for (int i = 0; i < 100; i++) {
            int[][] cells = solver.fillRandomColors(solver.getCells());
            assertFalse(solver.hasClusters(cells));
        }
    }
}
