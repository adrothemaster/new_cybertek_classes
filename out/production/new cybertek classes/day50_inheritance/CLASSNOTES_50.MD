
06/05/2021
----------

Java Programming Day 50
-----------------------

OOP > Exceptions > Data Structures(Collections)

OOP > 4 principles :
-> Encapsulation -> data/variable hiding - make instance variables private and provide public getters and setters
-> Inheritance -> a sub/child class inherits variables or methods from super/parent class
-> Abstraction -> hiding implementation, reveal only WHAT todo and NOT HOW
-> Polymorhism -> many forms. parent reference type, and child object type


STATIC:
-> methods -> we can call with classname.methodName. No need for object

	-> variable -> shared variable among all objects, only single copy of variable exists. belongs to CLASS itself - we can call using Classname.variableName

	-> static block -> code in static blocks runs when class is loaded to memory by ClassLoader. Runs ONCE before ANYthing else. before constructor.

	-> static inner/nested class -> class within another class, we can access this class directly ParentClassname.InnerStaticClass

	@BeforeClass
	@BeforeMethod
	@Test - 1
	@Test - 2
--------------------
    @BeforeClass (runs once before anything)

    @BeforeMethod
	@Test - 1

	@BeforeMethod
	@Test - 2


=============================

branch day50_inheritance
new package day50_inheritance

add new class StaticBlockDemo

- STATIC BLOCK / STATIC INITIALIZER BLOCK
  -> code in static blocks runs when class is loaded to memory by ClassLoader. Runs ONCE before ANYthing else. before constructor.

-> Normally, we use static block to initialize/assign data to static variables.

-> It is similar to JUnit/TestNG @BeforeClass annotation

-> DIFFERENCE BETWEEN CONSTRUCTOR VS STATIC INIT BLOCK.

CONSTRUCTOR -> runs EACH time , when object of the class is CREATED(new keyword)

STATIC INIT BLOCK -> RUNS ONCE only when we USE the class.
USE -> create object,or call static method.

Kamran Gasimov — Today at 11:25 AM
<<<<static block only one time before everything else, constructor each time while creating new object>>>>
==========================================

3 FRIENDS OF INITIALIZATION.

1) static initializer block (runs ONCE before anything else, when class is loaded by ClassLoader)
2) initializer block (runs each time object is created , before constructor)
3) constructor (runs each time object is created)

We can use those 3 for initialization of instance or static variables.
===============================

public class A {
public static class B {

	}
}

public class CarMake {
public static class CarModel {

	}
}

public class FlightTicket {

	public static class Business {

	}

	public static class Economy {

	}

	public static class First {
		
	}
}

FlightTicket.Business tck = new FlightTicket.Business();
========================================================

INHERITANCE -> a class can inherit the properties/variables and behavior/methods of another class
-> it provides code reusability and maintainability
-> it is good way of organizing the classes that are related
-> we use EXTENDS keyword to establish inheritance relation
ex: public class Child extends Parent {

	}
-> variables and methods are inherited to sub class
-> it is also called IS-A relationship between classes
Car IS-A Vehicle
Bus IS-A Vehicle
-> java does not support multiple inheritance. class can extend only one other class.
ERROR:
public class School extends Building, Company {

}

Vehicle > Car > Sedan
> SUV
> PickUp
> HatchBack
> ElectricCar
> Motorcycle > Moped
> RaceBike
> Airplane
> Bus
==================================

Student IS-A Person
Student extends Person

- school
- study(topic)

UML -> Unified Modeling Language -> is a schema/chart describing relation of classes


====================================

One of the other benefits of Inheritance is method overriding, where we can have some general implementation of the method in the super/parent class and have some specific implementation in sub classes.

Method Overriding -> 2 methods with same name and same parameters. It works only with inherited methods.

Method Overloading -> 2 methods with same name and different parameters.

EX:
public class Device {
public void powerOn() {
System.out.println("Press power button on device");
}

		public void use(int minutes) {
			System.out.println("Using the device for " + minutes);
		}
	}

	public class TV extends Device {
		@Override
		public void powerOn() {
			System.out.println("Press power button on remote");
		}

		public void use(int minutes) {
			System.out.println("Watching TV for " + minutes + " minutes");
		}

		public void use(int minutes, int channel) {
			System.out.println("Watching TV for " + minutes + " minutes");
		}

	}













