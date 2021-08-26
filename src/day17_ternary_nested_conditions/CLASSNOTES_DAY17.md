
03/16/2021
----------

Java Programming Day 17
-----------------------

Tomorrow and Thursday are Nadir's classes.

Conditional Statements in java:
-> if conditions:
-> if
-> if .. else ..
-> if .. else if .. else if .. else
-> nested if
-> switch:
-> switch .. case .. break .. case ..break .. default
-> nested switch
-> ternary:
-> variable = condition? trueValue : falseValue;
================================

add new package day17_ternary_nested_conditions
add new class TernaryExamples

TERNARY OPERATOR ? can be used for short conditions where you assign one value or another based on condition.

int num1 = 10;
int num2 = 30;
int max = num1 > num2? num1 : num2;
print max; ==> 30

if(max > 5){
System.out.println("more than 5");
}else{
System.out.println("NOT more than 5");
}

ADVANTAGES:
- one statement to replace basic if else statement

--> if else is more flexible when you have multi branch conditions.
=============================

if(price > 100) {
itemName = "wooden spoon";
payment = "Visa";
}else {
itemName = "tea";
payment = "cash";
}

ternary cannot handle the above statement.
it has limitation to be able to return a single value.
========================================================

add new class MoreTernary
main method

hourlyRate = 50;

when hourlyRate > 45
reply = "accept"
otherwise
reply = "reject"
print out reply
================================================

NESTED IF STATEMENT:

We can put IF statement inside IF statement. That is called NESTED IF statement.

if(condition1) {
if(condition2) {
//code A
}else{
//code B
}
}else{
if(condition3) {
//code C
}else {
//code D
}
}
-----------------------------
1) condition1, condition2 are true : code A
2) condition1 is true, condition2 is false: code B
3) condition1 is false. condition3 is true: code C
4) condition1, condition2, condition3 ALL false: code D.
   ==============================

add new class AmazomPrimeShopping
main method

itemPrice = 30;
isPrimeMember = true;

when isPrimeMember is true
print "Eligible for free 2 day shipping"
otherwise
when itemPrice is more than 25
print "Eligible for free regular shipping"
otherwise
print "Not eligible for free shipping. fee is $10"


PSEUDOCODE: code written in human language. then it will be translated to java or other programming language

-------------

add new class VendingNestedIf
add main method

selection = "drink" or can be "snack"
drinkItem = "tea" , "coke"
snackItem = "chips" , "candy"

when selection is "drink":
"drink option is selected"

	when drinkItem is "tea":
		"tea is selected"
	when drinkItem is "coke":
		"coke is selected"
when selection is "snack"
"snack option is selected"

	when snackItem is "chips":
		"chips item is selected"
	when snackItem is "candy":
		"candy item is selected"
========================================

TeslaNestedIf

char model = 'S';
trim -> "Long range"


when model 'S'
if trim is "long range":

		"range: 412"
		"top speed: 155 mph"
		"0-60- 3.1sec"
	if trim is "Plaid":
		
		"range: 412"
		"top speed: 155 mph"
		"0-60- 3.1sec"
	if trim is "Plaid+":
		
		"range: 412"
		"top speed: 155 mph"
		"0-60- 3.1sec"
when model is '3'
....
======================================
