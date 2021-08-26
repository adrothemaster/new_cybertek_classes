
03/06/2021
----------

Java Programming Day 9
----------------------

Casting
Scanner class, how to use it.

new Package day09_scanner_practice
new class AskAgeV1
main method

Flow:
print "How old are you?"
age -> 22
print "22 - thats great age!"
----------------------------------
new class AskAgeV2
main method

print "How old are you?"
age -> System input scan.nextInt();
print "age - thats great age!"

import day09_scanner_practice.AskAgeV1;
1) IMPORT SCANNER:

import java.util.Scanner;
java.util -> is a package name where Scanner class is located.

import means, "I would like to use this class in my program, so import it."

2) Create Scanner object

Scanner scan = new Scanner(System.in);

Scanner scan -> declare a variable of data type Scanner
String name;
int age;
Scanner is non-primitive , object type, class type.
Scanner is class name

new -> create new object from a class

3) use scanner function/method to accept int from keyboard

nextInt -> accept int value (whole number) from keyboard/console

---------------------

So we have been assigning values into variables in our java programs, like int n = 33;

Scanner can be used to enter different values when programming is running. We enter values to our variables from keyboard, then that value will go into our variable

int n = 33; -> value 33 is already assigned to n variable

int n = scan.nextInt(); -> value will be assigned from console/keyboard when program is running

EX:
Enter number:
44

44 will be assigned into n variable now.

HARDCODING the value: assigning the value to a variable in your CODE.
Not from scanner or any other source.
----------------------

Scanner class gives us a capability to pass values/inputs into our java programs. interactive way.
----------------------------------

When we installed jdk/java, many ready classes came with it. for examples String, System, Scanner etc. We can use them in our java programs.
In order to use them we need to import first.
we type import packagename.Classname;
import java.util.Scanner;

It means that you want to use that Class in your program.
Once imported, we need to create object from that class first.

Create scanner object: variable name can be different
Scanner scan = new Scanner(System.in);
Scanner input = new Scanner(System.in);
Scanner keyboard = new Scanner(System.in);
Scanner in = new Scanner(System.in);

After object is created, now we can call/use its functions:

nextInt() -> used to input int value
nextByte() -> used to input byte value
nextShort() -> used to input short value
nextLong() -> used to input long value

nextFloat() -> used to input float value
nextDouble() -> used to input double value
nextBoolean() -> used to input boolean value

next() -> used to input string , single word, until space
nextLine() -> used to input whole sentence as String

nextChar() is not there.
=========================================
Scanner scan = new Scanner(System.in);
int num = scan.nextInt();

line 105 -> is declare and create scanner object,
then 106, we are using that Object to input an int value
=========================================

add new class AddNumbers
add main method
3 variables: num1, num2, result
FLOW:
Enter 2 numbers
5
4
Result: 9
--------------------------------
import scanner
create scanner object
ask question: Enter 2 numbers
using scanner input 2 int numbers
num1 = scan.nextInt();
num2 = scan.nextInt();
result -> num1+num2
print Result: 10
==================================

add new class SalaryCalculator
main method
import scanner
assume 40 hours of work in a week
Enter hourly rate
50
we need calculate: weeklyPay, monthlyPay, annualPay

print all three in 3 lines
--------------------------------

add new class SpeedCheckV1
add main method

speedlimit -> 55
currentSpeed -> 75
overTheLimit -> currentSpeed - speedlimit;

You are driving 20 mph over the limit. Slow down!
---------
add new class SpeedCheckV2
add main method
import scanner
Create scanner object
ask to enter current Speed
speedlimit -> 55
currentSpeed -> 75
overTheLimit -> currentSpeed - speedlimit;

You are driving 20 mph over the limit. Slow down!
============================

Add a new class GroceryShopping
add main method
import scanner
create scanner object

	Target

	milk, bread, cucumber

FLOW:
Enter price for milk:
3.99
Enter price for bread:
2.55
Enter price for cucumbers:
4.10
Total is $10.33

price1, price2, price3, total
=================================

add new class Miles2KmConverter
add main method
import scanner
create scanner object
miles, kilometers

Enter miles:
10
10 miles in kilometers: 16.0934
---------
formula:
kilometers -> miles * 1.609
============================

add new class TempConverter
add main method
import scanner
create scanner object
welcome message
ask to enter Fahrenheit value
celciusValue ->

remainder operator|MODULUS -> %

This operator returns remainder of 2 numbers when divided.

add new class RemainderOperator
main method

When it is useful

100 cents -> 1

115 cents -> 1
1
115 % 100 -> 100+15


100 minutes
---------------------------

add new class CentsToDollars
add main method

cents -> 123
dollars -> 1
remainingCents -> 23

print:
in 123 cents : 1 dollars 23 cents

REFACTORING THE CODE.
update existing working code, in order to improve it, or add additional feature

DEBUGGING THE CODE:
looks for bugs in the code and try to fix them so that it works as expected
