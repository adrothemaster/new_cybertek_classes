
04/17/2021
----------

java programming day 37
-----------------------

QUIZ - do your best, result 100 or result 10 - does not mean you cannot get a job.
Our end goal in Cybertek program -> to land a job.

So do not stress out if score came out low, it does not mean you cannot do the job as SDET or does not mean you cannot find a job.

Java - has many different purposes and capabilities,
we are learning java to be able to do SELENIUM AUTOMATION.

1) look at quiz code as a compiler
   check if any syntax errors etc

2) look at code as a debugger
   1- 5
   variables -> values changing each iteration etc
   num - 4, 7, 10, 15
3) PURPOSE: some of the questions are slightly different than we did in class or normal programming, so whoever goes over that question, they will definitely learn something
--------------------------------------------

in IT there is more demand than SUPPLY


Lego blocks -> programming blocks are similar

Code: look at as seperate lego blocks to understand easier
array
loop definition
condition
variable updates etc etc
--------------------------------

IQ:
What the difference between procedure and function?
procedure -> does not return a value , just executes block of code. in java we call them VOID methods.

	function -> returns a value, executes blocks of code and returns a certain value. in java we call them Methods with return or NON-Void methods.

	In java, we call everything METHODS. that are used to make our code reusable and maintainable.

add new package day37_methods_overloading
add new class WarmUpMethod

method:
loginVoid
params:
String username, String password

return type:
VOID

in the method:
Declare : String secretUsername ="cybertekStudent", secretPassword = "abc123"

if(both match)
PRINT:
Login Successful, welcome cybertekStudent
ELSE
PRINT:
Incorrect username or password
=========================================

If i give you a application functionality, how do you test it?

1) positive test, to make sure functionality is working as expected. valid username + valid password
   Then I write automation steps for that using my automation framework....

2) negative tests, to make sure application is not allowing invalid values, and showing errors.

I pass invalid inputs to the application.
FOR LOGIN: invalid username and invalid password
Then validate expected error message is displayed.
===============================

Method name:
login
Params: String userName, String password

Return type:
boolean

in the method:
Declare : String secretUsername ="cybertekStudent", secretPassword = "abc123"

if(both match)
return true
ELSE
return false

public static int sum (int n1, int n2) {
return n1 + n2;
}
------------------------------

add new class DaySelector
add new method: getDayName
input : int day
return : String

1 - "Monday"
2 - "Tuesday"
...
7 - "Sunday"
any other:
print "invalid day"
return empty/null

getDayName(1); => "Monday"
getDayName(5); => "Friday"
getDayName(10); => print "Invalid day" -> ""/null
-----------------------------------------------

When using switch statement inside the method, we cannot use
return and break in same case.
reason is it will show Unreachable code error.
return "value"; => means return the value also exit the method.

break ; => exit switch statement only

switch(num) {
case 10:
return "ten";
break; => ERROR - unreachable
}
=======================
null => no object, NOTHING.
null can only be assigned to Non-primitive types/object types.

String word = null;
word is null, no String object, no value, nothing,
Just an empty container.

null is not same as "" (empty double quotes)
"" -> is a valid String object that has no characters

String word = null; -> no object, no value
String word2 = ""; -> valid String object/value
NOt same

String word = null;
word.toUpperCase() ==> ERROR: nullpointerException
----------------------------
In above task, we can use multiple or single return statement.
------------------

LOGGERS in real project are more common than PRINTLN

PRINTLN is useful in automation/coding to be able to see the value quickly

LOGGERS -> prints into console also writes into a log/text file.
---------------------------
I research and follow coding best practices.

---------------------------
IQ: Difference between Method overloading and overriding.

METHOD OVERLOADING -> methods with SAME method name, DIFFERENT parameters.

METHOD OVERRIDING -> inherited methods with SAME method name,
and SAME parameters.
=================================

METHOD OVERLOADING -> methods with SAME method name, DIFFERENT parameters.

public class MyClass {
public static int sum(int num1, int num2) {
return num1 + num2;
}

	public static int sum(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}

}

public class MyClass {
public static void myMethod() {
//code
}

	public static void myMethod(String word) {
		//code
	}

	public static String myMethod(double num) {
		//code
	}

	public static boolean myMethod(double num, double num2) {
		//code
	}

	public static void myMethod(double num, boolean b) {
		//code
	}

	public static void myMethod(boolean b, double num) {
		//code
	}

}
================================
The above is all VALID METHOD OVERLOADING, because all same method name: myMethod and all have different parameters.

How to achieve method overloading:
1) add new method with same name
AND
- add an additional parameter, so that count is different
- add parameter with different data type

Where we used overloading so far:

	System.out.println("hello");
	System.out.println(123);
	System.out.println(true);

println method is OVERLOADED method.
It has SAME name and DIFFERENT PARAMETER TYPES

What about return type of the overloaded method:

When we overload a method in java, return types can be same or different. Does not matter.

METHOD SIGNATURE:
It is method name + parameter(s)

	EX:
		public static void speak(String word){//code}

	SIGNATURE OF THE above method:
		method name is speak
		and 1 String parameter
		-> speak + 1 String 
-----------------------------------------------

String word = "java";
word.substring(0, 2); => "ja"
word.substring(1); => "ava"
------------------------------------

add new class MethodOverloading

method name: sum
2 int parameters

method name: sum
2 double parameters

method name: sum
3 int parameters

method name: sum
2 String parameters

double num1 = 10; => 10.0

int num = 5.5;

(int)4.2 ==> 4
casting to int will remove decimal points.

-----
IQ: Can you overload a main method?
Yes, we can add a new method with name main, and have different parameters.

add new class OverloadMain
add main method
then overload the main method
==============================

VAR-ARGS: ... (0 or more arguments)
it is used as a method parameter, and will allow ability to pass 0 or more values separated by comma.

How:
inside the method it is used as an array

EX:
public static void sum(int... nums) {
//code
}

	public static void addNames(String... names) {
		//code
	}

When we call above method:
sum();
sum(1);
sum(1,3,4,5);
sum(1,3,4,5,23423,3);
-----------------------------

add new class VarArgs

new method: addNumbers
param: int... nums
return: void

//varargs
public static void addNumbers(int... nums) {
//inside the method, it is used as regular array
int sum = 0;
for(int n : nums) {
sum += n;
}
System.out.println("sum = " + sum);
}
========================

add new class MethodPractice

add new method:
repeatString

params:
String word, int times, char delimiter

Return type: String

it builds the string and returns

repeatString("java", 3, '|');
=> "java|java|java"

repeatString("hi", 5, '~');
=> "hi~hi~hi~hi~hi"
