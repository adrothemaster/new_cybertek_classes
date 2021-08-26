package OfficeHours.Practice_03_30_2021;

public class PrefixAgain {
    /*
        Given a String str and a number n check if the prefix (made of up of the first n characters) appears in the remaining part of the String. Print true or false.

    Assume that the String is not empty and that n is in the range from 1 to str.length().

    Examples:

    input: abXYabc
    input: 1

    output: true

     */
    public static void main(String[] args) {

        String str = "abXYabc";
        int n = 2;

        String prefix = str.substring(0,n); // 0, 2 -> ab
        String remaining = str.substring(n);  // XYabc

        System.out.println(remaining.contains(prefix));




    }

}
