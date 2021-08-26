package Array_List_Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class TargetWord {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("java", "javascript", "java" ,"word" , "html"));
        String targetW = "java";

        int count = 0;
        for (String word : words){
            if (word.equals(targetW)){
                count++;
            }
        }
        System.out.println(targetW + " was found " + count + " times");
    }
}
