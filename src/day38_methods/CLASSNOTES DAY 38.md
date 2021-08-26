
04/18/2021
----------

java programming day 38
-----------------------

Methods
Wrapper classes

METHODS => located inside the class, provide behaviour of the class.
We can store code that we can re-use in the method and can call whenever needed.

METHODS:
1) VOID METHODS:
1) Without parameters
2) with parameters
2) METHODS WITH RETURN:
1) Without parameters
2) with parameters
-----------------------------------

So far we wrote static method and called it in main method of same class or another.

There might be some cases where your custom method need to call another custom method,
custom methods can call other custom methods.

public class MyClass {
public static void a() {
System.out.println("a");
}
public static void b() {
a();
System.out.println("b");
}
public static void c() {
b();
System.out.println("c");
}
}

MyClass.a(); => a
MyClass.b(); => a b
MyClass.c(); => a b c

In some cases method can call itself:
RECURSION -> RECURSIVE METHOD -> when method calls itself in the method body. It always needs EXIT condition to prevent infitite loop

public static void printNum(int num) {
System.out.println(num);
num--; //2, 1 , 0, -1
if(num >= 0) {
printNum(num);
}
}

printNum(3);
--------------------------
3 2 1 0
5 4 3 2 1 0 -1 -2 ......

add new package day38_methods
add new class MethodCallAnother

start
-> prints "start"
continues();
continues
-> prints "continue"
end();
end -> prints "end"
---------------------------------

IQ:
How do you print 1-100 without a loop.

I can use recursive method to do that, where method will call itself.

1) main method -> need a static variable
2) custom method

recursion takes more space from java memory compared to a for loop.
loop is cheaper than recursion
-----------------------------------
add new class RecursiveMethod
====================================

LIBRARY IN JAVA: someone else's project that you can add to your project to use.

add new class StringUtils

1) add new method:

   isNullOrEmpty
   Parameter: String str
   returns boolean
   true:
   str is null or empty "" (isEmpty)
   otherwise false
-----------------------------------

String word = null;
System.out.println(word.isEmpty());

Above line will throw NullPointerException, because we are trying to run a string method on NO STRING/NULL

String word = null;
if(word.isEmpty() || word == null) { <==NullPointerException
}

if(word == null || word.isEmpty()) { NO ERROR. Good to go

}

if(word == null | word.isEmpty()) {<==NullPointerException

}

Ozgur Horuz — Today at 11:55 AM
- if (str.isEmpty || word == null ){ → this will give NullPointerException
- if(word == null || word.isEmpty()) { → this will be true, NO ERROR
- if(word == null | word.isEmpty()) { → this will give NullPointerException because you are using one pipe which forces the program to check both sides
------------------------------------------

add new method:
name: isPalidrome
params: String str
return: boolean

returns true if palindrome or false if not

Gabriel Altindag — Today at 1:00 PM
@muradil why java does not import everything automatically?

It is better if we choose import ourselves, because there might be SAME CLASS NAMES in different packages, so that we import the one we actually want to use.
--------------------------------

import:

	- when we use a class that is not in same package, we need to import it.
EX:
package a;
class MyClass1
static method: m1()

	package b;
	import a.MyClass1;
		class MyClass2
			main{
			 	MyClass1.m1();
			}
---------------------------------------
	- we do not need to import classes if in same package.

	package a;
		class MyClass1
			static method: m1()

	package a;
		class MyClass2
			main {
			 	MyClass1.m1();
			}
-------------------------------------------
	- when we call/use static methods from a different class, normally we do ClassName.staticMethodName.
	- if we do static import, we can call without classname:
		staticMethodName()

	package a;
		class MyClass1
			static method: m1(){}

	package a;
	import static a.MyClass1.*;
		class MyClass2
			main {
			 	m1();
			}

	package b;
	import static a.MyClass1.*;
		class MyClass3
			main {
			 	m1();
			}
------------------------------------

StringUtils class:
method: reverse
param: String str
return: String

StringUtilsTest:
main{
StringUtils.reverse("java"); => "avaj"
}
------------------------------------

method name:
contains
params:
int[] nums, int num

	return: boolean

	if num is amoung nums, return true , otherwise false

Office hours review sessions
=======================================
              0  1  2  3
int[] nums = {4, 1, 5, 8};
int num = 5;
boolean found = false;

for(int each : nums) {
    if(each == num) {
        found = true;
        break;
    }
}

System.out.println("found = " + found);
