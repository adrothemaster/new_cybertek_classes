06/15/2021
----------

Tuesday, Java Day 54
--------------------
OOP:
Encapsulation -> Data hiding, make your instance variables private and provide public getters and setters

Inheritance -> One class extends another class, and inherits variables and methods. Super/Parent class -> Sub/Child class. Child class is an extension of Parent class.

Abstraction -> is a process of hiding the implementation. And only revealing or focusing on the essential.
        -> in other words. Showing only WHAT it does, and not HOW.

        -> How do we use abstractions in java:
            2 ways to achieve abstraction in java:
                1) Abstract class
                2) Interface
EX:
WebDriver driver -> is abstraction, WebDriver shows only WHAT it does, but not HOW it does it.
---------------------------

new branch > new package:

day54_abstraction

ABSTRACT CLASS: -> we add abstract keyword to a class to make it an abstract class.
    -> abstract classes cannot be instantiated. We cannot create objects from abstract classes
    -> abstract classes are meant to be extended by sub classes
    -> we can add abstract methods into abstract class.
    abstract method -> is created using abstract keyword and does not have the implementation/method body
    So abstract class only shows WHAT it can do, but not HOW by using abstract methods.
    -> Sub classes, also called CONCRETE classes

In selenium also , we use abstract classes, popular one is :

public abstract class TestBase {
    ....
}

public class LoginTests extends TestBase {
    @Test
}

public class CreateAccountTests extends TestBase {
    @Test
}

-------------------------

public abstract class UITestBase {    
}

public abstract class APITestBase {    
}
===========================

ADD abstract class Student
    -> code(String language) {
             print "Student is coding using " + language
       }

    -> abstract attendClass()


ADD concrete sub class OnlineStudent
it needs to implement attendClass

ADD School class with main method
-----------------------------------

-> we can add both abstract and non-abstract methods into Abstract classes. So we can hide implementation of some methods, and show implementation of others.

SUNDAY        MONDAY
JULY 4TH AND JULY 5TH - NO CLASS - OFF 
-----------------------------------

Abstraction is achieved using 2 ways:
    1) abstract class
    2) interface

RESTAURANT MANAGEMENT APPLICATION:

    MenuItem
        -> prepare
        -> serve
        ......

    Pizza extends MenuItem 
        -> how to prepare
        -> how to serve
===================================`
