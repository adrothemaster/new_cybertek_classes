
03/31/2021
----------

Loops: while loop
do while loop
for loop
---------

	 for loop : numbers
	 		  : strings
	 		  : conditions
	 		  : printing
	 		  : reading characters 1 by 1(2/2, 3/3)
	 		  : break; -> exit loop/switch
	 		  : substring
---------------------------------------------

add new package day28_loops

add new class JavaCityCases

int totalCases = 0;
loop day = 1 till day 30

every day there are 200 new cases

every sunday(day % 7 == 0) there are 500 new cases

"day 1 - daily cases: 200"
"day 2 - daily cases: 400"
--------------

print totalCases =
--------------------------


add new class RandomPassword
main method

String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_!@#$%^&*";

how many char for password : 8

Random random = new Random();
random.nextInt(21);
===========================================

Find unique characters in string

String word = "java";

1) jav -> each character only 1 occurance. remove duplicates

2) jv -> only the characters that are unique/non-duplicate in the string


"helloworld" -> helowrd
----------------------------------
"helloworld" -> hewrd


add new class FindUniqueChars
main method

String word = "java";

how to check if a char is in String.
we can use contains method.

contains method accepts String as input. does not accept char or any other type.
EX:
String word = "hello";

	word.contains('h') ==> ERROR

	char letter = 'e'
	word.contains(letter) ==> ERROR

	String other = "java";
	word.contains(other.charAt(0)) ==> ERROR
--------------------------------------------

	String word = "hello";

	word.contains("h") ==> OK

	char letter = 'e'
	word.contains(letter+"") ==> OK

	String other = "java";
	word.contains(other.charAt(0)+"") ==> OK

+"" can be used to convert a char into a String.

'a' + "" --> will make String as a whole

word.charAt(1) + "" ==> will make String as a whole

+"" --> IS EASIEST/CHEAPEST WAY TO CONVERT ANY PRIMITIVE TO A STRING

100 -> int
100+"" -> String

123.5 -> double
""+123.5 -> String

char ch = 'Q';
ch --> char
ch+"" -> String

==========================

Below is some statements that we can use inside LOOPs: (all loops):

BREAK; -> exit the loop
CONTINUE; -> skip this iteration and goto next one

for(int i =1; i <= 5; i++) {
System.out.print(i);
}

12345


for(int i =1; i <= 5; i++) {
System.out.print(i);
if(i == 3) {
break; //exit loop
}
}

123
Because break; means exit the loop now, no matter the condition

-------------------------------------------------
for(int i =1; i <= 5; i++) {
if(i == 2 || i == 4) {
continue; //skip this iteration and goto next iteration
}

	System.out.print(i);
}

135

CONTINUE; statement will cause the loop iteration to stop and go to next iteration. any code after continue; statement will be skipped.

BREAK: can be used with LOOPS, SWITCH
CONTINUE: can be used with only inside LOOPS

add new class BreakVsContinue
