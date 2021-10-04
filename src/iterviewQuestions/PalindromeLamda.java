package iterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PalindromeLamda {
    public static void main(String[] args) {
        List<String> word = new ArrayList<>(Arrays.asList("honda","madam","nissan","boob","girl"));
        word.removeIf(words -> isPalindrome(words));
        System.out.println(word);
    }
    public static boolean isPalindrome(String str){
        String temp = "";
        for (int i = str.length() - 1; i>= 0; i--){
            temp += str.charAt(i);
        }
        return temp.equals(str);
    }
}
