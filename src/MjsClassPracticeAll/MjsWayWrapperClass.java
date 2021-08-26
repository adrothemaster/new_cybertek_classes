package MjsClassPracticeAll;

import java.util.*;
import java.util.Arrays;

public class MjsWayWrapperClass {
    public static void main(String[] args) {

        /**
         * Java is object oriented language, everything except primitives are objects in java programming.
         *
         * For that reason, there is a way to convert a primitive to an object using WRAPPER CLASSES.
         *
         * primitive -> just single piece of data, and no behaviour.
         * Object -> can have multiple data, and behaviour.
         *
         * Auto-boxing is converting from primitive to wrapper class object.
         * Un-boxing is converting from wrapper class object to a primitive.
         *
         */

        // look always the left side of equation:
        Integer i = new Integer(345);

//----------------------------------------------------------------------------------------------------------//
        /**
         *  ArrayList work as simple array but the size is changeable
         *  Array works with objects and primitives
         *  ArrayList just works with objects
         */
        // How to declare an ArrayList:

        ArrayList<String> myArray = new ArrayList<>(); // the capacity is ten but the size is zero
        ArrayList<Integer> myArray1 = new ArrayList<>(100); // the capacity is 100 but the size is zero
        System.out.println("Size of myArray1 is : "+myArray1.size());

        ArrayList<Double> myArray2 = new ArrayList<Double>();
        //ArrayList<> myArray2 = new ArrayList<Double>(); it means we need to add data type on the left side

        // how to add values into ArrayList directly:
        List<Integer> myArray3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

        List<Integer> myArray4 = new ArrayList<>();
        myArray4 = Arrays.asList(5, 6 ,7 ,8);

        myArray4 = Arrays.asList(3, 4, 5);

        System.out.println(myArray4); // we re assign the ArrayList

        // but it does not work in this way:
        //       List<Integer> myArray4 = new ArrayList<>();
        //       myArray4 = Arrays.asList(5, 6 ,7 ,8);

        List<Integer> myArray5 = new ArrayList<>();
        myArray5.addAll(Arrays.asList(7, 8, 9, 10));

        myArray3.addAll(myArray5); // add all value from another Array to new array.

        System.out.println("myArray5 = " + myArray5);

        //----------------------------------------------------------------------------------------------------------//
        // Methods in ArrayList:
        // .add()


        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4 ,5));
        System.out.println("nums = " + nums); // one of benefits of ArrayList == allow to print directly

        // two different method for adding :
        nums.add(3); // this is boolean methods: it means return boolean value and add number
        System.out.println(nums.add(3));
        // it will add value to the last index automatically
        System.out.println("nums after add 3 = " + nums);

        //
        nums.add(2, 4); // add element into the specific index
        System.out.println("nums = " + nums);

        //System.out.println(nums.add(3, 5)); you can not print it since this is void method !!!

        //----------------------------------------------------------------------------------------------------------//
        //  .get() ==> to read value of specific index of your ArrayList
        System.out.println(nums.get(4));

        //----------------------------------------------------------------------------------------------------------//
        //  remove(index) ==> to remove value at the given index: // return the value of that index and then remove it

        nums.remove(2);
        System.out.println("nums = " + nums);
        System.out.println(nums.remove(3)); // return the value
        System.out.println("nums = " + nums); // also remove it

        // remove(value) ==>

        nums.remove("2"); // return boolean
        System.out.println(nums.remove("2")); // false== since we dont have "2"

        List<String> words = new ArrayList<>(Arrays.asList("apple" , "banana" , "kiwi"));
        words.remove(1); // will remove whatever is inside the index one
        System.out.println("words = " + words);
        words.remove("kiwi");
        System.out.println("words = " + words); // remove specific Object
        System.out.println(words.remove("apple")); //
        System.out.println("words = " + words); // not only will remove the apple, but it returns a boolean

        List<String> words2 = new ArrayList<>(Arrays.asList("mj" , "mohammad" , "javad" , "semati"));
        System.out.println("words2 = " + words2);
        words2.removeAll(words2);
        System.out.println("words2 = " + words2);

        //----------------------------------------------------------------------------------------------------------//
        // .isEmpty() ==> returns boolean

        words2.isEmpty();
        System.out.println(words2.isEmpty());

        //----------------------------------------------------------------------------------------------------------//
        // .Contain() ==> return true or false if the value is contain or not

        System.out.println("nums = " + nums);
        System.out.println(nums.contains(8)); // return
        // contain all:
        words = new ArrayList<>(Arrays.asList("apple" , "banana" , "kiwi"));
        words2 = new ArrayList<>(Arrays.asList("mj" , "mohammad" , "javad" , "semati"));
        System.out.println("words = " + words);
        System.out.println("words2 = " + words2);
        System.out.println(words2.containsAll(words));

        //----------------------------------------------------------------------------------------------------------//
        // clear() ==> void method
        words.clear();
        System.out.println("words = " + words);
        //----------------------------------------------------------------------------------------------------------//
        // .set() replace and update value at certain index:
        // this is method with two parameters ( int , value )
        // and also it will return the original value of certain index

        System.out.println("words2 = " + words2);
        words2.set(2, "orange");
        System.out.println("words2 = " + words2);

        System.out.println(words2.set(1, "ZZZ")); // print mohammad and replace it with ZZZ at the same time

        System.out.println("nums = " + nums);
        nums.set(2 , 0);
        System.out.println("nums = " + nums);


        nums.set(nums.indexOf(3) , 10);
        System.out.println("nums = " + nums);

        nums.set(nums.indexOf(3) , 10);
        System.out.println("nums = " + nums);

        //        nums.set(nums.indexOf(3) , 10);
        //        System.out.println("nums = " + nums);

        System.out.println("words2 = " + words2);
        //   words2.set(words2.indexOf(0) , "AAA");
        //   System.out.println("words2 = " + words2);

        words2.set(0 , "aAa");
        System.out.println("words2 = " + words2);

        //----------------------------------------------------------------------------------------------------------//
        ArrayList<Integer> nums3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> nums4 = Arrays.asList(5, 6 ,7 ,8);

//        System.out.println("nums4 = " + nums4);
//        nums4.add(4); // UnsupportedOperationException

        //----------------------------------------------------------------------------------------------------------//
        // Collections:
        //    - sort
        //    - reverse
        //    - frequency
        //    - min,max
        //    - replaceAll
        //    - shuffle

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(100 , -8 , -2 , 9, 3, 23));

        Collections.addAll(numbers , 1, 2, 3, 4);
        System.out.println("numbers = " + numbers);

        Collections.sort(numbers);

        //----------------------------------------------------------------------------------------------------------//
        // Array into ArrayList:

        String [] a = {"123" , "456", "789"};
        String [] b = {"abc" , "defg" , "hijk"};
        String [] c = {"@" , "$" , "#"};

        ArrayList<String[]> abc = new ArrayList<>(Arrays.asList(a, b, c));

        // I want to print "6 fg $"

        System.out.println("abc = " + abc); // I can not print array directly
        System.out.println(Arrays.toString(abc.get(0)));

        System.out.println(abc.get(0)[1]); // print the index one of the first element of your arraylist

        System.out.println(abc.get(1)[2].substring(2)); // jk






        // Array to ArrayList

       // String [] a = {"123" , "456", "789"};
        //String [] b = {"abc" , "defg" , "hijk"};
        //String [] c = {"@" , "$" , "#"};

        //System.out.println(Arrays.toString(a));


        ArrayList<String[]> newABC = new ArrayList<>(); // [a , b , c]
        newABC.add(a);
        newABC.add(b);
        newABC.add(c);

        System.out.println(Arrays.toString(newABC.get(0)));

        System.out.println(newABC.get(0)[1]);

        // how to print "jk"

        System.out.println(newABC.get(1)[2].substring(2));

        // newABC.get(1) == b
        // b[2] == "hijk"
        // "hijk".substring(2)
        // j start from 0 3
//        System.out.println("-----------------");
//        System.out.println(newABC.size());
//        for (int j = 0; j < newABC.size(); j++) {
//            System.out.println((newABC.get(j)[j]));
//        }
//
        //-------------------------------//
        //        String [] a = {"123" , "456", "789"};
        //        String [] b = {"abc" , "defg" , "hijk"};
        //        String [] c = {"@" , "$" , "#"};

        System.out.println("-------------------------------");

        for (int j = 0; j < newABC.size (); j++) { // outer loop to check each arrays

            for (int k = 0; k < newABC.get(j).length ; k++) {
                System.out.print(newABC.get(j)[k]+ ", ");
            }
            System.out.println();
        }

        int[] words3 = {1, 2, 3, 4, 5, 6};

        for (int j = 0; j < words3.length; j++) {
            if (j == words3.length -1 ) // last round of the loop just print the index without any comma
                System.out.print(words3[j]);
            else
                System.out.print(words3[j] + ", ");
        }



        ArrayList<Integer> words4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        // I want to print every other number
        // [2, 4, 6]
        System.out.println();
        System.out.println("------------------------");
        //(1, 2, 3, 4, 5, 6)

        // (2, 3, 4, 5, 6)

//        (2, 4, 6)

        for (int j = 0; j < words4.size(); j++) {
            System.out.print(words4.remove(j));
        }











    }
}

