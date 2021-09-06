03/14/2021
----------

Java Programming Day 15.

Conditional Statements In java.
if statements
logical operators
switch
ternary

Upcoming classes:
Loops

Logical Operators:
-----------------

AND -> &&, &
OR  -> ||, |
NOT -> !
------------

add new package day15_logical_operatorss
add new class AndOperatorPractice
main method

onSale, freeShipping
itemName

use if statement with && , to check if you would add item in cart.




add new class JobOfferSelector
add main method
declare and initialize below variables
//location, salary, remote, benefits

add if statement with && operator to decide to accept job offer or no.
===========================

OR || LOGICAL OPERATOR.

OR(||) checks 2 conditions and returns TRUE when both or ONE of the conditions are TRUE.

TRUTH TABLE FOR OR (||)

true  ||  true  --> true
true  ||  false --> true
false ||  true  --> true
false ||  false --> false

int apples = 5;
int oranges = 10;

TRUE    OR     TRUE
apples > 1 || oranges < 20
TRUE

TRUE    OR     FALSE
apples > 1 || oranges == 20
TRUE

FALSE    OR     TRUE
apples > 10 || oranges == 10
TRUE

    FALSE   OR   FALSE
apples != 5 || oranges != 10
FALSE
==============================

Ilhom Maqsudov — Today at 11:32 AM
does java stops if first condition is TRUE, or continues to check all conditions for OR?

Dzhakhingir Islamov — Today at 11:31 AM
@Murodil what if we have && and || inside if ()

Bashir Hasanov — Today at 11:33 AM
@Murodil can we use AND with OR both within same condition?

add new class ORLogicalOperator
add main method
===============================

add new class CitySelector
add main method

city

"Moscow" || "Tampa"
-> "Willing to relocate to Moscow"
else
-> "Not considering Seattle"


Add class GradeEvaluator
main method

char grade = could be one of A,B,C,D,E
grade == 'A'
when grade is A or B, C
passed with grade
when grade is D
qualify for retake
when grade is E
fail
anything else
invalid grade
========================================
add new java class UsedCarSelector
add main method

Car dealership:

budget = 5000
model -> "Toyota" , "Honda" ,"Tesla"
carPrice = 4500
using If condition with logical operators, decide if you would like
to purchase the car.

1 - needs to be within budget
AND
2 - needs to be "Toyota" OR "Honda" OR "Tesla"

in Boolean operators:

&& is evaluated first, then || is evaluated.
If we use paranthesis, then the boolean expression in paranthesis is evaluated first.

================================

! NOT OPERATOR.

It takes boolean value(true or false) and reverses it.

!true  --> false
!false --> true

int apples = 5;

!(apples > 2) --> false. as condition itself it true, but ! operator reverses the result.

!(apples < 3) --> true

Add new class NotLogicalOperator
add main method

!= -> is not equal comparison operator.
=======================================

Logical operators:
&&, || , !
&& -> returns true when both conditions are true
|| -> returns true when one or both conditions are true
! -> reverses !true to false. and !false to true

We can also use them in combination, it is better to use parenthesis to get correct result.

we can use any of operators multiple times in same statement. it will go from left to right.

&& ----> &
|| ----> |

There is slight difference between double && (short circuit) and &

int apples = 5;
int oranges = 10;

	TRUE         TRUE
apples == 5 && oranges == 10
TRUE

	 FALSE        NOT CHECKED
apples == 15 && oranges == 10
FALSE

TRUE         FALSE
apples > 1 && oranges == 11
FALSE
================================
FALSE       TRUE
apples == 15 & oranges == 10
FALSE

When we use && (short circuit), it is more efficient,
if java already knows the END result just by evaluation/checking the FIRST condition, then it will SKIP checking the next condition.

false    skipped
5 < 3 && 10 > 4
false

ONLY 5 < 3 is checked/evaluated because java already knows if first one is FALSE, overall result will end up being false.


When we use & (and), it will check/evaluate BOTH conditions no matter what.
false     true
5 < 3 & 10 > 4
false

both 5 < 3, 10 > 4 are checked/evaluated before returning end result.
====================

&& is more efficient compared to &
so try to use && always.

Situation where single(&) is needed. it will be only needed when
there is some function/method call on right side that you want to be executed.

double price = 34.5;

     FALSE       RUN THIS TOO, to verify items with that price
price > 50.0 & verifyItems(price)
FALSE

------------------
|| (short circuit) is more efficient compared to | (single pipe)

When we use || OR operator, if end result is clear after checking first condition, then second condition will be skipped. not checked.

TRUE     SKIPPED
5 > 4 || 3 < 2
TRUE

When we use | OR operator, both are checked, no matter what.
TRUE     FALSE
5 > 4 | 3 < 2
TRUE

We always use ||, && to make our code little bit more efficient for processing.
==================================

price > 50.0 | verifyItems(price)
==================================

int num1 = 5;
int num2 = 20;
FALSE
if(num1 < 4 && num2 == 20)  <---- FALSE

since first condition is already false, second one will NOT be checked.
java already knows that overall result will be FALSE

int num1 = 5;
int num2 = 20;
FALSE      TRUE
if(num1 < 4 & num2 == 20)  <---- FALSE

Both conditions are checked, then end result FALSE is returned.
because we used & (and).
============================
So the difference is && is more efficient for execution compared to &, and AVOID using & at all times.

So the difference is :  || is more efficient for execution compared to |, and AVOID using | at all times.
============================

SWITCH STATEMENT:
In java and other languages, there is switch conditional statement. when we compare a variable to multiple values.

It is similar to MULTI- BRANCH if statement, but more compact, and more organized code.

int n = 2;

if(n == 1) {
System.out.println("n is 1");
}else if(n == 2) {
System.out.println("n is 2");
}else if(n == 3) {
System.out.println("n is 3");
}else {
System.out.println("n is not 1,2,3");
}
---------------
Same exact code can be re-written using switch statement.

int n = 2;

switch(n) {
case 1:
System.out.println("n is 1");
break;
case 2:
System.out.println("n is 2");
break;
case 3:
System.out.println("n is 3");
break;
default:
System.out.println("n is not 1,2,3");
}












