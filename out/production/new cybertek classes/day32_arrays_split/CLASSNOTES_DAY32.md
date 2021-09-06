
04/10/2021
----------

Array -> array is collection of data of same type.
Previously our variables stored only single data.

EX:
String name = "Mike";

Using arrays we can store one or more values in single array variable.
--> In Java, Arrays are fixed length, not resizable, also only store same type of data.
c


1) recruiter/HR (your background, your skills). If you are interested in the particular role. They will go over JD(job description). Also discuss rate, how much you are looking for. My consulting rate is ....
   Communication skills

2) technical screening:
   on the phone/ in zoom:
   maybe they ask you to code on the screen
   or just talk.

3) Final round:  with hiring team/ hiring manager:
   3 - 5 hours:
   techincal questions
   project questions
   Agile question
   yourself
   bevioral questions ....
   =========================================

IQ: What is the difference between Array and ArrayList?

Array is fixed length in java, once we declare array, we cannot resize it.

ArrayList is resizable, we can add / remove data.
-----
Array can store primitives and objects
ArrayList can store only objects
---------------------------

add new package day32_arrays_split

add new class MallShopping
0          1         2         3          4          5
String[] items  = {"Shoes", "Jacket",  "Gloves", "Airpods", "iPad", "iphone 12 case" };
double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


Can you tell me how much you paid for "iPad" ? 439.50. both in same position in arrays


Shuffle the values in array using random class:
int[] itemIDs =   {12345 ,     12346,  12347,    12348,  12349,    12350};

//code


User Story 3 points:
Subtasks:
1) Analysis:
1 h
2) coding/automation:
10 h
3) review
4) QA Validation
5) Prod validation


please work on Student success quiz in announcement channel:

=======================================

boolean isSuccess = false;

CODE: array, arraylist, some other conditions


if(isSuccess) {
PASS
}else {
FAIL: report log4J
}

add new class MaxMinPrice
0          1          2        3          4        5
String[] items  = {"Shoes", "Jacket",  "Gloves", "Airpods", "iPad", "iphone 12 case" };
double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

c

2) find and print details of least expensive item

PSEUDOCODE:
Declare:
double maxPrice = price of first item
int indexOfMaxPrice = index of first item - 0

	LOOP STARTS FOR prices Array:
		read price[i] from array
			if price[i] is more than maxPrice
				change maxPrice to price[i]
				set indexOfMaxPrice to i

	END FOR LOOP

	PRINT items[indexOfMaxPrice] + prices[indexOfMaxPrice] + itemIDs[indexOfMaxPrice]
=================================================

SPLIT - String class method:

SPLIT - break into pieces/chunks in English

SPLIT method in Java -> splits String into Array items, by using the delimiter.

String words = "java;python;ruby";

java
python
ruby

We can use split method and specify ';' as delimiter to split into array

words.split(";") ==> result will be String[] with 3 values.
{"java", "python", "ruby"}


String words2 = "java is fun";
words2.split(" "); ==> String[] {"java","is","fun"}


String cats = "bengal cat tabby cat persian cat no cat here";
words3.split(" cat "); ==> String[]{"bengal", "tabby", "persian", "no" , "here"}

add new class SentenceSplit

String sentence = "java is fun";


===========================
String cats = "bengal cat tabby cat persian cat no cat here";


COUNTING OCCURENCES IN STRING USING SPLIT:

Given below string, count how many "cat" is in String
String cats = "bengal cat tabby cat persian cat no cat here";

add new class CountUsingSplit

add new class AWSZones

	String app = "etsy";
	String zones = "us-east-1,us-west-2,us-west-1"

==========================================


Deploying etsy to us-east-1...
Deployment completed for us-east-1


Deploying etsy to us-west-1...
Deployment completed for us-west-1

Deploying etsy to us-west-2...
Deployment completed for us-west-2


---All deployments complete----

----------

add new class ReverseSentence

java is fun => fun is java
wooden spoon search ==> search spoon wooden

hello all => all hello

-------------------------------

USING SPLIT FOR EACH CHARACTER:
In below examples, we are spliting "java" into separate letterr in array.

String word = "java";
String[] letters = word.split("");

the above will split by each character:
letters ==> {"j" , "a", "v" , "a"}

String word = "java";
char[] letters=word.tocharArray();
letters ==> {'j' , 'a', 'v' , 'a'}



Summary:
MallShopping arrays manipulation
split String method

Tomorrow:
More practice of arrays
Multi dymensional array     

