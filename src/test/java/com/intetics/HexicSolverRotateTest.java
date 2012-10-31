package com.intetics;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
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

    @Test
    public void testCanRotatePositive() {
        solver.getCells()[31][6] = 1;
        solver.getCells()[32][6] = 2;
        solver.getCells()[33][6] = 3;

        solver.canRotate(solver.getCells(), 56);
    }

    @Test
    public void testRotateClockwise() {
        solver.getCells()[0][6] = 1;
        solver.getCells()[10][6] = 2;
        solver.getCells()[5][6] = 3;

        int[][] rotated = solver.rotateClockwise(solver.getCells(), 0);
        assertEquals(2, rotated[0][6]);
        assertEquals(3, rotated[10][6]);
        assertEquals(1, rotated[5][6]);

        int[][] rotateTwice = solver.rotateClockwise(rotated, 0);
        assertEquals(3, rotateTwice[0][6]);
        assertEquals(1, rotateTwice[10][6]);
        assertEquals(2, rotateTwice[5][6]);
    }
}
