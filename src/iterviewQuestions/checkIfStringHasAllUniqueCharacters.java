package iterviewQuestions;

import java.util.HashSet;
import java.util.Locale;

public class checkIfStringHasAllUniqueCharacters {
    public static void main(String[] args) {

        System.out.println(uniquesChar("apple"));
        System.out.println(uniqueIndexOf("abcdef"));
        System.out.println(uniqueAscii("abcdee"));
    }

    public static boolean uniquesChar(String word) {
        HashSet alphaSet = new HashSet();
        boolean answer = true;

        for (int i = 0; i < word.length(); i++) {

            char c = word.charAt(i);

            if (!alphaSet.add(c)) {

                return false;

            }
        }

        return answer;


    }

    public static boolean uniqueIndexOf(String word) {
        boolean answer = true;

        for (int i = 0; i < word.length(); i++) {

            char c = word.charAt(i);

            if (word.indexOf(c) != word.lastIndexOf(c)) {
                answer = false;
            }

        }
        return answer;
    }

    public static boolean uniqueAscii(String word){


        boolean[] charMap = new boolean[26];



        for (int i = 0; i < word.length(); i++) {

            int asciiCode = (int) word.toUpperCase().charAt(i) - 64;

            if (!charMap[asciiCode]) {
                charMap[asciiCode] = true;
            }else
                return false;



        }

        return true;
    }
}
