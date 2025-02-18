import java.util.Scanner;

public class tictactoe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[][] board = {
            {' ',' ',' '},
            {' ',' ',' '},
            {' ',' ',' '}
        };

        System.out.println("""
                ==========================================
                   __  _      __             __          \s
                  / /_(_)____/ /_____ ______/ /_____  ___\s
                 / __/ / ___/ __/ __ `/ ___/ __/ __ \\/ _ \\
                / /_/ / /__/ /_/ /_/ / /__/ /_/ /_/ /  __/
                \\__/_/\\___/\\__/\\__,_/\\___/\\__/\\____/\\___/\s
                ==========================================
                """);

        System.out.println("Current Board");
        printBoard(board);

        char check = ' ';

        boolean full;

        while (true) {
            int taken = 0;

            while (taken == 0) {
                int row = 0, col = 0;
                System.out.println("\nUser 1");
                System.out.print("Enter row: ");
                row = input.nextInt();
                System.out.print("Enter column: ");
                col = input.nextInt();

                if (board[row - 1][col - 1] == ' ') {
                    board[row - 1][col - 1] = 'X';
                    taken = 1;
                } else {
                    System.out.println("Spot is taken!");
                }

                printBoard(board);
            }

            full = isBoardFull(board);
            if (full) {
                System.out.println("RESETING GAME!");
                resetBoard(board);
                continue;
            }

            check = checkBoard(board);
            switch (check) {
                case 'X':
                    System.out.println("X wins");
                    return;
                case 'O':
                    System.out.println("O wins");
                    return;
                default:
                    break;
            }

            taken = 0;

            while (taken == 0) {
                int row = 0, col = 0;
                System.out.println("\nUser 2");
                System.out.print("Enter row: ");
                row = input.nextInt();
                System.out.print("Enter column: ");
                col = input.nextInt();
                if (board[row - 1][col - 1] == ' ') {
                    board[row - 1][col - 1] = 'O';
                    taken = 1;
                } else {
                    System.out.println("Spot is taken!");
                }
            }

            printBoard(board);

            check = checkBoard(board);
            switch (check) {
                case 'X':
                    System.out.println("X wins");
                    return;
                case 'O':
                    System.out.println("O wins");
                    return;
                default:
                    break;
            }
        }
    }

    private static void printBoard(char[][] board) {
        System.out.printf("""
              ███████ 
              █%c█%c█%c█
              ███████ 
              █%c█%c█%c█
              ███████ 
              █%c█%c█%c█
              ███████ 
              """,
                board[0][0], board[0][1], board[0][2],
                board[1][0], board[1][1], board[1][2],
                board[2][0], board[2][1], board[2][2]);
    }

    private static char checkBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][0] == board[i][2] && board[i][0] != ' ') {
                return board[i][0];
            }
            if (board[0][i] == board[1][i] && board[0][i] == board[2][i] && board[0][i] != ' ') {
                return board[0][i];
            }
        }
        if (board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] != ' ') {
            return board[0][0];
        }
        if (board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[0][2] != ' ') {
            return board[0][2];
        }
        return ' ';
    }

    private static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    private static void resetBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }
}
