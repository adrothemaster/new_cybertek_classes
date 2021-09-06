
04/03/2021
----------

java programming day 29
-----------------------

Alumni presentation:
- you see real work environment descriptions
- project, or sdlc(agile) process
- day to day activities of SDET/QA engineer

Interviews:
-> technical skill(java, selenium, git, api, sql, cicd...)
technical screening
-> 1) coding knowledge(syntax, diff statements)
-> 2) problem solving, approach to problem, ability to break down the problem to smaller portion s and solve
-> process/project knowledge (agile, sprints, stories, )
-> 1) can u tell me some challenge in your project and how you sovled it?
2) can you tell me some of your achievements in your current role etc
3) why u quitting your job ......
4) tell me about your self, your experience, your current responsibilities
--questions to employer
-> behavioral questions:
-> what is your goal next 5 years?
-> what do you bring to our company, why we hire u not others
-> if look back 10 years, what would you do diffently
-> zombies are coming,and u have 2 questions to ask.
-> what do u do if u have conflict with teammate
-> how do u motivate others or yourself
.......
-> communication skills/positivity
NOTE: companies interview many people:
-> companies/people who interview you might forget your answers(right/wrong), but they will not forget how you made them feel
-> .......
=====================================

minute and second loops:

minute 1
second 1,2,3,4,5,6,7,8,9,10....60

minute 2
second 1,2,3,4,5,6,7,8,9,10....60

minute 3
second 1,2,3,4,5,6,7,8,9,10....60


for(int minutes = 1; minutes <= 10; minutes++) {
System.out.println("minutes="+minutes);
for(int seconds = 1; seconds<=60; seconds++) {
System.out.print(seconds+" ");
}
}

"minutes=1"
"minutes=2"
...
"minutes=10"
-------------------

NESTED LOOP IN JAVA:
-> we can write nested loops in java. using while, do while, for loops.
basic syntax with for loop:
for(int i=1; i<=5; i++) { <---- OUTER LOOP
for(int j=1; j<=5; j++) { <--- INNER/NESTED LOOP
//code
}
}

    -> how does it work:
    	For each single iteration of OUTER LOOP, INNER LOOP completes full cycle each time.
    	OUTER LOOP equals 1, before outer loop goes ++, increases, the inner loop needs to complete FULL CYCLE (1 to 5)



add new package day29_nestedloop_arrays

add new class NestedForLoop

main method

-----------------------------
CENTURY
YEAR + 1 - ANCA
MONTHS
WEEKS
DAYS
HOURS:
MINUTES:
SECONDS:
MILLISECONDS:
----------------------------------------------------------------------				
MILES
STEPS (2000)
-----------------------
add new class StarsNestedLoop
main method:

OUTER 1 - 5
INNER 1- 10

* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
--------------------------

OUTER : 1 - 10
INNER: 1 to OUTER

*
* *
* * *
* * * *
.....


	   *
	*  * * 
		* * *
		* * * *

=======================

add new class MultiplicationTable

OUTER: 1 TO 10 {
INNER 1 TO 10 }
PRINT OUTER * INNER + "\t"
}
NEW LINE
}

Nested loop: when we use nested for loop, we can use the variable of outer loop inside the inner loop.

Or inner loop , can loop until the value of outer loop iterator.

We use nested loops, when reading data from excel files, multi-d arrays, where there is ROW and COLUMN.
ROW -> outer loop
COLUMN -> inner loop

for(int row = 1; row <= 3; row++) {
for(int col = 1; col <= 4; col++) {
System.out.println(row +" | " + col);
}
}

1 | 1
1 | 2
1 | 3
1 | 4

...
=====================================
We can also use nested loops with String manipulation.

EX:
String word = "java";
for(int i = 0; i < word.length(); i++) {
for(int j = 0; j <= i; j++) {
System.out.print(word.charAt(j));
}
System.out.println();
}
=============================================

add new class StringNestedLoop
main method

String word = "hello world"

1) find duplicates and count
2) find unique characters(appearing only once)
3) print character and number of occurences

j
ja
jav
java

======================
add new class CountCharsNestedLoop
String word = "java";

OUTER 0 - LENGTH {
//char outerChar = word.charAt(OUTER);
int count = 0;
INNER 0 TO LENGTH {
//char innerChar = word.charAt(INNER);

		IF outerChar == innerChar 
			count++;

     }
     PRINT outerChar + "=" + count
}
-----------
j=1
a=2
v=1
a=2
==================================

ARRAY - COLLECTION OF DATA OF SAME TYPE
---------------------------------------

So far we have been using single variables with single data:

int count = 10;
double price = 4.55;
String day = "Saturday";
String student = "Ahmad";
String student2 = "Noureddine";
String city = "Vienna";
String city2 = "Boston";

char letter = 'a';
------
What if in our program we need to store 5 different city names.

We could use 5 different variables:

String city1 = "Ashburn";
String city2 = "New York";
String city3 = "Fairfax";
String city4 = "Omaha";
String city5 = "Baku";

we could use 5 different variable, what if want to write a program for all 100 cities of USA.

program that stores emails of all students in B22.

String email1, email2, email3..... email400;
---------------------------

In programming, we always deal with large amounts of data of different types. or some groups of data.

For that each programming language has DATA STRUCTURES to easily and efficiently work with multiple sets of data.

The most popular of DATA STRUCTURES: is array

In java: array, list, map, set...
-------------------------------------------
ARRAY - COLLECTION OF DATA OF SAME TYPE.
SINGLE VARIABLE WITH MULTIPLE DATA


INSTEAD OF :
String city1 = "Ashburn";
String city2 = "New York";
String city3 = "Fairfax";
String city4 = "Omaha";
String city5 = "Baku";

String[] cities = {"Ashburn","New York","Fairfax","Omaha","Baku"};
---------------------------------------------

add new class ArraysIntro


Declare int array that can store 3 numbers:

int[] nums = new int[3];
[3] above means , this array can hold 3 int values.

Once we use [], java knows it is array, we can assign values.

Assign values to array:

int[] nums = new int[3];
nums[0] = 5;
nums[1] = 7;
nums[2] = 10;

IN THE ARRAY [5, 7, 10]

In java, ARRAYS ARE FIXED SIZE, NOT RE-SIZABLE.
Once we declare an array with certain size, we cannot change the size/length.

If you need resizable ARRAY, java provides ARRAYLIST as an option, which size can be modified.

Other languages allow, resizable arrays, not Java.

//we can also use int variable to specify index number
int i = 0;
System.out.println(nums[i]); //5

How to find size of array:

nums.length -> array size, no parenthesis

word.length() -> this is for String with parenthesis
---------------------------------

There are different ways of declaring and assigning values to array.

1) declare and specify the size, then assign values. This way is good to use when we know the count of items we need, but do not know the values yet.

int[] nums = new int[3];
nums[0] = 123;
nums[1] = 343;
nums[2] = 1254563;

Above, size is 3, but largest index is 2.

2) Declare and assign value in same statement. This way is good to use when we already have data to assign to our array.

int[] nums = {234, 12, 343, 545, 234, 222, 99};

In above example, we declare array with size 7 and assigned values in same statement.

System.out.println(nums.length); ==> 7
System.out.println(nums[0]); 234

3) Declare and assign value in same statement.

double[] prices = new double[]{10.3, 44.0, 23.99};
int[] nums = new int[]{234, 12, 343, 545, 234, 222, 99};

------------------------------------
add new class ArraysPractice

DEFAULT VALUES IN AN ARRAY:

int[] nums = new int[2];

System.out.println(nums[0]); ==> 0
System.out.println(nums[1]); ==> 0

for int[] array - default value is 0
double[] array --> 0.0
String[] array --> null
--------------------------
