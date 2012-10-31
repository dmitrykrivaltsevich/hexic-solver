package com.intetics;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Date: 10/31/12
 * Time: 4:11 AM
 *
 * @author: dmitry.krivaltsevich@gmail.com
 */
public class HexicSolverFallDownTest {

    private HexicSolver solver = new HexicSolver();

    @Test
    public void testFallDownEmptyCells() {
        solver.fallDown(solver.getCells());
        System.out.println(solver.getGameBoard());

        assertEquals("   _   _   _   _   _\n" +
                " _/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "  \\_/ \\_/ \\_/ \\_/ \\_/",
                solver.getGameBoard());
    }

    @Test
    public void testFallDownOneNonEmptyCell() {
        solver.getCells()[0][6] = 1;
        System.out.println(solver.getGameBoard());

        solver.fallDown(solver.getCells());
        System.out.println(solver.getGameBoard());

        assertEquals("   _   _   _   _   _\n" +
                " _/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/1\\_/ \\_/ \\_/ \\_/ \\\n" +
                "  \\_/ \\_/ \\_/ \\_/ \\_/",
                solver.getGameBoard());
    }
}
