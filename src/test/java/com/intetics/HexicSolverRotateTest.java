package com.intetics;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;

/**
 * @author d.krivaltsevich
 */
public class HexicSolverRotateTest {

    private HexicSolver solver = new HexicSolver();

    @Test
    public void testCanRotateEmptyCells() {
        for (int pointNumber = 0; pointNumber < HexicSolver.ROTATION_POINTS.length; pointNumber++) {
            assertFalse(solver.canRotate(solver.getCells(), pointNumber));
        }
    }
}
