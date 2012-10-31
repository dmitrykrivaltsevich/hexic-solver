package com.intetics;

import org.junit.Test;

import java.util.List;
import java.util.Set;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class HexicSolverFindClustersTest {

    private HexicSolver solver = new HexicSolver();

    @Test
    public void testEmptyCells() {
        List<Set<Integer>> clusters = solver.findClusters(solver.getCells());
        assertTrue(clusters.isEmpty());
    }

    @Test
    public void testIsolatedCells() {
        solver.getCells()[0][6] = 1;
        solver.getCells()[1][6] = 1;
        solver.getCells()[47][6] = 1;
        solver.getCells()[84][6] = 1;

        List<Set<Integer>> clusters = solver.findClusters(solver.getCells());
        assertTrue(clusters.isEmpty());
    }

    @Test
    public void testGroupedCluster() {
        solver.getCells()[0][6] = 1;
        solver.getCells()[10][6] = 1;
        solver.getCells()[5][6] = 1;

        List<Set<Integer>> clusters = solver.findClusters(solver.getCells());
        assertEquals(1, clusters.size());
        assertTrue(clusters.get(0).contains(0));
        assertTrue(clusters.get(0).contains(10));
        assertTrue(clusters.get(0).contains(5));
    }
}
