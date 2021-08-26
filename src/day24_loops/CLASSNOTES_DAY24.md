
03/27/2021
----------

Java Programming Day 24
-----------------------

Quiz -> stay positive no matter the result

QA Automation Engineer -> easiest way to enter high paying IT jobs. You work side by side with Devs, BA, scrum master, POs...
You are part of software developement

SDET/AutomationEng -> Developer(Backend, Full stack)
-> DEVOps
-> Scrum master
-> Project Management
-> Management stuff, etc etc
========================================================

add new package day24_loops
add new class WhileLoopApples

main method

int apples = 1;
until 10

while apples is less than or equal 10
print eating an apple 1
increase apple by 1

No more apples :(

add new class YouTubeCatVideo
main method

"starting: World's smallest cat 🐈- BBC"

int seconds = 0;

video is 1 min 57 seconds

while we did not reach to last second
print " Watching YouTube video: second: 1"


print "Finished watching Cat video, lets start another one"

Thread.sleep(1000); ==> PAUSE the code execution for a 1000 milliseconds.(1 second).

---------------->
new class WhileLoopReverse
main method

int count = 5;

count = 5
count = 4
count = 3
count = 2
count = 1
count = 0

Finished the count

--------------------

In the loop, we need to update our variable, so that condition becomes false. we can use ++ or --
++ to count forward
-- to count backwards

int count = 5;

while(count >= 0) {
System.out.println("count = " + count);
count--;
}

System.out.println("Finished the count");
==========================================

add new class CountUntil
main method

add new class GiveMe5$
main method
import, create object of Scanner

Print "Give me 5 dollars"

int dollar = scanner input

while dollar is not 5
KEEP asking
"Give me 5 dollars"
and input dollar from scanner

-------
Thank you for 5 dollars
-----------------------

Scrum Master, OCA, AWS Associate dev



add new class Alphabet
main method

using while loop, print alhabet from a to z
================================================

DO WHILE LOOP
-------------

Do while loop is similar to while loop. except the condition is checked at the bottom.

FLOW IS:
1) Run the code the loop body
2) Check the boolean condition at the end
-if condition is true, goto step 1
-if condition is false, exit the loop

WHILE LOOP:
While loop checks the condition first, then if condition is true, it will run the loop body. Condition is checked at the beginnning.
If condition is false at the beginning, the loop body will not run at all.

FLOW:
1) check boolean condition
->if condition is true goto step 2
->if condition is false exit the loop
2) Run/execute loop body, goto step 1


So DO WHILE loop ensures that your code will run at least once.
--------------------------------------------------

add new class DoWhileLoop
main method

add new class PinCodeDoWhile
main method
import , instantiate Scanner
secretPincode = 1234
pinCode;
DO
Enter pincode
pincode= scanner....

WHEN pincode is not matching secretPincode -> goto line 146

Welcome to you account
==========================================

add new class GuessTheNumberGame
need Scanner

secretNumber --> 0-100
guessingNumber = 0
DO
"Guess the secret number"
guessingNumber -> from nextInt

	if guessingNumber > secretNumber
		print "Wrong, your number is too large"
	if guessingNumber < secretNumber
		print "Wrong, your number is too small"

WHILE (secretNumber is not guessingNumber)

"Congratulations, you won! secret number: 44"

