
03/28/2021
----------

Java Programming Day 25
-----------------------

Loops in java:

while loop | do while loop | for loop: 1) for loop with iterator
2) for each loop:
works with collections

In programming:
while loop to read files line by line
read database records one at a time until the last one.
for simple game development we could use while loop/infinite loop

while(file.hasNextLine()){
String line = file.readline();
......
}
-------------------------------------

Selenium automation:
- while certain element is not visible, keep waiting.
- while page is still loading, keep waiting for page to finish loading
- while there is still next link, keep clicking
.......

Life:
while you are hungry, keep eating
==============================

warm up:
add new package day25_loops
add new class WhileHungry

	boolean isHungry = true;
	int bananas = 0;
	int countToFull = 3;

	it takes 3 bananas for isHungry to be set to false

	while hungry
		eat banana 1

		if bananas reaches countToFull
			set hungry to false

		increase banana by 1
====================================

While, and do while loops, can be used with numbers as conditions , or boolean variables, boolean statements.

FOR LOOP:
another type of loop in java is FOR LOOP:
2 types of FOR LOOP:
1) for loop with iterator/counter
2) for each loop -> works with collections, need array topic to learn


FOR LOOP -> normally used when we know how many times it should repeat beforehand.
-----------------------------------

add new class ForLoopFirst
main method

add new class PrintStars

using for loop print 15 stars in same line

"* * * * * * * * * * * * * * * "

Guest Friend: Muhammad
--------------------------------

add new class SumOfNumbers

main method

int sum = 0;
count 1 to 5
and calculate the sum.

1+2+3+4+5

outside the loop:
we print sum
--------------------

add new class PrintEvenOrOddNumbers

1) print all even numbers between 1-100
2) print all odd numbers between 1-100

add new class FizzBuzz
main method

loop from 1 to 100
when num divisible by 3 and 5
-> "FizzBuzz"
when num divisible by 3
-> "Fizz"
when num divisible by 5
-> "Buzz"
else
-> print num
------------------------------------

add new class StartEnd
implement scanner

Enter start and end
int start
int end

print all numbers from start till end separated by space

start = 3
end = 6

3 4 5 6

start = 30
end = 6
when start is more than end,
"reverse numbering is not supported"
--------------------------------------

