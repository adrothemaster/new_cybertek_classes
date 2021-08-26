package OfficeHours.Practice_04_06_2021;

import java.util.Random;

public class RandomSixDigitNumber {

    /*
    CHALLENGE – THIS WILL MAY BE DIFFICILT BUT TRY IT. DON’T SPEND TOO MUCH TIME
    Generate a random number that is six digits long. Each digit in this number should be unique, meaning the number 6 digit number should have 6 different character numbers that make it up. Print the number.
    HINTS: Loops, Strings, Random
     */

    public static void main(String[] args) {

        Random random = new Random();

        String randomNumber = "";//234156

        while (randomNumber.length() != 6){

            int eachRandom = random.nextInt(10); // 0 - 9
           // int eachRandom = random.nextInt(9) + 1; // 1 - 9
            if(!randomNumber.contains(""+eachRandom)){
                randomNumber += eachRandom;
            }

        }

        System.out.println("Random Number: " + randomNumber);




    }
}
