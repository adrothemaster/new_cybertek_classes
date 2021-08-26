package testTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class reverseWithArrayList {

    public static void main(String[] args) {

        String input = "java is fun with flowers";
        char[] hello = input.toCharArray();
        List<Character> word = new ArrayList<>();

        for(char each: hello)
            word.add(each);

        Collections.reverse(word);
        ListIterator word1 = word.listIterator();
        while(word1.hasNext())
            System.out.print(word1.next());


    }
}
