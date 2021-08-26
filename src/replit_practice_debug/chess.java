package replit_practice_debug;

import java.util.*;

public class chess {
    public static void main(String[] args) {
                String[][] chessBoard = new String[8][8];
                //WRITE YOUR CODE HERE
                for (int i = 0; i < 8; i++){
                   char intChar = 'a';

                   for (int j = 0; j < 8; j++){
                       chessBoard [i][j] = (i + 1) + "" + intChar;
                       intChar++;
                   }
                }
                    //DO NOT CHANGE
                    System.out.println(Arrays.deepToString(chessBoard));
            }
        }