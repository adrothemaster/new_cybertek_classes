package practice_with_Mj;

import java.util.*;
public class arrayPreTestReviewWithMj {
    public static void main(String[] args) {

        // how to declare an Array :

        String[] a = new String[3]; // first way
        // String[] a = new String[3]; // you are not able to declare an array without SIZE!
        String a1[] = new String[3];
        String[] a3 = {"a", "b", "c"};  // data type should be as same as your array data type !!
        // it means if you declare Sting array   == > it means if you declare Sting array
        // it means if you declare int array     == > it means if you declare int array
        // it means if you declare boolean array == > it means if you declare boolean array

        System.out.println("//----------------------------------------------------------------------------------------//");
        // Reassign the value in array:

        int[] num = {1, 2, 3, 4};
        System.out.println(Arrays.toString(num)); // how to print array as String Array
        System.out.println();
        num[0] = 3;
        System.out.println(Arrays.toString(num)); // reassign
        System.out.println(num[3] = 1); // when you use = it means you are reassign it
        System.out.println(Arrays.toString(num));

        int[] num2 = num;
        System.out.println(Arrays.toString(num2));
        num2 = new int[5]; // it could be different size
        System.out.println(Arrays.toString(num2)); // reassign the array into new array with specific size

        System.out.println("//----------------------------------------------------------------------------------------//");

        String[] name = {"mj", "mohammad", "javad", "semati"};

        int size = name.length; // size of array
        name[0] = name[2];
        System.out.println(Arrays.toString(name));
        // you will miss the value of index[0]
        // it means if you want to use "mj" later you should save the index into another variable;
        String firstName = name[1];
        name[1] = name[3];
        System.out.println(Arrays.toString(name));
        name[3] = firstName;
        System.out.println(Arrays.toString(name));
        System.out.println("//----------------------------------------------------------------------------------------//");
        System.out.println();

        //--------------------//
        // String in Arrays

        String[] words = {"mj", "mohammad", "javad", "semati"}; // each index is a String by itself

        // name2 = name2.substring( 0 , 1) -- name2 = name2.indexOf()
        // no because name2 IS NOT A STRING ==> YOU CAN NOT USE STRING METHODS AFTER THAR

        name[1] = name[1].toUpperCase(); // reassign to upperCase
        System.out.println(Arrays.toString(name)); // since index[i] is String you can use all string methods

        name[2].substring(0, 4); // "java"
        System.out.println(Arrays.toString(name)); // it doesnt change , because  YOU DID NOT ASSIGN IT

        words[2] = words[2].substring(0, 4);
        System.out.println(Arrays.toString(name));


        // name[3] = name[3].charAt(2);

        char letter = words[3].charAt(2); // what is the output??
        // THE OUT PUT OF CHAR AT IS ALWAYS CHAR

        words[0] = ("" + words[0].charAt(1) + letter);
        // how to print UpperCase words[0]
        System.out.println(words[0].toUpperCase());

        words[0].toUpperCase(); // is it correct or not?

        System.out.println(Arrays.toString(words)); // it will print same
        System.out.println();
        System.out.println("//----------------------------------------------------------------------------------------//");

        //conctanating int with String

        String myName = "MJ";

        int num3 = 12;

        myName = myName + num3;
        System.out.println(myName); //

        int num4 = 8;
        // what is the result:
        System.out.println(num3 + num4 + myName + num3 + num4);
        System.out.println();
        System.out.println("//----------------------------------------------------------------------------------------//");

        // Data type in String methods :

        String[] sentence = {"my", "name", "is", "Mohammad", "!"}; // What is the size of array?

        // all indexes in String array are String
        sentence[1] = "my";
        sentence[3].substring(3); //    int(input)    ==>  substring   ==> String(output)
        //  sentence[0].charAt(1)  //    int(input)    ==>  charAt      ==> char(output)
        sentence[2].contains("a"); //    String(input) ==>  contains    ==> boolean(output)
        //                               String(input) ==>  statWith    ==> boolean(output)
        //                               String(input) ==>  endsWith    ==> boolean(output)
        sentence[3].indexOf("Mo");  //   String(input) ==>  indexOf     ==> int(output)
        //                               char(input)   ==>  indexOf     ==> int(output)
        //                               String(input) ==>  toUpperCase ==> String(output)
        System.out.println(sentence[3].indexOf('h')); // ==> 2

        // if the char or string is present on your string ==> it will give you the number of start index
        // IF NOT IT WILL PRINT -1

        System.out.println(sentence[3].indexOf('z')); // ==> -1
        System.out.println();

        System.out.println("//----------------------------------------------------------------------------------------//");
        // String Out Of Bond

        int[] numArray = {1, 2, 3, 4, 5};

        for (int i = 0; i < numArray.length; i++) { // if you put = you should write length -1

            //       System.out.print(numArray[i+1]+"  "); // out of bond is different with ERROR.
            // Error means program not able to run at all
            // but here the program runs and execute all numbers till find out of bond

        }
        System.out.println();
        System.out.println("//----------------------------------------------------------------------------------------//");
        // break and continue :
        // continue means Skip this round of the loop and go to next one
        // break mean stop processing in LOOP ==> then go out of the loop
        // return ==> Stop processing in main method ==> go the end of main

        for (int i = 0; i < numArray.length; i++) {

//            numArray[i] = numArray[i+1];
//        } // I didnt print anything but processing not related to print out
        }
//        System.out.println(Arrays.toString(numArray));

        for (int i = 0; i < numArray.length; i++) {

            if (i == (numArray.length - 1)) { // how to find last index in array and String
                continue;  // Skip this iteration go the next one
            }
            numArray[i] = numArray[i + 1];
        }
        System.out.println(Arrays.toString(numArray));

        // [2, 3, 4, 5, 5]
        System.out.println();

        int counter = 0;
        for (int i = 0; i < numArray.length; i++) {

            if (numArray[i] == 3) {
                counter++;
                break;
            }
            counter++;
        }
        System.out.println(counter);

        System.out.println("//----------------------------------------------------------------------------------------//");
        // Reverse Loop:

        String[] students = {"bahar", "shirin", "mohammad",};

        System.out.println(Arrays.toString(students));

        String revers = "";
        for (int i = words.length - 1; i >= words.length / 2; i--) { // if you put < 0 you condition is false at first

            revers = students[i];
            students[i] = students[words.length - i - 1];
            students[words.length - i - 1] = revers;
        }

        System.out.println(Arrays.toString(students));

        System.out.println("//----------------------------------------------------------------------------------------//");

        // important examples from last assessment :

        String ta = "A";
        ta = ta + "B";
        String tb = "C";
        ta.replace('C' , 'D');
        System.out.println(ta);

        System.out.println("//----------------------------------------------------------------------------------------//");

        String batch = "   Batch 22   ";

        int z = batch.trim().length();

        System.out.println(z);

        System.out.println("//----------------------------------------------------------------------------------------//");

        String s1 = "abcdefg";

        //String s2 = "" + s1.charAt(0) + s1.charAt(s1.length());
        // System.out.println(s2);

        System.out.println("//----------------------------------------------------------------------------------------//");
    }
}
