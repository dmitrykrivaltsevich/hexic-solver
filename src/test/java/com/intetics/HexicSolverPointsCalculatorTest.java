package com.intetics;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

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

    @Test
    public void testCalculateTotal() {
        HashSet<Integer> cluster1 = new HashSet<Integer>();
        cluster1.add(1);
        cluster1.add(2);
        cluster1.add(3);

        HashSet<Integer> cluster2 = new HashSet<Integer>();
        cluster2.add(1);
        cluster2.add(2);
        cluster2.add(3);
        cluster2.add(4);

        ArrayList<Set<Integer>> clusters = new ArrayList<Set<Integer>>();
        clusters.add(cluster1);
        clusters.add(cluster2);

        assertEquals(3L + 3L * 3L, solver.calculateTotal(clusters));
    }
}
