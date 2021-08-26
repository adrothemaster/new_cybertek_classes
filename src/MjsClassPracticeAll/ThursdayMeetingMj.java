package MjsClassPracticeAll;

import java.util.*;



public class ThursdayMeetingMj {

    public static void main(String[] args) {

        /**
         * Java is object oriented language, everything except primitives are objects in java programming.
         *
         * For that reason, there is a way to convert a primitive to an object ==> using WRAPPER CLASSES.
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
        //  int n = i; UNBOXING - object > primitive


//----------------------------------------------------------------------------------------------------------//
        /**
         *  ArrayList work as simple array but the size is changeable
         *  Array works with objects and primitives
         *  ArrayList just works with objects
         *  ArrayList -> is a class in java. that is used to store multiple sets of data like array.
         */
        // How to declare an ArrayList:
        //1)
        ArrayList list = new ArrayList(); // we can add multiple dataType
        list.add("hi");
        list.add(15);
        list.add(true);

        //2)
        ArrayList<String> myArray = new ArrayList<>(); // the capacity is ten but the size is zero

        //3)
        ArrayList<Integer> myArray1 = new ArrayList<>(100); // the capacity is 100 but the size is zero
        System.out.println("Size of myArray1 is : "+myArray1.size());

        // CAPACITY -> how many it could hold
        // SIZE -> how many actual values are there
        //4)
        ArrayList<Double> myArray2 = new ArrayList<Double>();
        //ArrayList<> myArray2 = new ArrayList<Double>(); it means we need to add data type on the left side but the right side is optional

        // asList() is another method in Arrays class.

        // how to add values into ArrayList directly:
        //5)
        List<Integer> myArray3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        //6)
        List<Integer> myArray4 = new ArrayList<>();
        myArray4 = Arrays.asList(5, 6 ,7 ,8);

        myArray4 = Arrays.asList(3, 4, 5);

        System.out.println(myArray4); // we re assign the ArrayList

        //       but it does not work in this way:
        //       List<Integer> myArray4 = new ArrayList<>();
        //       myArray4 = Arrays.asList(5, 6 ,7 ,8);

        List<Integer> myArray5 = new ArrayList<>();
        myArray5.addAll(Arrays.asList(7, 8, 9, 10));

        myArray3.addAll(myArray5); // add all value from another Array to new array.

        System.out.println("myArray5 = " + myArray5);

        //----------------------------------------------------------------------------------------------------------//
        // Methods in ArrayList:
        // .add() ==>  add value to the end of array
        // .add(index:  , element:   )  add specific element to specific index
        // add value to the ArrayList
        // this is boolean methods: it means return boolean value and add number


        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4 ,5));
        System.out.println("nums = " + nums); // one of benefits of ArrayList == allow to print directly

        // two different method for adding :
        nums.add(3); // this line is optional/example
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
        //  remove(index) ==> to remove value at the given index:
        //  return the value of that index and then remove it

        List<Integer> nums1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4 ,5));

        nums1.remove(2);
        System.out.println("nums1 = " + nums1);
        System.out.println(nums1.remove(3)); // return the value
        System.out.println("nums1 = " + nums1); // also remove it

        // remove(value) ==>

        nums1.remove("2"); // return boolean
        System.out.println(nums1.remove("2")); // false== since we dont have "2"

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

        ArrayList<Integer> nums5 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        // .get() ==>
        nums5.get(2); // return a value ==> what ever we have in index 2
        System.out.println(nums5.get(2));
        // to read the index of ArrayList
        // str[0] / str.get(0)

        // .add() // increasing or add value to ArrayList
        // .add(int) --> return boolean
        nums5.add(3); // 1, 2, 3, 4, 5 + 3
        nums5.add(3, 6); // add element to specific index


        // .remover() // remove element
        // remove(index) ==> return Integer
        nums5.remove(3); //
        System.out.println("----------------------");
        System.out.println(nums.remove(3));
        System.out.println(nums);
        nums.remove(new Integer(1));
        System.out.println("-----");
        System.out.println(nums.remove(new Integer(6)));
        System.out.println(nums);
        // return boolean
        // (1, 2, 3, 4, 5)
        System.out.println(nums.remove("3")); //

        // .contain()
        ArrayList<String> words5 = new ArrayList<>(Arrays.asList("mj", "rahib" ,"Meerim" , "max"));
        System.out.println("-----0000---");
        System.out.println(words5.contains("ramin"));  //==>

        System.out.println(words5.indexOf("rahib"));

        System.out.println(words5.remove(3)); // max
        // .set()
        // set is a method which accept two parameters ( index , value )
        // two action happen at the same time :
        // 1) method will replace whatever we have in the index with value
        // 2) it will return the original value of that index (before replacing)

        // Collections:
        //    - sort
        //    - reverse
        //    - frequency
        //    - min,max
        //    - replaceAll
        //    - shuffle

        // Array into ArrayList:
        //
        String [] a = {"123" , "456", "789"};
        String [] b = {"abc" , "defg" , "san jose"};
        String [] c = {"@" , "$" , "#"};

        ArrayList<String []> list3 = new ArrayList<>(Arrays.asList(a, b, c));

        System.out.println(list3.get(1)[2].substring(4));

        // outer loop to read all index in ArrayList
        // inner loop to read all index in Array


        System.out.println(list.size());

        System.out.println(list3.get(0)[0]);

        System.out.println(Arrays.toString(list3.get(0)));

        System.out.println(Arrays.deepToString(list3.toArray()));




//        System.out.println(Arrays.toString(list.get(0)));
//        System.out.println(Arrays.deepToString(list.toArray()));









    }

}