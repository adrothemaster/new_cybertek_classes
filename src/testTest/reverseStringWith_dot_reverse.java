package testTest;

import java.lang.*;


public class reverseStringWith_dot_reverse {

    //Using built in reverse() method of the StringBuilder class: String class does not have reverse() method,
    // we need to convert the input string to StringBuilder, which is achieved by using the append method of StringBuilder.
    // After that, print out the characters of the reversed string by scanning from the first till the last index.

        public static void main(String[] args)
        {
            String input = "now this was interesting";

            StringBuilder input1 = new StringBuilder();

            // append a string into StringBuilder input1
            input1.append(input);

            // reverse StringBuilder input1
            input1.reverse();

            // print reversed String
            System.out.println(input1);
        }
    }
