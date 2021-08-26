package day09_scanner_practice;

import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter cents:");
        //int cents = 855;
        int cents = scan.nextInt(); // int cents = 255;
        int dollars = cents / 100;
        int remainingCents = cents % 100;
        System.out.println("cents = " + cents);
        System.out.println("dollars = " + dollars);
        System.out.println("remainingCents = " + remainingCents);
        //in 123 cents : 1 dollars 23 cents
        System.out.println("In "+cents+" cents : "+dollars+" dollars "+remainingCents+" cents");
    }
}
