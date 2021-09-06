
05/15/2021
----------

java programming day 45

OOP > Object Oriented Programming
Programming using classes and objects

4 principles:
- Encapsulation
- Inheritance
- Abstraction
- Polymorphism

Object Oriented Thinking:
- everything around you are objects
ex: building, cellphone, humans, computers, watch, water, table, etc

	- all objects interact with each other in one way or another.
	- each object comes from a class -> class is description, blueprint
		drink is class -> specific coffee  or water next to you is object from the class.

	Object is concrete thing, class is description, template, it is on the paper.

	Car is a class, general description, template, on the paper.
	Car -> model, year, mileage, style, etc
	Car can -> drive, park, reverse, turn, stop, start, charge etc

	Grey 2020 Acura RDX of Marufjon. Now this is concrete car, object from car class. specific car.

	OBJECT ORIENTED PROGRAMMING also similar to real life objects where we organize our code into dedicated classes and from classes we create objects.
	It helps with making code organized, clear, clean, maintainable, reusable etc.


Class  -> variables -> data/properties/attributes/fields
-> methods -> behaviour/actions

     	-> object1
     	-> object2
     	-> object3
============================================

add new package day45_oop
add new class TrafficLight

traffic_light lightA = new traffic_light();

Java programming conventions:

package names: always lowercase
classnames: start with Uppercase then CamelCase

public class TrafficLight {
String color;
//this is read only method, displays value of color variable
public void showColor() {
System.out.println("current color = " + color);
}
//this method updates the value of color variable
public void changeColor(String newColor) {
System.out.println("changing color to " + newColor);
if(newColor.equals("red") or greeen, or yellow)
color = newColor;
else
show some error
}
}
-------------------
TrafficLight trafficLight = new TrafficLight();

How can we assign a "red" to color in our trafficlight?

1) trafficLight.color = "red"; This is not best practice, because we can assign anything to color now. we can assing "white", "brown", "java"

2) assign "red" using the method. prefferred way, bacause we can control or check valid values before assigning.

trafficLight.changeColor("red");
We are reading and writing value to a variable using the method.

Using the methods to access variables inside the class.
---------------

I want to print the color value:

1) System.out.printn(trafficLight.color); Direcly accessing variable.

INSTEAD lets ask the method to give us the value of color.

2) trafficLight.showColor();


--------
Student student = new Student();

student.name = "Suleyman";
--------------------------------------
student.setName("Suleyman");

public void setName(String newName) {
name = newName;
}
======================================

add new class Coffee
===============================

java memory management
String pool
String is immutable
StringBuilder/StringBuffer are mutable

JAVA MEMORY MANAGEMENT:
- java takes some of the memory from our computer to store objects and primitives
- java automatically manages the memory, so programmer does not have to worry about it
- Java memory consists of 2 parts:
-> STACK
-> HEAP
STACK -> primitive variables or object variables,  method frames are placed in stack
HEAP -> objects are placed into heap, it is larger in size compared to stack

public class MyClass {
public static void main(String[] args) {
int num = 10;
Scanner scan = new Scanner(System.in);
Coffee latte = new Coffee();
latte.refill();
latte.setType("latte");
double price = 5.55;
myMethod();
List<Integer> nums = new ArrayList<>();
nums.add(10); nums.add(20);
WebDriver driver = new ChromeDriver();
}

	public static void myMethod() {
		System.out.println("hello");
	}

}

Whenever we create an object in java, Actual object is placed in HEAP memory, and the variable is placed in STACK memory.
Variable points/refers to object in Heap.

Car toyota = new Car();

Car toyota <--- is in STACK , it refers/points to object in HEAP
new Car() <--- new keyword, creates instance/object and placed into HEAP.

int num = 10;
num is primitive variable

Car toyota = new Car();
toyota is Reference variable, object variable.
==============================================

String name = null;

when variable is null, it means IT DOES NOT REFER/POINT TO ANY OBJECT IN HEAP. it is just sitting in Stack.

MUTATION --> changing
Covid19 Mutation -> internally changing

Immutable -> Not Changing

String is immutable -> once we create the string object, we cannot change the object value any more. It will create new Object in HEAP each time we modify the string.

In order to address that :

-> String pool: is a special place in HEAP java memory where String object are placed and reused.

When we create String using "" only, java will first search in String pool if String object already exists - if yes, it will reuse it, if not it will create and place the object into String pool.

EX:
String word = "hi";  "hi" is placed into String pool
String word2 = "hi"; "hi" is reused from String pool

	String word3 = new String("hi"); "hi" is created in HEAP are, outside String pool and not reused, because we typed NEW keyword.
== --> ONLY checks if both variables POINT/REFER to same object in HEAP MEMORY.

	word1 == word2 --> check if word1 and word2 point to same object in memory. does not compare values/characters.

equals() methods -> compares values/characters.
word1.equals(word2) ; => check if word1 and word2 have same value.

-> StringBuilder vs StringBuffer as an alternative

add new class ComparingStrings
main method
======================================================

System.gc(); Suggess Garbage collector to remove unused objects
Not guaranteed to run.
=====================================

Summary:
- practiced more class and objects
- using methods ONLY to read and write into instance variables
- HEAP and STACK java memory management
- NULL meaning
- String immutability
- String pool
- Comparing Strings
- GC -> garbage collector, removes objects in HEAP with no references from STACK
- StackOverflow, OutOfMemory errors
.............

