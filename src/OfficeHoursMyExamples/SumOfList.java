package OfficeHoursMyExamples;

import java.util.ArrayList;
import java.util.Arrays;

public class SumOfList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("123", "54", "24"));

        //convert "123" to ints
        // "123" to int 123;

//        char temp = list.get(0).charAt(2);
//        System.out.println(temp);
//
//        System.out.println("numbers = " + numbers);
//
//        for (int i = 0; i < list.size(); i++) {
//            int count = 0;
//        }
        for (int i = 0; i < list.size(); i++) {
            int length = list.get(i).length();
            int count_total = 0;

            for (int j = 0; j < length; j++) {
                char temp = list.get(i).charAt(j);
                int num = Integer.parseInt(temp+"");
                count_total += num;
                //System.out.println("temp = " + temp);
            }
            //System.out.println("count_total = " + count_total);
            list.set(i,count_total+"");
        }
        System.out.println("list = " + list);
    }
}

