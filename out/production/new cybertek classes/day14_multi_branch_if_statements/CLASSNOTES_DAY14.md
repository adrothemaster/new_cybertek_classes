
03/13/2021
----------

Java Programming Day 14
-----------------------

CONDITIONAL STATEMENTS IN JAVA:
-> if statement
-> switch statement
-> ternary operator


IF CONDITIONAL STATEMENT IN JAVA:

	1) if(condition) {
			//code 
	   }else{
	   		//code
	   }

	2) if(condition) {
			//code
	   }

	3) if(condition1){
			//code
	   } else if(condition2) {
	   		//code
	   } else if(condition3) {
	   		//code
	   } else {
	   		//code when all above conditions are false
	   }
==============================================
All conditional statements work with boolean (true or false).

in order to produce boolean, there is multiple ways:
-> comparison operators:
>, < , >=, <= , ==, !=
-> String equals() method
-> boolean variables

assign variable value based on condition:

Are you sure you want to delete this app?
y
deleted

=============================

add new package day14_multi_branch_if_statements
add new class YesOrNo
add main method

print "Are you sure you want to delete this file?"
selection > "y";
answer -> boolean variable

selection -- "y"
true :
"your file will be deleted"
answer -> true
false :
"file deletion cancelled"
answer -> false


"Did file get deleted? - true"
========================================

add new class IfWithoutElse
add main method (main (tab or enter))

year => 2020

check year equals 2020
TRUE:
print "Covid19 pandemic year"
print "Wear mask and keep distance"
--------------------------------------------

when we write if statement, else is block is not mandatory.
so we can write:

if(10 > 5) {
System.out.println("condition is true");
}

in above example, we dont have else block, and code works fine.
print statement only runs when condition is true.

--------------

if (condition) {
//code
} else {
//code
}

if (condition) {
//code
}
---------------

MULTI BRANCH IF STATEMENT:

it is useful when we have multiple related conditions.

day -> 1

if day -> 1 : Monday
if day -> 2 : Tuesday
if day -> 3 : Wednesday

WITHOUT MULTI BRANCH:

int day = 1;

if(day == 1) {
System.out.println("Monday");
} else {
System.out.println("NOT Monday");
}

if(day == 2) {
System.out.println("Tuesday");
}

if(day == 3) {
System.out.println("Wednesday");
}

WITH MULTI BRANCH IF STATEMENT:

int day = 1;

if(day == 1) {
System.out.println("Monday");
} else if (day == 2) {
System.out.println("Tuesday");
} else if (day == 3) {
System.out.println("Wednesday");
} else {
System.out.println("java day");
}
======================

add new class MultiBranchIfStatement
add main method

day -> 1
if day -> 1 : Monday
if day -> 2 : Tuesday
if day -> 3 : Wednesday

BENEFITS OF MULTI BRANCH| MULTI WAY IF STATEMENT:

-> more organized code
-> more efficient code
-> combining related conditions in same multi branch
-> easier to maintain
-> easier to read the code
HOWEVER:
-> cannot use if only single condition
-> use only when you have multiple conditions related to each other

1) if(condition1){
   //code
   } else if(condition2) {
   //code
   } else if(condition3) {
   //code
   }

2) if(condition1){
   //code
   } else if(condition2) {
   //code
   } else if(condition3) {
   //code
   } else {
   //code to run when all above conditions are false
   }

When we use multi branch if statement, we combine multiple related conditions into one.
java checks each condition from top to bottom, once it finds true condition, it will run the code for that if, and exits. it does not check other conditions below.

Optionally we can include else block at the very end, and it only RUNs when ALL of conditions are false.
===========================================

Andrey Chetvertakov — Today at 12:33 PM 03/13/2021
@Murodil what if we have 2 TRUE conditions? Will it execute first one top to bottom and exit? Ignoring second true condition?

YES, Andrey. Once it finds first true condition, it will not check below conditions even if they are true.

=====================================
add a new class ChooseLanguage
add main method
"Choose your language"
int selection -> 1 : "hello, thank for your call"
-> 2 : "hola, gracias para llamar"
-> 3 : "merhaba, aradiginiz icin tesekkurler"
-> 4 : "privet, spasibo za vash zvonok"
-> 5 : "Merci ,pour votre appel"
-----> "lets talk java and english, hello"


can you tell about your interview and your first work  days in a company????

Group study is important.
group friends are great asset, support one another. teach each other.

get to know one another
mentor assistance till find job.
Soft skills/Social skill important for getting job, not only technical

mock interview each other

board with your name and title

believe in yourself

look at yourself as SDET engineer.

canada market is good

love java!
stick to your friends and support each other!
==============================================

add new class DayActivity
add main method

weather ->  "sunny", "rainy", "snowy", "windy" ...

when "sunny" :
-> "Go to park, hiking, and code java"

when "rainy" :
-> "stay home, drink tea, and code java"

when "snowy" :
-> "clean the car then build snowman, drink hot chocolate, and code java"

when "windy" :
-> "Get ready for power loss, fly a kite, and code java"

anything else:
-> "just keep coding java"
====================================

add new class CalculatorV1
add main method

num1, num2
char operator -> -, +, *, /

when operator: + : add num1, num2
when operator: - : minus num1, num2
when operator: * : multiply num1, num2
when operator: / : divide num1, num2
any other: "invalid operator"


Nancy Shenouda — Today at 3:34 PM
why cant we make the code this way?: System.out.println(num1 + operator + num2);

Not in java, some other languages do it.
====================

add new class CalculatorV2
COPY all code in CalculatorV1
Change the Classname

import scanner
create scanner object
print "enter 2 numbers"
num1 -> 44.3
num2 -> 23.4
print "enter operator: - , +, *, /"
char operator = scan.next().charAt(0);
based on selection run if statement

Suleyman Yusifov — Today at 3:45 PM
@Murodil  please show use to debug scanner as well
===================================================

LOGICAL OPERATORS :
&&, ||, !

&& -> AND operator
|| -> OR operator
!  -> NOT operator

When you want to check 2 conditions at once , we can use AND, OR operators to combine conditions in single statement.

&& -> AND operator example:
-> double ampersand. && (AND) operator returns/produces TRUE when both conditions are true. It checks both conditions right and left and if both boolean conditions are TRUE, then result will be true.

int apples = 3;
int oranges = 5;

    TRUE          TRUE
(apples > 2 && oranges > 4)
TRUE

FALSE         TRUE
apples == 1 && oranges < 7
FALSE

TRUE            FALSE
apples < 4  && oranges > 10
FALSE

FALSE           FALSE
apples >= 100 && oranges > 20
FALSE

================================

Add new class LogicalANDOperator
add main method
