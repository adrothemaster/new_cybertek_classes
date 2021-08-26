package OfficeHours.Practice_03_22_2021;

import java.util.Scanner;

public class ScannerNextLine {
    public static void main(String[] args) {
        // next() vs nextLine()
        /*

            next() -> read a String value from the console
                       it only reads a single word -> spaces separate words

            nextLine() -> read a String value from the console
                        it will read multiple words
                        -> Also accepts the enter input


         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name");

        String name = input.nextLine();
        System.out.println("Enter a number");
        int number = input.nextInt();

        System.out.println("Enter a word");
        input.nextLine();
        String word = input.nextLine();
        String word2 = input.nextLine();


        System.out.println(number);
        System.out.println(name);

    }
}
