
06/20/2021
----------

Java Programming Day 55
-----------------------

OOP:
-> Encapsulation
-> Inheritance
-> Abstraction
-> Polymorhism

review the concept , after some understanding, do a small example on your own

Abstraction -> process of hiding implementation, focusing on essential parts instead of details.
-> showing WHAT class can do, and hiding HOW it can do that.

2 Ways of applying Abstraction in Java:
-> Abstract classes
-> Interfaces

What is Abstract class?
-> Is a class that contains abstract keyword, where we can store abstract and non-abstract methods.
-> Cannot create object from Abstract classes

What is purpose of Abstract class?
-> Store reusable methods and variables for all sub classes
-> some of the methods can have implementation
-> and some others we keep it abstract so that sub classes MUST overrride them in a way that fits the sub class


add new branch > package day55_abstraction
====================================

Abstraction in java:
1) Abstract classes
2) Interfaces

	Class EXTENDS abstract class
	Class IMPLEMENTS interface

	Both are used to achieve abstraction in java.

	- Class can extend ONLY 1 abstract class but it can implement MULTIPLE interfaces.

	- Interface is similar to a class in java, and is used to achieve abstraction. We can store abstract methods and variables that sub classes will inherit.

	- We cannot create object from interface and abstract class.

-------------------------------------------
	new sub package: interface_demo

In Selenium: WebDriver is an interface that has methods that we use in selenium automation like: get(url), findElement(By smth), close, quit, getTitle.

And we have classes that implement WebDriver interface.

WebDriver -> ChromeDriver
-> FirefoxDriver
-> SafariDriver
-> HeadlessDriver/PhantonJS
etc

add new interface WebDriver

abstract methods:
get
quit
findElement
=========================================

SUMMARY: 	
-> abstract class review
-> little more of abstract classes
-> Flag drawing example with Abstract class
-> Interface intro
