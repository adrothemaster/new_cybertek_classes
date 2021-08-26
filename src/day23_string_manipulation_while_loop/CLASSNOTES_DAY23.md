
03/25/2021
----------

Java Programming Day 23
-----------------------

String manipulation methods:

new package day23_string_manipulation_while_loop
add new class SMSMessage
main method

String message = "Sender: [Nadir] From Number<+1222-333-4444> Message:{Hello, lets code some java}";

substring, indexOf

indexOf() will find index numbers of the special characters: [],<>,{}

message.indexOf("[")
message.indexOf("]")
=================================

String sender, mobile, text
sender =
mobile =
text =


trim() method- removes empty spaces from beginning and ending of the string value.

EX:
String word = " java ";
System.out.println(word.trim()); ==> "java"

word = " s q l ";
System.out.println(word.trim()); ==> "s q l"
System.out.println(word); ==> " s q l "
word = word.trim();
System.out.println(word); ==> "s q l"

word = word.replace(" ","");
System.out.println(word); ==>  "sql"
---------------------------------------

CHAINING STRING METHOD:

String word = "hello world";

word.toUpperCase().replace(" " "|").equals("hello|world")

add new class ChainingStringMethods
add main method

split method is also important, we will study with Array topic.

In String class, we can chain some of the methods, it will run from left to right.

str.toUpperCase().toLowerCase().equals("something")

toUpperCase --> toLowerCase --> equals
= end result is boolean (true/false), because last one is equals method that returns boolean.
-----------------------------------------

IF STATEMENT WITHOUT ELSE:

int i = 1;

if(i <= 5) {
System.out.println(i);
}

above is if statement with condition, it will run from top to bottom and will check the condition ONCE. then print value of i -> 1

while loop -> similar to if statement, it checks if the condition is true, and runs the while loop block code. and it will keep running the code as long as condition stays true

int i = 1;
while(i <= 5) {
System.out.println(i);
}

LOOPS IN PROGRAMMING are used to repeat same block of code multiple times, as long as condition is true.
They are very useful for repetitive actions.

add new class FirstLoop
add main method

int i = 1;
if(i <= 5) {
System.out.println(i);
}

INFINITE LOOP -> loop that does not stop, because boolean condition is always true. it keeps running code in loop block
----------------------------
