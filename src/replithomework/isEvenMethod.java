package replithomework;

import java.util.Scanner;

public class isEvenMethod {

    public static boolean isEven(int n) {
        //isEven accepts a number and checks if it is even. If the given number is even return true, otherwise return false.
        //
        //Examples:

        //isEven(1) --> false
        //isEven(8) --> true

        if (n % 2 == 0){
            return true;
        }else{
            return false;
        }


    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isEven(in.nextInt()));
    }



}