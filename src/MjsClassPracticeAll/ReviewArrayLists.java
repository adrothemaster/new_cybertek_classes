package MjsClassPracticeAll;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReviewArrayLists {
    public static void main(String[] args) {
        Integer i = new Integer(52);
        int n = Integer.parseInt("23");

        ArrayList<String> myArray = new ArrayList<>();
        ArrayList<String> myArray2 = new ArrayList<>(100);
        System.out.println("myArray2.size() = " + myArray2.size());
        List<String> myArray3 = new ArrayList<>();

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println("nums = " + nums);

       // nums = Arrays.asList(2,3,4,5,6);
        System.out.println("nums = " + nums);

        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.addAll(Arrays.asList(6,7,8,9));
        System.out.println("nums1 = " + nums1);

        nums.add(2);
        System.out.println("nums = " + nums);
        System.out.println(nums.add(3));
        System.out.println("nums = " + nums);

        nums.add(3,5);
        System.out.println("nums = " + nums);


        System.out.println(nums.get(2));


        nums.remove(0);
        System.out.println("nums = " + nums);
        System.out.println(nums.remove(1));

        nums.remove("2");
        System.out.println(nums.remove("2"));
        System.out.println("nums = " + nums);

        ArrayList<String> words = new ArrayList<>(Arrays.asList("Adrien" , "Frederic" , "Marie" , "Frederic" , "Thibaud"));

        words.remove(1);
        System.out.println("words = " + words);
        words.remove("Frederic");
        System.out.println("words = " + words);
        words.remove("Marie");
        System.out.println("words = " + words);
        words.remove("Thibaud");
        System.out.println("words = " + words);

        System.out.println(words.remove("Adrien"));
        System.out.println("words = " + words);

        if (words.remove("Adrien")) {
            System.out.println("hello guys");
        }else {
            System.out.println("hello folks");


            System.out.println(words.isEmpty());

            words = new ArrayList<>(Arrays.asList("kiwi" , "apple" , "banana" , "grapes" , "pears"));
            ArrayList<String> words2 = new ArrayList<>(Arrays.asList("kiwi" , "apple" , "banana" , "grapes" , "pears"));
            System.out.println(words);

            System.out.println(words.contains("apple"));
            System.out.println(words2.containsAll(words));

             words.set(2, "orange");
           // System.out.println("words = " + words);

            System.out.println(words.set(2, "orange"));
            System.out.println("words = " + words);

            ArrayList<Integer> num4 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
            System.out.println(num4.indexOf(0));
            num4.set(num4.indexOf(2) , 10);
            System.out.println(num4);

            System.out.println(words);

            System.out.println(words.set(words.indexOf("orange") , "grapes"));
        // System.out.println(words.set(1 , "grapes"));
            System.out.println(words);


            words.set(words.indexOf("apple"), "kiwi");
            System.out.println(words);

            System.out.println(words.set(words.indexOf("kiwi"), "lime"));
            System.out.println(words);

            System.out.println(words.set(words.indexOf("grapes"), "pineapple"));
            System.out.println(words);

            String [] a = {"123" , "456" , "789"};
            String [] b = {"abc" , "defg" , "hijk"};
            String [] c = {"@" , "$" , "#"};

            System.out.println(Arrays.toString(a));

            ArrayList<String[]> newABC = new ArrayList<>();
            newABC.add(a);
            newABC.add(b);
            newABC.add(c);

            System.out.println(Arrays.toString(newABC.get(0)));

            System.out.println(newABC.get(0) [1]);


            System.out.println(newABC.get(1)[2].substring(2));

            for (int j = 0; j < newABC.size(); j++) {
                System.out.println(Arrays.toString(newABC.get(j)));
            }
                for (int z = 0; z < newABC.size(); z++) {
                    System.out.println((newABC.get(z)[z]));
                }
            System.out.println("_____________________________");
            for (int j = 0; j < newABC.size(); j++) {
                for (int k = 0; k < newABC.get(j).length; k++) {

                    System.out.print(newABC.get(j)[k]+", ");
                }
                System.out.println();
            }
            int [] words3 = {1,2,3,4,5,6};
            for (int j = 0; j < words3.length; j++) {
                if (j == words3.length -1)
                    System.out.print(words3[j]);
                else
                    System.out.print(words3[j] + ", ");
            }
            System.out.println();
            System.out.println("________________________________");
            ArrayList<Integer> words4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
            for (int j = 0; j < words4.size(); j++) {
                System.out.println(words4.remove(j));
            }
        }
    }
}
