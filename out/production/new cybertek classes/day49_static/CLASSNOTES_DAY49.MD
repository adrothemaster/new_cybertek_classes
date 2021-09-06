06/01/2021
----------

Java Programming day 49
-----------------------

constructor vs method

method is a behaviour of the class.
It can return a value or be void
we can have static or non-static methods

constructor is a special method that runs when we create object of the class.
It has no return type, and same name as the class name
No-args constructor is added by compiler if programmer does not add any
So every class must have a constructor
constructor returns reference to the object in the heap memory
                  
 stack   ----->  heap (memory location address)
Shop walmart = new Shop();
in this example: new Shop() creates an object in the heap memory and returns location/reference to that object and that is assigned to walmart variable.

Both method and constructor can have parameters and can be overloaded
============================

static method -> a method that has static keyword and can be called using just a classname. 
Ex: Character.isDigit(10); => isDigit is a static method, and we are calling using ClassName.methodName();

-> object of the class can also call the static method.

static method vs instance method:

1) static method can be called with classname.methodName directly or it can also be called using an object of the class
   instance method always needs an object to be called

2) static methods can only access(call/refer) static variables or other static methods. static method cannot access anything non-static
   instance method can access(call/refer) both static and non-static variables and methods

add git branch day49_static
add package day49_static

add new class StaticMethods
===============================

STATIC VARIABLE:

-we can access/call static variable using classname.variableName directly
-static variable is shared variable accross all objects/instances of the class.
-there is only single(1) copy of the variable
-non static variables - each object will have their own copy of non static variables

add new class StaticVariables

add new class BankAccount

static balance = 500
String user;
----
spend(double amount) ==> balance-=amount
----
showBalance() //prints current balance
=====================================
