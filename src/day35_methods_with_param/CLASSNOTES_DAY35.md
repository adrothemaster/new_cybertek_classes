
04/13/2021
----------

java programming day 35
-----------------------

custom methods help with making our code reusable and also maintainable.

reusable -> we can call the method multiple times and it will work same way each time.
-> we can also pass parameters to the method and make custom methods even more re-usable and flexible

maintainable -> if we used the method in many different classes, and when there is need to update, we update in one place and it will affect each place it is called from.
----------------------------

public static void displayMessage() {
System.out.println("Hello world!");
}

CLASS A:
displayMessage(); //"Hello world!
displayMessage();//"Hello world!
CLASS B:
displayMessage();//"Hello world!

---------------------------
MAINTAINABLE:
Requirement that we need to display "Hello B22 Friends!"

public static void displayMessage() {
System.out.println("Hello B22 Friends!");
}

CLASS A:
displayMessage(); //"Hello B22 Friends!
displayMessage();//"Hello B22 Friends!
CLASS B:
displayMessage();//"Hello B22 Friends!
----------------------------

add new package day35_methods_with_param

add new class VoidMethods

method name: printAtoZ
A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z


DEBUGGER STEP OPTIONS:
- Step over => runs the the line and does not go into method body/details
- Step into => goes inside the method body to go line by line
- Step out => completes all steps in the method body and goes back to place the method was called from


SprintApplication.run();

--------------------------------

Method 2:

displayUSFlag
This method should print flag of USA in console.

Code for this:

public static void displayUSFlag() {
String p1 = "* * * * * * ==================================\n * * * * *  ==================================";
String p2 = "==============================================";
for (int i = 0; i < 4; i++) {
System.out.println(p1);
}
System.out.println("* * * * * * ==================================");
for (int i = 0; i < 6; i++) {
System.out.println(p2);
}
}

add new class MethodsWithInputs

public static void displayValue(int num) {
System.out.println("value is " + num);
}

METHOD WITH PARAMETERS/INPUTS:

When you want your methods to be flexible and more reusable, we can add input/parameter variables.
public static void method1(int n) {
//code
}

in above method 1, it accepts single int number.
So when we call the method, we need to provide a number.
HOW:

method1(); ERROR -> it is expecting an int number
method1(10); -> 10 will be assigned to n variable
method1(50); -> 50 will be assigned to n variable

public static void method1(int n) {
//code
}
----------------------------

add new class Counters

method name:
-count
-input: int num
it prints from 0 to that num in same line

count(5); ==> 0 1 2 3 4 5
count(7); ==> 0 1 2 3 4 5 6 7
count(2); ==> 0 1 2
=============================

I make sure the code I write is maintainable and reusable, by writing many custom methods with parameters for different programming and automation purposes.

add new class MultipleParams

new method:

Method name: showSum
params/inputs: double num1, double num2
it adds numbers and print result


Eun Lee — Today at 9:56 PM
@Murodil  showSum(scan.nextDouble(),scan.nextDouble());   is more common
or assign 2 variables?

Add new class Email

add new method buildEmail
@params/inputs: String name, String domain

buildEmail("saim","cybertekschool");
==> saim@cybertekschool.com

buildEmail("murodil","facebook");
==>murodil@facebook.com

buildEmail("John Ward III", "verizon");
==>john_ward_III@verizon.com

Methods with inputs/params:
We can include parameter, input variables for our methods, and when we call , we provide value to those variables.
