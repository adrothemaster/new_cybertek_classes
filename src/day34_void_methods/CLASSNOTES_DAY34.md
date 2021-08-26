
04/12/2021
----------

Java Day 34.
------------

Today:	
	- important part of any programming language to make code RE-USABLE
	- We have been using methods from different classes so far.
	ex:
		str.toUpperCase()
		str.length()
		Arrays.toString(array)...
	They were already included in Java, so that we can use them.

	We can also write our own CUSTOM METHODS/FUNCTIONS in java.
	To make OUR code RE-USABLE.

	We can write a custom method and include some code, and everytime we use/call the method, our code will run. We can re-use the code in the method.

	CUSTOM FUNCTION: javascript, python, ruby...
	CUSTOM METHOD: in java.
=======================================================

public class MyClass{
	public static void main(String[] args) {
		displayMessage();
		displayMessage();
	}

	public static void displayMessage() {
		System.out.println("Hello world!");
	}
}

public ==> "visible to the world" -> it is accessible/visible to all the classes in the project. (or other projects if our project is added to that)

static -> method can be called without creating an object (no new keyword needed)

void --> no return value. method does not return anyting/any value.
	-> when we call the method, it just executes the code in the method body without returning a value.

displayMessage() ==> method name. can be anything, need to make the name meaningful. It should sound like a action/behaviour.

public static void displayMessage() {
	==> CODE HERE is the body of the method,
	this code will run everytime, method is used/called. This what is makes it re-usable.
}

add new package day34_void_methods

add new class FirstMethod



Junaid Hussain — Today at 8:31 PM
@Murodil  can a "main" method be called in a different method? Is main method reusable?

Yes, it can be called, and a class can call main method of another class.
----------
Custom method names need to always make sense to the reader.

class StartCar

	seatInCar
	startTheCar
	shiftToDrive
	pressGasPedal

Start car algorithm:
 START
 0) open the driver door
 1) get inside
 2) sit down 
 3) insert key into ignition
 4) push the brake pedal with your foot
 5) turn the key to clockwise
 6) hold until car starts
 7) release the key
 END

main method is a special method that java looks for when running your code.
main method is not a custom method. it needs to be always typed to be able to run your code.

Custom method is YOUR OWN method, that you can name in any way you want.
Custom method, cannot run by itself, it needs to be CALLED/USED by name.

public class MyClass {
	public static void method1(){
		System.out.println("Hello from method 1");
	}
}

The above code cannot run, because main method is missing.

So we need :
	1) add main method
	2) call our custom method inside the main method

public class MyClass {
	
	public static void main(String[] args) {
		method1(); //call method1
		//Method1(); ERROR - case sensitive
	}

	public static void method1(){
		System.out.println("Hello from method 1");
	}
}

Month of Ramadan starting tomorrow:
Ramadan month - fasting month
-> no eating/driking from early morning(before sunrise) until sunset
-> weekday classes will be during BREAK fast.
-> little longer break during the sunset time
15 - 17

====================

add new class EtsySearchTest

openBrowser
navigateToEtsyUrl
searchForWoodenSpoon
verifyResultsAreDisplayed
