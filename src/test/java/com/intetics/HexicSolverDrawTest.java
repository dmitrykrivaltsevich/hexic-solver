package com.intetics;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

public class HexicSolverDrawTest {

    private HexicSolver solver = new HexicSolver();

    @Test
    public void testGetGameBoard() {
        String board = solver.getGameBoard();

        assertNotNull(board);
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
                board);
    }

    @Test
    public void testGetGameBoardCellsWithColors() {
        solver.getCells()[0][6] = 1;
        solver.getCells()[14][6] = 5;
        solver.getCells()[45][6] = 2;
        solver.getCells()[84][6] = 3;

        String board = solver.getGameBoard();

        assertNotNull(board);
        assertEquals("   _   _   _   _   _\n" +
                " _/1\\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/5\\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/2\\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/3\\\n" +
                "  \\_/ \\_/ \\_/ \\_/ \\_/",
                board);
    }
}
