
05/11/2021
----------

A B C D --> Z

Java for Selenium Automation /
Conditions, variables
String manipulation in automation
etc.

codingbat.com/repl.it
leetcode.com -> for big Tech companies like Google, apple, Amazon etc

interview each other

Custom classes -> Create objects from them

OOP -> Object oriented programming

Using classes and objects in programming

4 OOP principles in Java:
- Encapsulation
- Inheritance
- Abstraction
- Polymorphism

Class -> is a bluprint, template for objects.

Class can have 2 main things:
- variables -> attibutes/data
- behaviour -> methods

So far we have been using objects from different classes:
- String, Scanner, Random, Array, Wrapper classes, ArrayList, System, ChromeDriver, WebDriver, WebElement etc etc

We can also write our custom classes in Java

public class HelloWorld {
public static void main(String[] args) {
//print
}
}
HelloWorld class is also a custom class that we wrote, but purpose was not to use this class as a template for creating objects.

We did not use like below:
HelloWorld hw = new HelloWorld(); we could do this

We used those classes to put main method and as runners.
------------------------

Now we are writing classes for a purpose of creating objects from them.

public class HelloWorld {
String message = "Hello World!";
}

-----
public class Test {
public static void main(String[] args) {
HelloWorld hw = new HelloWorld();
-> System.out.println(message);//ERROR - message not here
-> System.out.println(HelloWorld.message); //ERROR - message can be used only with object , not directly. because it is instance variable.
System.out.println(hw.message); //Hello World!

	}

}

==========================

public class A {
int num = 5;
String word = "java";

	public void methodA() {
		System.out.println("method A");
	}
}

public class AObjects {
public static void main(String[] args) {
A aObject = new A();
System.out.println(aObject.num); //5
System.out.println(aObject.word); //"java"
aObject.methodA();
}
}

System.out.println(A.num); will not work, because num, and word are instance/object variables, they can only be accessed using objects of the class A.

A.methodA(); will not work, because methodA does not contain static.
We can only call the method with classname.methodName, when method has static keyword. if static keyword is not added, we must create object of the class then call the method:

public class B {
//	static method
public static void methodOne() {
System.out.println("methodOne");
}
//  instance method/object method
public void methodTwo() {
System.out.println("methodTwo");
}
}
-----------------------
public class BObjects {
public static void main(String[] args) {
B.methodOne(); //methodOne
//B.methodTwo(); ERROR - methodTwo is not static
B bObject = new B(); //create object of B class
bObject.methodTwo(); //methodTwo
new B().methodTwo(); //this works too
}
}

When method is static , we can call it, using className.methodName

When method is not static, it means it is an instance/object method, and we need to create object of the class using NEW keyword. then we can call it objectVarName.methodName();

add new package day44_custom_classes

add new class Animal
instance variable:
type => "some animal"
methods - non static:
eat, speak
-----
add another class AnimalObjects with main method

create Animal class object and use type, and methods

INSTANTIATE Animal class:
Animal animal = new Animal();
======================================

add new class App
- attribute/data/ instance variable:
- name (give value here or through object)
- version

	- behaviour/methods:
		- open (use name and version variables in this method)
===========================

MyApps
main method:
App app1 = new App();
===================================