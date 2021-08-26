
03/15/2021
----------

java programming day 16
-----------------------

switch statement in java.
switch statement is present in all programming languages.

it is a replacement for multi branch IF statement.
to make code easier to read and sometimes even faster.

switch statement looks similar to elevator or light switch. and consists of multiple CASEs.

add new package day16_switch_ternary
add new class Elevator

declare variable floorNum = 1
Multi branch if:
when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"

when floorNum is 2 -> print "Floor 2 selected. Companies: Cybertek, NASA, Intelsat"

when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"

anything else: print "Invalid floor - 6"
---------------------------------


SWITCH STATEMENT:

switch(VARIABLE_NAME) {
case 1:                ===  if (floorNum == 1)
//code to run
break;
case 2:
//code to run
break;
....
default:
//code to run
break;
}
=================

SWITCH STATEMENT can be used to compare variable if it EQUALS several values. Switch can ONLY do == comparison. Cannot do <,>,<=,>=,!= types of comparisons.

Switch has limitation in that sense.

BENEFITS:
-> more readable, compact code
-> easier to maintain
-> might be faster than if else if statements. since it jumps to matching case right away
================================

reports -> 70-100 types of reports

String reportName = "CR10";

switch(reportName) {
case "CR10":
//100 lines of code
break;
case "CR75":
//120 lines of code to run
break;
}

String browser = "chrome";

switch(browser) {
case "chrome":
//code that opens chrome browser
break;
case "firefox":
//code that opens chrome browser
break;
case "safari":
//code that opens chrome browser
break;
case "ie":
//code that opens IE -> RUN, DONT LOOK BACK
break;
case "edge":
//code that opens Edge -> See first before RUNNING AWAY
break;
}
=================================

Add new class CappuccinoBuyer
main method

declare
price    -> 0
calories ->
size could be "tall", "grade" ,"venti"

switch(size){
case "tall":
print "Tall Cappuccino please";
price = 3.69;
calories = 90;
break;
}
when size = "tall"
print "Tall Cappuccino please"
price    ->  3.69
calories ->  90

when size = "grande"
print "Grande Cappuccino please"
price    ->  3.99
calories ->  120

when size = "venti"
print "Venti Cappuccino please"
price    ->  4.29
calories ->  150

any other size:
print "We do'nt serve that size of Cappuccino"


print "Total price: $3.69"
"You will consume 90 cals of energy"

============================================

add new class AdaireApartments
main method

#### WELCOME TO ADAIRE APARTMENTS ####

numberOfBedrooms = 0, 1, 2

startingPrice = 0;

when numberOfBedrooms 0:
print: "Studio apartment selected"
startingPrice -> 1454

when numberOfBedrooms 1:
print: "One bedroom apartment selected"
startingPrice -> 1725

when numberOfBedrooms 2:
print: "Two bedroom apartment selected"
startingPrice -> 2899

default:
print "5 bedroom currently unavailable"

------
"Starting price $1454"
===============================

switch statement notes:
-> it can only perform == (equals) comparison. Cannot handle any other comparison. >, <, >=, <=, !=
-> works only with byte, short, char, and int. String and ENUM types.
-> we add cases for each matching. data type of variable and case must be same.
-> we use BREAK; statement at end of each CASE, to exit the switch block
-> it is easier to read and maintain, if statement can do more.
========================================

TERNARY OPERATOR:
? -> this operator can be used for simple if else conditions.

EXAMPLE:
String result;
int score = 90;

	if(score > 60) {
		result = "Pass";
	}else {
		result = "Fail";
	}

	boolean isGreen = true;
	String action;
	if(isGreen) {
		action = "drive";
	}else{
		action = "stop";
	}
================================

	String result;
	int score = 90;

	if(score > 60) {
		result = "Pass";
	}else {
		result = "Fail";
	}
-----------------------
	int score = 90;
	String result = (score > 60) ? "Pass" : "Fail";	
	print "result = Pass";

add new class TernaryIntro
main method
