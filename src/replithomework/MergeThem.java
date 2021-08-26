package replithomework;

import java.util.Scanner;

public class MergeThem {

    public static String mergeStrings(String one, String two) {
        /**
         * Write a method mergeStrings that will return the strings merged, one letter at a time, starting with one. Please note one and two can be of different lengths.
         *
         * Examples:
         *
         * s1 ==> "12345"
         * s2 ==> "abcde"
         * mergeStrings(s1,s2) ==> "1a2b3c4d5e
         * mergeStrings("wooden", "spoon") ==> "wsopoodoenn"
         *
         * mergeStrings("java", "selenium") ==> "jsaevlaenium"
         */
        String newWord = "";
        String longerString = "";
        int shorterWord = 0;
        if (one.length() > two.length()) {

            longerString = one;
            shorterWord = two.length();

        } else {
            longerString = two;
            shorterWord = one.length();
        }
        for (int i = 0; i < shorterWord; i++) {
            newWord += "" + one.charAt(i) + two.charAt(i);
        }

        newWord += longerString.substring(shorterWord);

        return newWord;




    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(mergeStrings(in.next(), in.next()));
    }

}