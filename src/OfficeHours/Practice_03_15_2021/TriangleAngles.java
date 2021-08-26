package OfficeHours.Practice_03_15_2021;

public class TriangleAngles {

    public static void main(String[] args) {

        /*

    A triangle is valid if the sum of all the three angles is equal to 180 degrees.
     Write a program that declares three integers as angles and check whether the
     triangle is valid or not. Print "Valid triangle" or "Not a valid triangle".

         */

        int angleOne = 101;
        int angleTwo = 30;
        int angleThree = 50; //scan.nextInt()

//        int sum = angleOne + angleTwo + angleThree;
//        if(sum == 180) {
//            System.out.println("Valid triangle");
//        } else {
//            System.out.println("Invalid triangle");
//        }


        if((angleOne + angleTwo + angleThree) == 180) {
            System.out.println("Valid triangle");
        } else {
            System.out.println("Invalid triangle");
        }

        boolean check = (angleOne + angleTwo + angleThree) == 180;
        if(check) {
            System.out.println("Valid triangle");
        } else {
            System.out.println("Invalid triangle");
        }

        if((angleOne + angleTwo + angleThree) != 180) {
            System.out.println("Invalid triangle");
        } else {
            System.out.println("Valid triangle");
        }

    }

}
