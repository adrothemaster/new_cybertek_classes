package replit_practice_debug;

import java.util.Scanner;

public class PrintTriangles {
    public static void main(String[] args) {
        // int i = 1;
        //	int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i =1 ; i <= n; i++){
            // System.out.print("*");
            for (int j =1 ; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}