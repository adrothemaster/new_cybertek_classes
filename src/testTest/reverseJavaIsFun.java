package testTest;

import java.util.Arrays;

public class reverseJavaIsFun {
    public static void main(String[] args) {
        String word = "java is fun";

        String [] words = word.split(" ");
        for (int i = words.length-1; i >=0 ; i--) {
            System.out.print(words[i] + " ");
        }
    }
}
