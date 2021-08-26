package testTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class reverseStringWithArrayList {


    // Class of ReverseString
    //1. We copy String contents to an object
    //   of ArrayList.
    //1. We create a ListIterator object by using
    //   the listIterator() method on the ArrayList
    //   object.
    //2. ListIterator object is used to iterate over
    //   the list.
    //3. ListIterator object helps us to iterate
    //   over the reversed list and print it one
    //   by one to the output screen.

        public static void main(String[] args)
        {
            String input = "String to ArrayList reverse";
            char[] hello = input.toCharArray();
            List<Character> trial1 = new ArrayList<>();

            for (char c : hello)
                trial1.add(c);

            Collections.reverse(trial1);
            ListIterator li = trial1.listIterator();
            while (li.hasNext())
                System.out.print(li.next());
        }
    }
