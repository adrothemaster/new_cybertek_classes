
03/21/2021
----------

Java Programming Day 19
-----------------------

SUMMARY:
CONDITIONAL STATEMENTS:
-> IF STATEMENTS:
-> IF
-> IF ... ELSE
-> IF ... ELSE IF .. ELSE IF ELSE
-> IF () {
IF(){

					}
				}
		-> SWITCH STATEMENT:
			WE USE CASE : 
				BREAK;
		-> TERNARY OPERATOR ?
			var = (CONDITION) ? valueWhenTrue : valueWhenFalse;
===========================================

CLASS VS OBJECT:

Objects are real things around us. Like wooden spoon, cell phone, cheap computers, cheap cars, cheap buildings etc etc.

They all come from some sort of template or a class.
Objects have some attributes/data and behaviour.

HORSE:
ATTRIBUTE/DATA:
-> color
-> breed
-> size
-> weight
-> gender
-> age
-> height
-> name
BEHAVIOUR:
-> run
-> eat
-> sleep
----------------------------		
NADIR'S HORSE:
-> color: black
-> breed: Arabian horse
-> size: Medium
-> name: JavaHorse

NADIR'S HORSE.run();
NADIR'S HORSE.eat(grass);
NADIR'S HORSE.sleep();
NADIR'S HORSE.sleep(6);

---------------------

CLASS in java, is like template or blueprint. It will have 2 MAIN THINGS:
-> DATA/ATTRIBUTES
-> BEHAVIOUR

From CLASS we create OBJECTS.
OBJECT is real things that is created from a certain class. It is concrete.

EX:

CLASS CAR:
-> ATTRIBUTES/DATA/VARIABLES:
-> model
-> year
-> color
-> horse power
-> ACTIONS/BEHAVIOUR:
-> start
-> drive
-> break
-> stop

The above is general template , blueprint that any car will have. it is a CLASS.

Now lets create CAR OBJECT from CAR class.

NadirsCar:
-> model -> Mercedes E class
-> year  -> 2018
-> color -> black
-> horse power -> 350

NadirsCar.start();
NadirsCar.drive();
NadirsCar.break();
NadirsCar.stop();


CLASS -> OBJECT1
-> OBJECT2
-> OBJECT3

CLASS is a blueprint/template for OBJECTS.
From CLASS we can create MULTIPLE OBJECTS.
CLASS is general description with ATTRIBUTES/DATA and BEHAVIOUR/ACTIONS.
OBJECT will have real DATA values, and can do ACTIONS. that are described in CLASS.

FROM A CLASS, WE CAN CREATE OBJECTS.
CLASS IS A GENERAL TEMPLATE
OBJECT IS A REAL THING CREATED FROM A CLASS
=================================

CLASS CELLPHONE:
ATTRIBUTES/DATA/VARIABLES:
-> model
-> color
-> memory
ACTIONS/BEHAVIOUR/METHODS:
-> call
-> call(someone)
-> text(someone)
-> text(message, someone)
-> video_call
-> useInternet

OBJECT FROM CELLPHONE:

	CellPhone NadirsCellPhone = new CellPhone();
	NadirsCellPhone.model = "IPhone 12 Pro S";
	NadirsCellPhone.color = "black";
	NadirsCellPhone.memory = 512;

	NadirsCellPhone.call();
	NadirsCellPhone.call(Murodil);
	NadirsCellPhone.text(Saim);
	NadirsCellPhone.useInternet();
============================================

String  -> is a class/ template / blueprint that can be used to create objects.

From String class we create STRING objects.

String city = "Baku";
--------

String class:
ATTRIBUTES/DATA/VARIABLES:
-> value (in double quotes)

		ACTIONS/BEHAVIOUR/METHODS:
			-> equals
			-> equalsIgnoreCase
			-> length
			-> toUpperCase
			-> toLowerCase
			-> charAt
			-> indexOf
			.........

Marko Matevski — Today at 10:55 AM
@Murodil why we don't use keyword NEW with String?

String word = "java";
String word = new String("java");

Once we create String , we can use all available actions.

word.equals("java") => true or false

word.toUpperCase() => "JAVA"
.....

PRIMITIVES 8:
byte, short, int, long
float, double
char
boolean

Primitives are simple single piece of data.

int num = 3;

num has only 1 simple value 3. Cannot have more attributes. and cannot do any actions.

int num = 3;
num.equals(3) ? -> NO, becase num is primitive, and primitives do not have any actions/behaviour.

PRIMITIVE VS OBJECT/CLASS TYPE

PRIMITIVE -> is single data, and no behaviour
OBJECT/CLASS TYPE -> can have multiple data, and behaviour/actions
-------------------------

STRING MANIPULATION:
-> using String methods to process the "value"

add new package day19_class_vs_object_strings
add new class StringComparison
main method

String variable city and assign value

equals() -> compares string with another string and returns true or false. It is case sensitive comparison
EX:
String word = "java";
System.out.println(word.equals("java")); TRUE
System.out.println(word.equals("JAVA")); FALSE
System.out.println(word.equals("Java")); FALSE

equalsIgnoreCase() -> compares string with another string and returns boolean(true or false). It is case INSENSITIVE comparison

EX:
String word = "java";
System.out.println(word.equalsIgnoreCase("java")); TRUE
System.out.println(word.equalsIgnoreCase("JAVA")); TRUE
System.out.println(word.equalsIgnoreCase("Java")); TRUE
System.out.println(word.equalsIgnoreCase("ja va"));FALSE
System.out.println(word.equalsIgnoreCase("JAVA1"));FALSE


We can use equals, and equalsIgnoreCase in if statement, because they return true or false/ boolean.

if(word.equalsIgnoreCase("JAVA")) {}

boolean result = word.equalsIgnoreCase("JAVA");
System.out.println(result); //true


add new class LoginTest
main method

expUserName = "cybertek"
expPassword = "Abc123"

userName = "CYBERTEK"
password = "Abc123"

userName is not case sensitive
password is case sensitive

WHEN expUserName equals userName AND expPassword equals password
-> "Pass - user successfully logged in"

OTHERWISE:
WHEN expUserName NOT equals userName
-> "Incorrect Username"
OTHERWISE:
-> "Incorrect password"
=======================================

STRING CASE CONVERSION METHODS:

toLowerCase() -> converts all letters to lowercase

toUpperCase() -> converts all letters to uppercase

String word = "Java";

System.out.println(word.toLowerCase());
OUTPUT: java

System.out.println(word.toUpperCase());
OUTPUT: JAVA

ADD new class StringCaseConversion
main method

word -> "CyberTek";

Evgenii Malakhovskii — Today at 12:56 PM
System.out.println("CHICAGO".toLowerCase());      it works , but we didn't create object (String)  how can it call method?

JAVA METHOD -> is a function/action/behaviour of the class.

toUpperCase() is String class METHOD that converts letter to all uppercase.
=====================================

LENGTH OF THE STRING:

length() method in String class. returns the count of characters in the string.

String word = "java";
System.out.println(word.length()); //4

String name = "Nadir";
System.out.println(name.length()); //5

add new class StringLength
main method

Zafar Olimov — Today at 2:43 PM
question: When .lenght() returns value. Is it String or Number?
int count=firstName.length();
length() returns int value

When you use method, it is also CALLING A METHOD.
===================================================

SO FAR, String manipulation methods:

- equals()
- equalsIgnoreCase()
- toUpperCase()
- toLowerCase()
- length()
- startsWith()
- endsWith()
- contains()

You have a string country = "USA", how to check if all letters are uppercase?

UK, UAE, KG

if (countryCode.equals(countryCode.toUpperCase())) {
System.out.println("Pass - case is correct");
}else{
System.out.println("Fail - case is incorrect");
}

add new class CheckCaseMatch
add main method

String word = "UK";
String uWord = word.toUpperCase();

System.out.println(word); // UK
System.out.println(uWord); // UK

if(word.equals(uWord)) {
print "case match"
}else{
print "case mismatch"
}
=====================================

Ilhom Maqsudov — Today at 3:52 PM
can we make uppercase only first character?

Not with single method. in Java, String does not have a capitalize method. Other languages have it

======================================

- startsWith()
- endsWith()
- contains()

STARTSWITH() Method:
String startsWith() method, checks if string starts with certain string, and returns BOOLEAN (true/false).
It is case sensitive comparison

String word = "selenium";
System.out.println(word.startsWith("s")); //true
System.out.println(word.startsWith("selen")); //true

word = "java";
System.out.println(word.startsWith("ja")); //TRUE
System.out.println(word.startsWith("av")); //false
System.out.println(word.startsWith("JA")); //false

ENDSWITH String method:
checks if a string value ends with a certain string.
and returns BOOLEAN (true/false)

String word = "selenium";
System.out.println(word.endsWith("m")); true
System.out.println(word.endsWith("ium")); true
System.out.println(word.endsWith("lenium")); true
System.out.println(word.endsWith("M")); false
System.out.println(word.endsWith("va")); false

============================================

add new class StringStartsEndsWith
main method

String word = ""
