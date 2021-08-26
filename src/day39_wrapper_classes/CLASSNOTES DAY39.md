
04/19/2021
----------

Java Day 39
-----------

Methods:

if(aboutToHitSomething()) {
dont();
}else{
keepGoing();
}

Any complex program: Rocket Science, AI, ML, DS, self driving etc, google, facebook, youtube, instagram...

For all those and any other things, someone like me and you sit and wrote the program using:
- variables
- conditions
- loops
- arrays or other data structure
- methods
- string manipulation
- calculation etc

Any complex program is combination of those, and what we learned so far.
--------------------

After you learn those basics, the rest is learning how to use existing libraries/someone else's code.
--------------------

Java is object oriented language, everything except primitives are objects in java programming.
For that reason, there is a way to convert a primitive to an object using WRAPPER CLASSES.

WRAPPER CLASSES -> classes that help convert a primitive into an OBJECT.
primitive > object
primitive type >> Wrapper class object Type

primitive -> just single piece of data, and no behaviour.
it is built into language.

Object -> can have multiple data, and behaviour.

int n = 10;
n.no methods/behaviour/action. just single data.
we can use it: print it, change it, add to it, calculate etc

String word = "java";
word.differetnMethods , because String is object type.String is class and from String class, we create String objects.

char ch = 'a';
ch.

Each primitive has a wrapper class in Java, so that it can act like an object and have behaviour.

byte --> Byte
short --> Short
int --> Integer
long --> Long

float --> Float
double --> Double

boolean --> Boolean
char --> Character
--------------------------

add new package day39_wrapper_classes

add new class WrapperClasses


Declare and create primitive objects:

Byte b1 = new Byte((byte)5);
Byte b2 = 10;

Short sh1 = new Short((short)40);
Short sh2 = 50;

Integer i1 = new Integer(100);
Integer i2 = 200;

Long l1 = new Long(300L);
Long l2 = 3455L;

Float fl1 = new Float(5.2F);
Float fl2 = 45.3F;

Double d1 = new Double(345.3);
Double d2 = 234.5;

Character ch1 = new Character('Q');
Character ch2 = 'V';

Boolean bl1 = new Boolean(true);
Boolean bl2 = false;
===============================

IQ: What is the difference between Auto-boxing and Un-boxing?

Auto-boxing is converting from primitive to wrapper class object.

Un-boxing is converting from wrapper class object to a primitive.
--------------------------------------------------------

AUTO-BOXING EX:

int n = 50;
Integer n1 = n;

n is primitive
n2 is Wrapper class object,
when we assigned n to n2, we did AUTO-BOXING - converting from primitive into Wrapper class object.

AUTO-BOXING : primitive >> Wrapper class object

----------------
UNBOXING : converting wrapper class object >> primitive

Integer n1 = new Integer(432);
int n2 = n1;
----------------

add new class AutoboxingUnBoxing
main method

Ahmed Balgi — Today at 8:38 PM
can we do Integer n = n; or we have to create a new variable
No, it will not work since we can declare variable once.

What is the purpose of wrapper classes:
ability to convert from pritimive into object (wrapper class)

Why?
1) useful methods comes with wrapper classes
2) Most of Collections use objects, and cannot use primitives, so we can use wrapper classes with them

EX: ArrayList cannot hold a pritimive, it needs an object so we can use wrapper class object.
-----------------------------------

char letter = 'j';
Character letter2 = letter; ? AUTO-BOXING primitive>object

Integer i = new Integer(345);
int n = i; UNBOXING - object > primitive
-----------------------------------

add new class WrapperClassMethods
main method:


Saim — Today at 9:37 PM
letter is just better

Wrapper classes help us convert primitive to object,
also provide very useful methods that we can use.

Character.isDigit...

------------------------------

IQ: How do you convert String into number?

we can use parse or valueOf methods in wrapper classes.
We can use Integer.parseInt(str) to convert from String to integer.
EX:
String  >> int

String total = "345";
int count = Integer.parseInt(total);
int num = Integer.parseInt("55");

String strPrice = "123.99";
double price = Double.parseDouble(strPrice);

add new class ParseString
main method

SUMMARY:
-wrapper classes
-primitive to object
- useful methods with wrapper classes
- converting string into int/double

To summerize isLetter and isAlphabetic check for almost all of the same things
isAlphabetic just also checks for one more thing classified as LETTER_NUMBER for unicode.
This example can help a little:
System.out.println(Character.isLetter('\u2165')); // false
System.out.println(Character.isAlphabetic('\u2165')); // true

the unicode here is for the roman number 6 (Ⅵ)

So for our cases isLetter is the go to method
