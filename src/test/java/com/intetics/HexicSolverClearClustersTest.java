package com.intetics;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 * Date: 10/31/12
 * Time: 3:53 AM
 *
 * @author: dmitry.krivaltsevich@gmail.com
 */
public class HexicSolverClearClustersTest {

    private HexicSolver solver = new HexicSolver();

    @Test
    public void testClearClustersEmptyCellsNoErrors() {
        solver.clearClusters(solver.getCells());
    }

    @Test
    public void testClearOneCluster() {
        solver.getCells()[14][6] = 1;
        solver.getCells()[19][6] = 1;
        solver.getCells()[24][6] = 1;
        assertTrue(solver.hasClusters(solver.getCells()));

        solver.clearClusters(solver.getCells());
        assertFalse(solver.hasClusters(solver.getCells()));
    }
}
