package iterviewQuestions;

import java.util.HashMap;
import java.util.HashSet;

public class duplicateCharInString {
    public static void main(String[] args) {

        System.out.println(duplicateHash("apple"));
        System.out.println(duplicateHash("love you"));
        System.out.println(duplicateHash("this you're"));

        System.out.println(HashMap("apple"));
        System.out.println(HashMap("aple"));



    }
    public static boolean duplicateHash(String word){
        HashMap<Character,Integer> alphaMap = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {

            char temp = word.charAt(i);

            alphaMap.put(temp, i);
        }
        return alphaMap.size() == word.length();
    }
    public static boolean HashMap(String word){
        HashMap<Character,Integer> alphaMap2 = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {

            char temp = word.charAt(i);

            if (alphaMap2.containsKey(temp)){

                alphaMap2.put(temp,alphaMap2.get(temp) + 1);
            }else{
                alphaMap2.put(temp,1);

            }
        }
        for (Character c:
             alphaMap2.keySet()) {
            if (alphaMap2.get(c) > 1){
                System.out.println("c = " + c + "alphaMap2.get(c) = " + alphaMap2.get(c));
                return false;
            }
        }
        return true;
    }
}
