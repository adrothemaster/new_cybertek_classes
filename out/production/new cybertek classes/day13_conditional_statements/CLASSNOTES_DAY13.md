
03/10/2021
----------

Java Programming Day 13
-----------------------

Conditional Statements in Java

All conditional statements work with boolean (true|false).
EX:
if(boolean condition) {
//code to run if condition is TRUE
} else {
//code to run if condition is FALSE
}

char letter = 'Q';
if(letter == 'Q') {
System.out.println("Letter is Q");
} else {
System.out.println("Letter is NOT Q");
}

if(letter == 'U') {
System.out.println("Letter is Q");
} else {
System.out.println("Letter is NOT Q");
}

if condition is true, IF BLOCK code will run.
if condition is false. ELSE BLOCK code will run.

package day13_conditional_statements
add new class ATMPincodeProgram
main method
print "**** WELCOME TO TD BANK ATM ****"
secretPincode => ****
inputPincode => ****

if condition checks if secretPincode equals inputPincode
true:
"Welcome to your account."
"You can withdraw, check balance, deposit"
false:
"Incorrect pincode! 1234"
"Please try again."


print "Thank you for using TD Bank ATM!"
=========================================

DEBUGGING USING INTELLIJ.

When you have bug in your code, and you want to find and fix it, You need todo debug run.

Steps:
1) put breakpoint by clicking on left side panel where line numbers are. if you do not do this step, debug will not work

	2) Run as DEBUG (BUG ICON)

It will start the program and pause at the breakpoint line.

	3) Goto panel below and click on CONSOLE
	4) Click on Step Over(broken Arrow) to go step by step.

BENEFIT of DEBUGGING:

-> you can see the flow of execution of your code, and variables values step by step and figure out where is the issue.
======================================================

temp = 70 or more is nice day

new class NiceDayOrNot
main method

temp -> 71

temp = 70 or more is nice day
if true:
"It is a beautiful day!"
"Lets code java"

	else
		"It is kind of cold today"
		"Stay home and code java"
---------------

add new class BonusCalculator
main method

bonus = 0;
salesAmount = 2000.55;

if salesAmount <= 1000
"Good job, you qualified for bonus!"
-> assign 50 to bonus
else
"Great job, you are qualified for full bonus"
-> assign 100 to bonus

Your bonus for salesAmount is $100
==============================

AUTO FORMAT SHORTCUT IN INTELLIJ:

Mac:
Command + Option + L

Windows:
Control + Alt + L
=============================

add new class IFWithBooleanVariable
add main method

isHungry -> true / false

check isHungry:
true:
print out "I am hungry I will go get something to eat"
"Then code java"
false
print out "I am not hungry, Lets keep coding java"

==============================

IF STATEMENT WITH STRING.

We can check if String value equals some other value. We cannot compare if it is >, <=, >=, <.
We can do equals comparison.
there 2 ways we can compare string if it is equal something:

1) Using == operator
   String city = "Fairfax";
   if(city == "Fairfax") {
   print "it is Fairfax";
   }

2) using equals() method/function
   String city = "Los Angeles";
   if(city.equals("Los Angeles")) {
   print "it is LA"
   }else{
   print "it is not LA"
   }

add new class StringComparison
add main method

