package testTest;
import java.util.Random;
import java.util.Scanner;

public class GroupWorkTicTacToe {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";


    public static char[][] table(char[][] board) {

        int R = 3;
        int C = 3;

        System.out.println("-------------------");
        for (int i = 0; i < R; i++) {
            System.out.print("|");
            for (int j = 0; j < C; j++) {
                System.out.print("  " + board[i][j] + "  |");
            }
            System.out.println();
            System.out.println("-------------------");
        }
        return board;


    }

    public static char startPlayer(char player1, char player2) {
        Random random = new Random();
        int randomNum = random.nextInt(10);
        char player;
        if (randomNum % 2 == 0)
            player = player1;
        else
            player = player2;

        System.out.println("Player " + player + " will start.");
        return player;
    }

    public static boolean isAvailability(char[][] board, int choice) {

        if (board[(choice - 1) / 3][(choice - 1) % 3] == 'X'  || board[(choice - 1) / 3][(choice - 1) % 3] == 'O' ) {
            return false;
        }else{
            return true;
        }
    }

    public static void updateTable(char[][] board, char player, int number) {

        int row = (number - 1) / 3;
        int col = (number - 1) % 3;

        board[row][col] = player;
    }


    public static char switchPlayer(char player) {  //X--> O

        if (player == 'X' ) {
            player = 'O' ;
        } else
            player = 'X' ;

        return player;
    }

    public static boolean isWinner(char[][] board) {


        if (    (board[0][0] == board[0][1] && board[0][1] == board[0][2]) ||
                (board[1][0] == board[1][1] && board[1][1] == board[1][2]) ||
                (board[2][0] == board[2][1] && board[2][1] == board[2][2]) ||
                (board[0][0] == board[1][0] && board[1][0] == board[2][0]) ||
                (board[0][1] == board[1][1] && board[1][1] == board[2][1]) ||
                (board[0][2] == board[1][2] && board[1][2] == board[2][2]) ||
                (board[0][0] == board[1][1] && board[1][1] == board[2][2]) ||
                (board[2][0] == board[1][1] && board[1][1] == board[0][2])) {

            return true;
        } else
            return false;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String answer = "";

        do {

            char player1 = 'X';
            char player2 = 'O';
            char player;

        /*
           use startPlayer methods to choose a player who would start the game
           randomly between player1 and player2
         */

            char[][] board = {

                    {'1', '2', '3'},
                    {'4', '5', '6'},
                    {'7', '8', '9'}
            };

            table(board);
            System.out.println();
            player = startPlayer(player1, player2);
            System.out.println();


            for (int i = 1; i <= 9; i++) {

                System.out.print("Player " + player + " enter a number from (1-9) : ");
                int choice = scan.nextInt();
                System.out.println();

            /*
             isAvailability is boolean method, which help to check
             if the chosen square is available or not
             */

                while (!isAvailability(board, choice)) {
                    System.out.println("This square has been already taken, please choose another one");
                    System.out.println();
                    System.out.print("Player " + player + " enter a number from (1-9) : ");
                    choice = scan.nextInt();
                }

                updateTable(board, player, choice); // update the table

                table(board); // print the last version of table

                // check if we have winner or not
                if (isWinner(board)) {
                    System.out.println();
                    System.out.println("|-------------------|");
                    System.out.println("| Player " + player + " is winner|");
                    System.out.println("|-------------------|");
                    break;
                }

                player = switchPlayer(player); // use this method to switch player for next turn.

                if (i == 9 && !isWinner(board)) {
                    System.out.println("|-----------------------------|");
                    System.out.println("| NO WINNER - THE GAME IS TIE |");
                    System.out.println("|-----------------------------|");
                }
            }

            System.out.println();
            System.out.println("Do you want to play again: (Yes/No) ");
            answer = scan.next();

        } while (answer.equalsIgnoreCase("yes"));

    }
}
