package org.example;

public class TicTacToe {
    private final Player player1;
    private final Player player2;
    private final Player currentPlayer;
    private final Board board;

    public TicTacToe() {
        player1 = new Player('X');
        player2 = new Player('O');
        currentPlayer = player1;
        board = new Board();
    }

  

    public void start() {
        while (!board.isFull() && !board.hasWinner()) {
            board.print();
            System.out.println("Current Player: " + currentPlayer.getMarker());
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter row (0-2): ");
            int row = scanner.nextInt();
            System.out.print("Enter column (0-2): ");
            int col = scanner.nextInt();
            if (board.isCellEmpty(row, col)) {
                board.place(row, col, currentPlayer.getMarker());
                if (board.hasWinner()) {
                    board.print();
                    System.out.println("Player " + currentPlayer.getMarker() + " wins!");
                    return;
                }
                switchCurrentPlayer();
            } else {
                System.out.println("Cell is not empty, try again.");
            }
        }
        if (board.isFull() && !board.hasWinner()) {
            board.print();
            System.out.println("It's a draw!");
        }
    }

    private void switchCurrentPlayer() {
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.start();
    }
}
