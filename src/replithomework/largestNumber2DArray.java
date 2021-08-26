package replithomework;

import com.sun.xml.internal.bind.v2.TODO;

import java.util.Scanner;

public class largestNumber2DArray {

    public static void main(String[] args) {

        /**
         * Given a 2d array of ints, find the biggest number(int) in the array and print it.
         */
        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i=0 ;i<=rows-1;i++)
        {
            for(int j=0 ;j<=cols-1;j++)
            {
                arr[i][j]=inp.nextInt();
            }//end for cols
        }//end for rows

 //       TODO write your code below
      int maxNumber = arr[0][0];
        for (int i =0 ; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > maxNumber) {
                maxNumber = arr[i][j];
                }
            }
        }
        System.out.println(maxNumber);
    }//end main
}