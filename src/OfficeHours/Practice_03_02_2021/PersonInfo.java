package OfficeHours.Practice_03_02_2021;

// src -> new package called OfficeHours -> new package called
//  Practice_03_02_2021

/*
Make a class PersonInfo
make a main method

    Create variables and give value related to you:

        - String name
        - byte age
        - char gender
        - boolean student
        - short number of siblings
        - long favorite number
        - int number of seasons in your area
        - double birth date: (month.day)
        - int year
        - String full birthday date with year
        - String favorite quote

        - Print the person information

     */

public class PersonInfo {

    public static void main(String [] args) {

        // Varibles without any data

        String name, fullBirthDate, favoriteQuote;
        byte age;
        char gender;
        boolean isStudent;
        short numberOfSiblings;
        long favoriteNumber;
        int numberOfSeasons, year;
        double birthDate;

        // Assignment of data

        name = "Saim";
        age = 50;
        gender = 'M';
        isStudent = true;
        numberOfSiblings = 5;
        favoriteNumber = 3L;
        numberOfSeasons= 4;
        birthDate = 3.2;
        year = 2021;
        fullBirthDate = "" + birthDate + "." + year; // 3.2.2021
      //  fullBirthDate = birthDate + year + "" ; // 2024.2 -> adds first then turns to String
        favoriteQuote = "have a good mindset";


        // Printing information based on variables
        System.out.println("----Person Information----");
        System.out.println("Name: " + name);
        System.out.println("Age: "+ age);
        System.out.println("Gender: " + gender);
        System.out.println("Are you a student: " + isStudent);
        System.out.println("Number of siblings: " + numberOfSiblings);
        System.out.println("Favorite number:" + favoriteNumber);
        System.out.println("Seasons in your area: " + numberOfSeasons);
        System.out.println("Full birthdate: " + fullBirthDate);
        System.out.println("My favorite quote: " + favoriteQuote);


    }
}
