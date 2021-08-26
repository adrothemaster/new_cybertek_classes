package OfficeHours.Practice_03_17_2021;

/*
Have a pre-condition(Outer if): if age > 120 or less than 0 ==> invalid entry, and nothing else is checked.

Age groups:
Infant (< 1 year), Toddler (3 - 5), Kid (6 - 9), Pre-Teen (10 - 12), Teenager (13 - 17), Young Adult (18 - 20), Adult (21 - 39), Young Middle-Aged Adult (40 - 49), Middle-Aged Adult (50 - 54), Very Young Senior Citizen (55 - 64), Young Senior Citizen (65 - 74), Senior Citizen (75 - 84), Old Senior Citizen (85+)

Based on the given age find and print which age group they are in.

 */


public class AgeGroup {
    public static void main(String[] args) {

        int age = 10;

        if(age > 0 && age < 120 ) { // if (age > 120 || age < 0)
            // valid age

            if(age <= 2) {
                System.out.println("Infant");
            } else if(age >= 3 && age <= 5 ) {  // 3-5  vs  age <= 5
                System.out.println("Toddler");
            } else if (age >= 6 && age <= 9) {
                System.out.println("Kid");

            // } else if {
            // } else if {
            // } else if {

            } else {
                System.out.println("Old Senior Citizen ");
            }

            // The rest of the else if

           // 3 <= age <=5 --> not possible in java

        } else {
            System.out.println("Invalid age");
        }


    }

}
