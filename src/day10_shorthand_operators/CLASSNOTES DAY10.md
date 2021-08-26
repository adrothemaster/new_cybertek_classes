
make sure first to really understand the requirement of the task
once you start coding, before typing java, try to come up with solution in your mind.
Solve first then code.

for all above to work, ensure you understoon the topic it is testing.
start small, do small examples just like in class.

review class code: retyping, try to break it, change it.
add a new example very similar to the one we all did during the class.

Start piece by piece and print small portions, make sure you clearly understand the concat process.
--------------------------------
30 mins >
===================================

03/07/2021
----------

Java programming Day 10.
------------------------

if you are struggling with understanding or catching up, and you see everyone else(seemingly) is doing fine. Majority of students during the course, they struggle.

Everyone has their own pace, depending on schedule, background, interests. Everyone has their own story of success
Practice advice to catch up:
identify areas that are not clear:

-> goto short video and watch and code that small example
-> goto class code and open class recording, and scroll to find that portion that we did.
-> retype again, and try to change it, break it, try it
-> then do small example similar to what we did during class
-> homework, repl
-> attend office hours with Saim.

System.out.println("HELLO world");
Make your schedule. and find time to do all those.

Selenium classes will also give change to review java.

-> GROUP STUDIES, 7
-> if you teach/mentor your classmates, it is beneficial for you as well. and you are doing a good deed
-> when you teach others, your speaking is improving automatically
-> when you goto interview, it will require more speaking than coding. not only CODE but also SPEAK
-> i switch my self as if interview are our students
========================================================

-> some interviews , no technical questions.
-> WHen you start job, maybe you learn 50-60% more than you learnt at school.
Once you stick around at work for 1,2 months, then you will wondering why they pay so much for such easy job, and for so much fun.
=========================================================

apply 200 jobs, 20 will call you, 5 will interview, 1,2 offers out of those 5.
--------------------

add new package day10_shorthand_operators
add new class WeatherToday
main method
weather -> sunny, raining, very cold, very hot
import scanner
create scanner object
ask a question:
How is the weather today?
"cold"
cold - is a nice day today!
============================

next(), nextLine()

Quiz will be published today after class, you can do anytime you have time. variables, topic before that.
https://learn.cybertekschool.com/courses/545/quizzes

Monday also , there will be office hours:
5:30 - 6:45 EST- No break in between
Mondays, Tuesdays, and Wednesdays

https://codingbat.com/java
https://www.hackerrank.com/
leetcode.com
https://projecteuler.net/
============================

next() | nextLine() -> string
nextInt()-> int, whole number

int weather = scan.nextInt();

String weather = scan.next();


next() | nextLine()

next() only accepts String until first space. one word
String words = scan.next();

	"wooden spoon"
	System.out.println(words); -> wooden

	words will have value "wooden". it will not accept second word "spoon". Because it only assigns/accepts string until first empty space.

nextLine() -> accepts String of many words, whole line until we press ENTER/new line. whole sentence

String words = scan.nextLine();
"wooden spoon is best spoon in planet"

System.out.println(words);
wooden spoon is best spoon in planet
=======================================

There is small BUG/GLITCH with nextLine():

Scanner scan = new Scanner(System.in);

System.out.println("Enter values:");
double rent = scan.nextDouble();
String month = scan.nextLine();

System.out.println(rent);
System.out.println(month);
--------
Enter values:
2500
March

OUTPUT:
2500
--------------------------------------
Issue above is if we use nextLine() right after nextInt, nextDouble, nextBoolean etc. it will take that new line character/enter to and will ignore our string.

it will take \n -> new line character and ignore the text.

add new class NextLineBug
add main method
import, create scanner

rent, month

print values
=======================================

Keep in mind:
- Whenever you use nextLine after nextInt, nextDouble etc.
  Please add additional scan.nextLine() on top;


Scanner scan = new Scanner(System.in);

System.out.println("Enter values:");
double rent = scan.nextDouble();
scan.nextLine();
String month = scan.nextLine();

System.out.println(rent);
System.out.println(month);
--------
Enter values:
2500
March

OUTPUT:
2500
===============================

How to update variable value.

int count = 10;
count = 15;

increase value of count by 5.

int count = 10;
count = count + 5;

double rent = 500;
rent = rent + 50;
println(rent); -> 550

double fuelPrice = 2.75;
fuelPrice = fuelPrice - 1.0;

print(fuelPrice); -> 1.75

new class ChangeVariableValue
add main method

new class ChangeBalance
add main method

declare balance = 1200.44;

double balance = 100.0;
double price1 = 10.0;
double remainingBalance = balance - price1;

NOW, we are just changing the variable value itself without adding new one.

double balance = 100.0;
double price1 = 10.0;
balance = balance - price1;
balance = balance - 5.0;

==============================

SHORTHAND ASSIGNMENT OPERATORS:

in Java, or any other programming, we use variables a lot, and we need to update the same variable value often.
EX:
int num = 10;
num = num + 1;
num -> 11

double price = 2.5;
price = price * 2;
price -> 5.0
===========================

int n = 5;

n = n + 3;
n += 3;

the lines above are doing same exact thing. both adding 3 to n variable.
=================================

Add new class ShortHandOperators
Add main method


SHORTHAND OPERATORS:

+=   -=   *=   /=   %=

INCREMENT/DECREMENT OPERATORS:

++    --

++,  -- only increase or decrease value of variable by 1.

int count = 2;
count++; //<-- add 1 to the count value
System.out.println(count);

count++; each time adds 1 to the variable value.

-- decreases variable value by 1.

int i = 44;
i--;
System.out.println(i); 43

3 WAYS TO ADD/MINUS 1 FROM VARIABLE:

int num = 10;
num = num + 1;
num += 1;
num++;
++num;

All of those statements above are adding 1 to the value of num.

add new class IncrementDecrementOperators
add main method

--------------------

in programming, we increment or decrement variable values buy 1 a lot.
for that purpose there --, ++ operators.
Anytime we increase or decrease the variable value by 1, we should use ++, --

int apples = 5;
apples++;
now we have 6 apples.
or
++apples;
now we have 7 apples.

apples--;
--apples;

PRE- INCREMENT VS POST-INCREMENT

SUMMARY:
-discussion about progress
-scanner next, nextLine
-operators: shorthand, inc/dec
- changing variable value 



















