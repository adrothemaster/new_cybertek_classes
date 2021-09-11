package OfficeHoursMyExamples;

import java.util.ArrayList;
import java.util.Arrays;

public class TargetWord{
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList("java", "html", "javascript", "java", "word" ));
        String targetWord = "word";
        int count=0;

        for (int i = 0; i < words.size(); i++) {

            System.out.println("words.get(i) = " + words.get(i));
            if(words.get(i).equals(targetWord)){
                count++;
                System.out.println("count = " + count);
            }

        }
        System.out.println(targetWord + " was found " + count + " times\n");
    }
}
