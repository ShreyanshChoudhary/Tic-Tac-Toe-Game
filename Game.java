import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        char Board[][] = new char[3][3];
        for (int row = 0; row < Board.length; row++) {
            for (int column = 0; column < Board[row].length; column++) {
                Board[row][column] = ' ';
            }
        }
        char player = 'O';
        boolean gameOver = false;
        int movesCount = 0;

        Scanner input = new Scanner(System.in);

        while (!gameOver) {
            printBoard(Board);
            System.out.println("Player " + player + ", enter your move (row and column):");
            int row = input.nextInt();
            int column = input.nextInt();

            if (row >= 0 && row < 3 && column >= 0 && column < 3 && Board[row][column] == ' ') {
                Board[row][column] = player;
                movesCount++;
                gameOver = haveWon(Board, player);

                if (gameOver) {
                    System.out.println("Player " + player + " has won!");
                } else if (movesCount == 9) {
                    gameOver = true;
                    System.out.println("The game is a draw!");
                } else {
                    player = (player == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
        printBoard(Board);
    }

    public static boolean haveWon(char[][] board, char player) {
        // Check rows
        for (int row = 0; row < board.length; row++) {
            if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
                return true;
            }
        }
        // Check columns
        for (int column = 0; column < board.length; column++) {
            if (board[0][column] == player && board[1][column] == player && board[2][column] == player) {
                return true;
            }
        }
        // Check diagonals
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        return false;
    }

    public static void printBoard(char[][] Board) {
        for (int row = 0; row < Board.length; row++) {
            for (int column = 0; column < Board[row].length; column++) {
                System.out.print(Board[row][column]);
                if (column < 2) System.out.print(" | ");
            }
            System.out.println();
            if (row < 2) System.out.println("---------");
        }
    }
}
