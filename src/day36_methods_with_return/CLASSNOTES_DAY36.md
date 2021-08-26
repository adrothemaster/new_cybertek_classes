
04/14/2021
----------

Java day 36
-----------

Custom methods in java.

help us make our code reusable and maintainable.

GENERAL RULE: If you have to do something twice, it means you need a reusable method for that.

DRY principle: Do not repeat yourself. Avoid duplicate code.

1 of the ways to achieve that:

custom methods/functions.
---------------------------------

If you want to see someone how good he/she is at coding, look at their custom methods.

add new package day36_methods_with_return

in test automation, most of automation related methods are void. void - does not return value

public class LoginPage {
public static void login(String userName, String password) {
///
}

	public static void verifyLoginSuccessful(){
		//condition to check if login is successful
	}

}
====================================

In general java programming, our methods mostly return a value.

EX:
String word = "java";
System.out.println(word.charAt(0)); //j
char first = word.charAt(0);

	word.contains("v") ==> returns boolean - true
	System.out.println(word.contains("v")); true
	boolean b = word.contains("v");  b = true
	if(word.contains("v")) ...

	Both examples are methods with return value,
		charAt(index) => char
		contains() => boolean
		toUpperCase() => String
		length() => int
		split() => String[]
		trim() => String
		...
	------------------------------------------

So far our custom methods DID NOT return a value. They only executed certain lines of code and thats it.

VOID METHODS:
1) WITHOUT PARAMETERS
2) WITH PARAMETERS

NON VOID METHODS/METHODS WITH RETURN:
1) WITHOUT PARAMETERS
2) WITH PARAMETERS
-------------------------------
VOID METHODS:
1) WITHOUT PARAMETERS:
public static void myMethod() {
System.out.println("hello from my method");
}

	2) WITH PARAMETERS:
		public static void myMethod(int num) {
			System.out.println("num = " + num);
		}

calling void methods:
myMethod();

The above method will print "hello from my method". But it will not return a value when called. it means i CANNOT DO :


System.out.println(myMethod()); // ERROR, not return value

String value = myMethod(); //ERROR , does not return a value,it is void.
----------------------------------------
add new package day36_methods_with_return
add new class CreditScore

method name:
checkEligible
input/parameter:
int creditScore

if creditScore is 700 or more
you are eligible for leasing this car
otherwise
Sorry, you are not eligible for leasing this car
-----------------------------------

METHOD WITH RETURN:
1) WITHOUT PARAMETERS:

		public static int getCreditScore() {
			return 800;
		}
	When we have a return value: we specify return type right before method name.
	public -> visible to everyone
	static -> do not need object to call the method
	int -> return data type. this method will return whole number
	getCreditScore -> method name and no params
	return 800; -> whenever we return a value from a method (not void) , you need to type RETURN keyword inside your meethod.

	return value; -> this keyword is used to return a value from a method. the value must match the return type.

	When we have a method with return value, we can print it, or assign to a variable:

	System.out.println(getCreditScore()); 800
	int score = getCreditScore();
	score => 800

add new class Info

Method name: fullName
No params
returns "Mike Smith"

Method name: isMarried
return false

method name: getAge
returns 35
------------------------

@ is called annotation to mark your methods in a certain way, do not worry about it, kindly ignore it please.
------------------------

When we have return value from a method, we can print it, or store into a variable.

METHOD WITH RETURN:
1) WITHOUT PARAMETERS:
String word = "java";
word.isEmpty(); => false

	2) WITH PARAMETERS:

	String word = "java";

	System.out.println(word.charAt(1)); ==> a - returns a
	int index = word.indexOf("v"); => 2

	add new class Calculator

	public static double add(double num1, double num2) {
		double sum = num1+num2;
		return sum;
	}

	minus
	multiply
	divide


add new Calculations
add main method
call Calculator class methods there
