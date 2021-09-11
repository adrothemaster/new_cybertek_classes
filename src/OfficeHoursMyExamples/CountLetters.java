package OfficeHoursMyExamples;

import java.util.ArrayList;
import java.util.Arrays;

public class CountLetters {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("java", "html", "javascript", "java", "word"));
        char targetLetter = 'a';
        int total = 0;

        for (String each: words) {
            System.out.println("lettersWithinWord(each,targetLetter) = " + lettersWithinWord(each, targetLetter));
            total += lettersWithinWord(each, targetLetter);
        }
        System.out.println(total);

    }

    public static int lettersWithinWord(String word, char target) {


        int count = 0;

        for (int i = 0; i < word.length(); i++) {

        char temp = word.charAt(i);

        if (temp == target) {

                count++;

            }
        }
        return count;
    }
}
