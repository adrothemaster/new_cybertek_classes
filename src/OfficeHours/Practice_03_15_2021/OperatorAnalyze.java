package OfficeHours.Practice_03_15_2021;

public class OperatorAnalyze {

    public static void main(String[] args) {

        /*
        Analyze the following without intellij. Calculate the output step by step
         */
        int a = 5; // a = 6
        int b = a++ + a-- + a * 2 + a + ++a;
        //      5   + 6  +  5 * 2 + 5 + 6
        //      5   + 6  +  10 + 5 + 6
        //      11  +  10 + 5 + 6
        //      21 + 5 + 6
        //      26 + 6
        //   b =  32
        System.out.println("a- " + a);
        System.out.println("b-  " + b);
    }
}
