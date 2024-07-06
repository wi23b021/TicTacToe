package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class TicTacToeTest {

    @Test
    public void testPlayerInitialization() {
        Player playerX = new Player('X');
        assertEquals('X', playerX.getMarker());

        Player playerO = new Player('O');
        assertEquals('O', playerO.getMarker());
    }

    @Test
    public void testBoardInitialization() {
        Board board = new Board();
        assertTrue(board.isCellEmpty(0, 0));
        assertTrue(board.isCellEmpty(1, 1));
        assertTrue(board.isCellEmpty(2, 2));
    }

    @Test
    public void testPlaceMarker() {
        Board board = new Board();
        board.place(0, 0, 'X');
        assertFalse(board.isCellEmpty(0, 0));
        assertTrue(board.isCellEmpty(1, 1));
    }

    @Test
    public void testHasWinner() {
        Board board = new Board();
        board.place(0, 0, 'X');
        board.place(0, 1, 'X');
        board.place(0, 2, 'X');
        assertTrue(board.hasWinner());
    }

    @Test
    public void testBoardIsFull() {
        Board board = new Board();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board.place(i, j, 'X');
            }
        }
        assertTrue(board.isFull());
    }

    @Test
    public void testInvalidMove() {
        Board board = new Board();
        board.place(0, 0, 'X');
        board.place(0, 0, 'O');
        assertEquals('X', board.getMarker(0, 0)); // Assuming a method getMarker(x, y)
    }

    @Test
    public void testGameStateAfterWin() {
        Board board = new Board();
        board.place(0, 0, 'X');
        board.place(0, 1, 'X');
        board.place(0, 2, 'X');
        assertTrue(board.hasWinner());
        board.place(1, 0, 'O');
        assertEquals(' ', board.getMarker(1, 0)); // Assuming no more moves allowed after win
    }
}
