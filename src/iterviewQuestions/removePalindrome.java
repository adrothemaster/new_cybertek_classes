package iterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class removePalindrome {
    public static void main(String[] args) {
        List<String> word = new ArrayList<>(Arrays.asList("honda","madam","nissan","boob","girl"));
        Iterator<String> words = word.iterator();
        while(words.hasNext()){
            String word1 = words.next();
            String reversWord = "";
            for (int i = word1.length()-1; i >=0; i--){
                reversWord += word1.charAt(i);
            }
            //System.out.println("reversWord = " + reversWord);
            if (word1.equals(reversWord)){
                words.remove();
            }
        }
        System.out.println("words = " + word);
        //word.removeIf(same -> )
    }
    //public static boolean isPa()
}
