
03/09/2021
----------

Java programming Day 12
-----------------------

Comparison, Boolean, Relational Operators in Java
-------------------------------------------------

All boolean operators product boolean value (true or false) based on comparison result.

== , > , < , >=, <=, !=

All above operators compare 2 values and return true or false.

int num1 = 12_000;
int num2 = 32_425_452;
int num3 = _100; <-- ERROR
int num4 = 234_; <--- ERROR
double d = 23_44.44; <- OK

We can use underscores when assigning numbers. Underscore _ needs to be in between numbers. Cannot be in the beginning or at the end.
The purpose is to make easier for humans to read the number.

12345674 -> 12_345_674
==========================
== , > , < , >=, <=, !=

int num1 = 12_000;
int num2 = 32_425_452;

num1 == num2 -> result of comparison is FALSE. boolean. Because num1 is not equal to num2. == -> checks if 2 values are EQUAL. if yes, returns true, otherwise returns false.

add new package day12_conditional_statements
add new class ComparisonExamples
main method

declare 3 variables,
currentSpeed -> 45
speedLimit -> 55
isSpeeding -> true if speeding, false if not speeding

print
"Are you speeding? - " true/false


ABCDEFG..

A < B -> A is considered smaller than B.
The earlier it appears in alphabet, it will be smaller than letters that appear later in alphabet.
When we compare Chars we actually compare ASCII number behind them.

add new class CompareChars
add main method

letter1, letter2 assign char values.
print and check if they are equal
print and check if letter1 is larger than letter2
print and check if letter2 is larger than letter1
===================================================

CONDITIONAL STATEMENTS IN JAVA:

We use conditional statement in our daily lives. If it is raining, get umbrella. If car gas is showing low, goto gas station.
if John is hungry , he eats.
If cellphone battery is low, charge it, otherwise keep using it.
etc etc.

we IF STATEMENT in java for conditions.
It works with BOOLEAN conditionals.

if(10 > 5){
System.out.println("CONDITION IS TRUE -> 10 IS GREATER THAN 5");
}else {
System.out.println("CONDITION IS FALSE");
}

add new java class IfElseStatement
main method

A
if(CONDITION){
B
}else{
C
}
D
-----------------

1) CONDITION IS TRUE:
   A -> because it is before if statement, does not depend on condition.
   B -> because condition is true
   D -> because it is after if statement. does not depend on condition.

C -> is SKIPPED. because condition is TRUE.

2) CONDITION IS FALSE:
   A -> because it is before if statement, does not depend on condition.
   C -> because condition is false. it will goto ELSE
   D -> because it is after if statement. does not depend on condition.


B -> is skipped because condition is TRUE
===================================

add a class AmazonFreeShipping
add main method
import scanner
create scanner object
ask "Enter total price"
assign value to totalPrice from scan.nextDouble.

if totalPrice is more than or equal to 25
print "FREE SHIPPING ELIGIBILE. Your order total: $55"
ELSE
print "NOT ELIGIBLE FOR FREE SHIPPING. Your order total is $10. less than minimum of $25"












