
03/22/2021
----------

Java Programming Day 20
-----------------------

String Manipulation methods.

String is a class. From String class we create objects:
String class -> String object
-> String object etc

Scanner -> import java.util.Scanner;
String  -> AUTO import java.lang.String


Scanner import:
-> import java.util.Scanner;
-> import java.util.*;
- import all classes from java.util package
* -> means everything.

When we use .* , it does not mean that all imported classes are loaded to our program. Only the ones that we actually use are loaded to our program.

String - it is a class, but we never had to import it.
System.out.println();
System is also a class, but we never had to import it.
Why?
Answer: They are automatically imported by compiler.

each class that we have been writing so far, compiler automatically added below import statement.

import java.lang.*; is automatically included.
But we can type if we want to.

-----------------------------------------------

package day01_intro;

import java.lang.*;

public class HelloWorld {
public static void main(String[] args) {
System.out.println("Hello World");
String word = "java";
}
}

Rodrigo Escobar — Today at 7:17 PM
do all ide do this or is it just intellij? - @Murodil

No, it is part of java, java compiler adds this import for us while translating our code.
-------------------------- 
package > import (s) > class

String object creation:

=> "hello" -> it is automatically a String object.
"hello".toUpperCase(); => HELLO
"" -> is also a empty string object. it is String object because of "".

=> String word = "java";
String today = "03/22/2021 Monday";
String str = "";

=> String cellPhone = new String("HTC");
String city = new String("Vienna/Ashburn");
String company = new String();

Java Memory management -> Stack, Heap (String pool)...

add new package day20_string_manipulation
import java.lang.*;
add new class StringCreationMethods
main method
String word1 = "potato";
String word2 = new String("tomato");

java.lang and java.util are packages.
* means import all classes.

import java.lang.*;
import java.util.*;

when you have import and it is grey color, it means it is a unused import. means: you imported but never used any class that comes from that import.

Make sure to not to have UNused import in your class before you submit your code for review.
==============================================

import java.lang.*;

above is automatically imported by compiler to each class, we do not need to type it.
String, System classes come from java.lang package.
-------------------------

STRING MANIPULATION METHODS:

-> equals()
-> equalsIgnoreCase()
-> startsWith(), endsWith()
-> toUpperCase(), toLowerCase();
-> length() - number of characters.

String str = "";
str.length() --> 0
---------------------
-> isEmpty() -> checks if a String is empty  "", returns boolean(true/false)

EX:
String car = "lexus";
System.out.println(car.isEmpty()); //false - NOT empty

	String city = " ";
	System.out.println(city.isEmpty()); //true

	System.out.println(city.length() == 0); //true
	System.out.println(city.equals("")); //true
	System.out.println(city.equalsIgnoreCase("")); //true


Mohammad Ali Ali Nazhed — Today at 8:20 PM
So empty method take true even for space


" " -> there is a space, respect the space. it is independent character in computer.
" " IS NOT empty. there 1 character (space) is there.

add new class StringIsEmpty
main method

String jobTitle = "";


3 STEPS TO LEARN ANY METHOD:

1) what does it accept:
   str.isEmpty();
   str.length();
   str.equals("some other string")
   -> some methods do not accept any inputs, some do.

2) what does method do: logic/purpose of the method:
   isEmpty -> checks if string is empty, no chars

   length() -> counts number of characters

3) what does method return
   isEmpty -> boolean
   length -> int
   toUpperCase() -> String
   Some methods/functions return value and some do not.
--------------------------------------

For Login test, as a practice check if userName or password are empty. if yes, print cannot be empty.

CONTAINS METHOD IN STRING:

Checks if string is within the variable value and returns true or false. It is case sensitive

String word = "java";
System.out.println(word.contains("v"));  //TRUE
System.out.println(word.contains("va")); //TRUE
System.out.println(word.contains("ja")); //TRUE
System.out.println(word.contains("a"));  //TRUE
System.out.println(word.contains("jv")); //FALSE
System.out.println(word.contains("Ja")); //FALSE

add new class StringContains
add main method

String email = "MURODIL@cybertekschool.com";
//CASE insensitive contains
if(email.toLowerCase().contains("d")) {
System.out.println("d is present");
}else{
System.out.println("d is not present");
}

Goes from left to right. first convert to lowercase, then check if "d" is present.
========================================

REPLACE() method in String class:

it searches in the string and replaces with another string.

String word = "java";

word.replace("a","u") -> "juvu"

String sentence = "java strings are fun";

add new class StringReplace
main method
