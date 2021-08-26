package testTest;

import java.lang.*;
import java.io.*;
import java.util.*;

public class reverseStringWithChar {

    // Java program to Reverse a String  by
    // converting string to characters  one
    // by one
    //1. First, convert String to character array
    //   by using the built in Java String class
    //   method toCharArray().
    //2. Then, scan the string from end  to start,
    //   and print the character one by one.
        public static void main(String[] args)
        {
            String input = "Char to String reverse ";

            // convert String to character array
            // by using toCharArray
            char[] try1 = input.toCharArray();

            for (int i = try1.length - 1; i >= 0; i--)
                System.out.print(try1[i]);
        }
    }
