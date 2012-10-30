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
}
