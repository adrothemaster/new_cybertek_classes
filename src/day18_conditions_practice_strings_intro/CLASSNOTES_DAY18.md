03/20/2021
----------

Java Programming Day 18
-----------------------

Java for test automation:
java basics -> can be applied for any sort of programming.
automation with java:
selenium, junit, cucumber etc etc
rest automation

----------------------------------

package day18_conditions_practice_strings_intro
Add new class MultiBranchIf

number => 5

number is more than 0
print 5 is positive
number is less than 0
print number is negative
number equal 0:
print number is zero
=============================

add new class IfWithoutCurlyBraces
add main method

String todaysClass = "python";

if(todaysClass.equals("java"))
System.out.println("java is fun");
else
System.out.println("it is not java. it is " + todaysClass);

Sometimes, we can skip using curly {} braces with if conditions.
WHEN:
when we have ONLY 1 statement in IF block or ELSE block.
If we have more than 1 statement (;) then we MUST use { } to work.

ADVICE:
always use curly braces, does not matter 1 or more statements. NO benefit of skipping { }

int score = 1;

if(score == 1) {
System.out.println("lowest score 1");
} else if (score == 2) {
System.out.println("score is 2");
} else if (score == 3) {
System.out.println("score is 3");
} else {
System.out.println("invalid score");
}

if(score == 1)
System.out.println("lowest score 1");
else if (score == 2)
System.out.println("score is 2");
else if (score == 3)
System.out.println("score is 3");
else
System.out.println("invalid score");
---------------------
Above example both will work, because we have only 1 statement for each condition.

for below statement , we cannot use without curly braces:

int score = 1;
if(score > 0) {
System.out.println("pass");
System.out.println("your score is " + score);
} else {
System.out.println("fail");
System.out.println("your score is " + score);
}

--
ERROR BELOW:
int score = 1;
if(score > 0)
System.out.println("pass");
System.out.println("your score is " + score);
else
System.out.println("fail");
System.out.println("your score is " + score);
------------------------

int a = 1;

if(a == 1) {
System.out.println("a is 1");
System.out.println("1 is a");
}

OUTPUT:
a is 1
1 is a
========================
int a = 2;

if(a == 1) {
System.out.println("a is 1");
System.out.println("1 is a");
}

NO OUTPUT because condition is false:
==========================
int a = 2;

if(a == 1)
System.out.println("a is 1");
System.out.println("1 is a");

OUTPUT:
1 is a

In above example, only first print statement is related to IF block. second print statement is outside if block and will always run.

RULE:
Always use curly braces, so you dont go wrong.

=================================

int a = 1;

if(a == 1)
System.out.println("a is 1");
System.out.println("1 is a");

OUTPUT:
a is 1
1 is a
==============================

Only single statement will be part of if block if we skip { }.
Again. A l w a y s --- u s e   c u r l y   b r a c e s.

Popular general use of if without { }
if(condition) return false;
We will learn in future.
===============================

NUMBER IS DIVISABLE by ANOTHER NUMBER:

meaning:
There is no remainder(0) when we divide

In java: how do we check if number is divisable by another number?
% -> remainer operator/modulus can be used.

even/odd
FizzBuzz
=====================================

When a number is divisable by 2 then it is an EVEN number.
EVEN -> divisable by 2 (no remainder - 0)
ODD  -> NOT divisable by 2 (remainder is 1)

add new class EvenOrOdd
main method

num = 4;

when num is divisable by 2
print num is even
otherwise
print num is odd
==================================

multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”. For numbers which are multiples of both three and five print “FizzBuzz”.
--------------------------------
add new class FizzBuzz
main method
multi branch if statement

number = 5

"FizzBuzz" -> when number is divisible by 3 and(&&) 5
"Fizz" -> when number is divisible by 3
"Buzz" -> when number is divisible by 5

int number = 11;
if(number % 3 == 0 && number % 5 == 0) {
System.out.println("FizzBuzz");
}else if (number % 3 == 0) {
System.out.println("Fizz");
}else if (number % 5 == 0) {
System.out.println("Buzz");
}else {
System.out.println(number);
}

Order of if conditions is important, because in multi branch if statement, when first true condition is found, then the rest of conditions will be skipped/not checked.

--------------------------------

INTELLIJ TIP:
COMMAND/CONTROL + SHIFT + F
Universal search in project

COMMAND/CONTROL + SHIFT + R
Universal search and replace in project
=========================================

RangeChecks with numbers/chars

age:
1 - 3 -> baby
3 - 7 -> toddler
7 - ........

score:
1-40 -> D
40-60-> C
60-90 ->B
90-100 ->A...
========================================
add class ScoreRangeTest
main method
(score >=1 && score <= 40)
score:
1-40   -> D
41-60  -> C
61-90  -> B
91-100 ->A...
else
'invalid score'
-----------------------------

Guest Friend : Roman

Jorge Flores — Today at 2:34 PM
lets focus on the class people!!


int score = 50;
if(score <= 0 || score > 100){
System.out.println("Invalid score = " + score);
}

score = -5; ==> true -> less than 0
score = 101;==> true -> more than 100
======================================
add new class ThreeNumbers
main method

3 numbers , find the largest value.
if all are equal, print any of them.
if 2 are largest and equal, print either one
just print largest one.

num1,num2,num3

print "Largest value: 44"

num1 = 100;
num2 = 44;
num3 = 11;
===========================
new class AuthenticationTest
main method

last4SSN
pinCode

expLast4SSN
expPinCode
------------------------------
when both match:
"Authentication successful"
when expLast4SSN does not match:
"Last 4 of SSN did not match"
when pinCode does not match:
"pinCode did not match"
================================

add new class CarLeasingTest

Make => Mercedes
Model =>  E
leasePrice = 500
Model => A
leasePrice = 400

Make => Audi
Model =>  SQ5
leasePrice = 552
Model => A3
leasePrice = 412

print summary
======================

hackerrank.com


add new class SwitchSeasonFinder
main method

Winter: 12,1,2
Spring: 3,4,5
Summer: 6,7,8
Fall:   9,10,11

when month = 2;
OUTPUT:
"Winter"

when month = 7;
OUTPUT:
"Summer"
----------------------

Winter: 12,1,2

int month = 1;
if(month == 12 || month == 1 || month == 2) {
System.out.println("Winter");
}

switch(month) {
case 12:
case 1:
case 2:
System.out.println("Winter");
break;
}

DRY principle--> Don't Repeat Yourself



int num1 = 20;
int num2 = 10;

switch(num1) {
case 10:
num1++;
num2+=10;
break;
case 20:
num1+=num2;
num2--;
case 30:
num1 = 0;
num2 -= 3;
break;
}
num1 = 11
num2 = 20
---------

add new class SwithCheckNumbers
main method
