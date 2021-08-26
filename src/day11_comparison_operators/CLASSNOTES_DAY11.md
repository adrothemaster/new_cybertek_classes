
03/08/2021
----------

Java Programming Day 11
-----------------------

-> operators:
-> = -> assignment operator
-> + -> concatenation operator
-> +, - , *, /, % -> arithmetic operators
-> +=, -=, *=, /=, %= -> shorthand operators
-> ++, -- -> increment/decrement operators
-> PRE
-> POST
-> ==, >, < , >= , <= , != -> comparison/boolean operators
-> if statements
-> loops
================================

package day11_comparison_operators

add a new class PrePostIncrementDecrementOperators

++, --

int num1 = 1;
num1++;
++num1;
System.out.println(num1); => 3

int num2 = 5;
num2--;
--num2;
System.out.println(num2); => 3
=================================

PRE INCREMENT: ++ is before the variable name.
If we look at it from left to right. it increases variable value first.

int num1 = 4;
int num2 = ++num1;

System.out.println(num1); //5
System.out.println(num2); //5

POST INCREMENT: ++ is placed after the variable name. As it runs from left to right, increase in value happens afterwards.

int num1 = 4;
int num2 = num1++;

System.out.println(num1);
System.out.println(num2);
=============================

int myNumber = 44;
myNumber++;
System.out.println(myNumber); //45
++myNumber;
System.out.println(myNumber); //46

-----
add 1 first/increment first/ then print value
myNumber = 20;
System.out.println(++myNumber); //21
--------
print first then add 1/increment 1:

myNumber = 33;
System.out.println(myNumber++); //33
System.out.println(myNumber); //34
--------
int myNumber = 15;
int yourNumber = ++myNumber;

System.out.println(myNumber);
System.out.println(yourNumber);
-----------
Assign myNumber to yourNumber first THEN add 1/increase by 1
int myNumber = 99;
int yourNumber = myNumber++;
System.out.println(myNumber);
System.out.println(yourNumber);


int a = 50;
int b = 22;
int c = a++ + ++b;

a = 51
b = 23
c = 73
i++;
count++;
===============================

10 > 5 ? --> true / "yes"
5 > 50 ? --> false / "no"
432 == 432 --> true -> yes they are equal
555 == 111 --> false -> no they are not equal

BOOLEAN|COMPARISON OPERATORS: TRUE | FALSE

== -> equals (checks if 2 values are equal)
a == b
>  -> greater than (checks if first value is greater than second)
a > b
<  -> less than (checks if first value is less than second one)
a < b
>=  -> greater than or equals to(checks if first value is greater than or equal to second)
a >= b

<= -> less than OR equals (checks if first value is less or equal to second)
a <= b

!=  -> is not equal (checks if first value is NOT equal to second)
a != b

=====================
add a new class BooleanComparisonOperators


So the result of all comparison operators is always boolean.
Thats why we can also assign value to boolean variables:

int n1 = 5;
int n2 = 3;
n1 == n2 ? see if 5 EQUALS 3. answer is NO - FALSE
System.out.println(n1 == n2); //false

boolean check = n1 == n2;
System.out.println(check);

boolean check2 = n1 > n2;
System.out.println(check2); true

boolean hungry = n1 != n2;
System.out.println(hungry); true
===========================
2 - 3

int age = 2;
boolean noMoreToddler = age > 3;
System.out.println(noMoreToddler); //false

age = 66;
boolean seniorCitizen = age >= 65;
System.out.println("is senior citizen? - " + seniorCitizen);

SUMMARY:
-> post, vs pre increment/decrement
-> boolean operators

int age = 66;
if(age <= 3) {
System.out.println("Toddler");
}
