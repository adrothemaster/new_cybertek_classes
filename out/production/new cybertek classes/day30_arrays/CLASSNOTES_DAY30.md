
04/06/2021
----------

Java programming day 30
-----------------------

previous class:
introduction to arrays

new package day30_arrays
add new class StudentArray

id        - 0
firstName - 1
lastName  - 2
batchNum  - 3
phoneNum  - 4

Declare student array and store 5 String values

String[] student1 = {"1234", "Adam"...};

String[] student2 = new String[5];
-----------------------------

Anna Ziyayeva — Today at 7:58 PM
Murodil - could you please explain why this code converts both Name and Last Name to UpperCase if the command is on for Last name (Student1[2]?

System.out.println((student1[1] + " " + student1[2]).toUpperCase());

@Murodil
Thank you!

(student1[1] + " " + student1[2]).toUpperCase()

"Anna Ziyayeva".toUpperCase() => "ANNA ZIYAYEVA"
=====================================================

LOOPING Through items in an array:

We can use while, do while , for loop, for each loop.

FOR LOOP with array:

	We can use for loop that starts with index 0 until array.length

EX:
int[] nums = {22, 55, 11};

	for(int i = 0; i < nums.length; i++) {
		System.out.println(nums[i]);
	}

	for(int i = 0; i < 3; i++) {
		System.out.println(nums[i]);
	}

	OUTPUT:
	22
	55
	11

FOR EACH loop: is used with collections of data in java, we can use FOR each loop with arrays, arraylists, maps, sets, or any other collections/data structures.

FOR EACH LOOP works ONLY with COllection of data.

int[] nums = {33, 11, 66};

for(int eachNum : nums) {
System.out.println(eachNum);
}

for(temp variable : arrayName) {

}

When we use for each loop. we need 2 parts,
1) for each loop/temp variable with same data type as array
2) we need an array or other collection after :

It will iterate for each item in array and store the value into loop variable. and we can use that variable inside the loop.
java automatically knows how many items are there in the array.

Advantage over FOR LOOP:
- simpler, short code
- no need to deal with indexes
- automatically loops from index 0 to last index

Distadvantages:
- ONLY loops forward, cannot loop backwards
- cannot read ahead/behind the values in other indexes

add new class ForEachLoopArray
main method

int[] data = {32, 532, 1, 5454, 22, 123, 543, 999, 321, 3};
------------------------------------

add new class ArrayLoopWithConditions

double[] prices = {22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};

String[] countries = {"Brazil",
"China",
"Cuba",
"Sweden",
"France",
"Vietnam",
"Albania",
"Brazil",
"Portugal",
"China",
"Philippines",
"Philippines",
"China",
"Philippines",
"China",
"Armenia",
"Philippines",
"China",
"Colombia",
"Philippines",
"Honduras",
"Indonesia",
"Brazil",
"China",
"United States",
"Russia"};

If you have to write comment to explain what your code is doing, it means your code is not clean code.

clean code -> readable, .....

