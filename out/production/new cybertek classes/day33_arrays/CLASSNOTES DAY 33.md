
04/11/2021

java programming day 33
-----------------------

add new package day33_arrays
add new class GroupFriends

declare String array called friends
and assign all first names of your group friends

Loop through the names in friends array
and print
Happy Holidays Nancy!
Happy Holidays Daud!
======================================

Reverse Array

{"java", "python", "ruby", "sql"}

{"sql", "ruby", "python", "java"}

{53, 1, 5}

{5, 1, 53}
============================

Whenever need, we can use 2 variables with for loop.

for(int i=0, j=0; i <= 4; i++,j++){
System.out.println(i);
System.out.println(j);
}

0
0
1
1
2
2


int num1 = 10, num2 = 4;


for(int i=0, j=3; i <= 4; i++,j--){
System.out.println(i);
System.out.println(j);
}

0
3
1
2
---------------------

add new class ForLoopWith2Variables

i = 4
p 3
str = cr78
=======================

Reversing array methods:
1) using additional array
2) without additional array, just re-arraging elements in same array

int[] nums = new int[3];
nums[0] = 123;
nums[1] = 33;
nums[2] = 5; //ArrayIndexOutOfBoundsException
==================================

String word = "hello_world";
String[] strArr = word.split("_");
strArr ==> {"hello" , "world"}

String word = "helloworld";
String[] strArr = word.split("o");
strArr ==> {"hell", "w", "rld"}

String word = "java is fun";
String[] strArr = word.split(" ");
strArr ==> {"java" , "is", "fun"}


String word = "https://learn.cybertekschool.com/courses/130";

String[] strArr = word.split("/");
strArr ==> {"https:","","learn.cybertekschool.com","courses","130"};



String word = "java program";

String[] strArr = word.split("a");
strArr ==> {"j","v", " progr", "m"};

How many 'a's in word?
strArr.length - 1 (3) will give us number of a letters.

The above is good when word does not start or end with a.
-------------------------------------
String word = "java";

String[] strArr = word.split("a");
strArr ==> {"j","v"};
strArr.length - 1 (1)
if(word.startsWith("a")) {

}
Note: please do not use this approach to count occurences of character or string in a string. when split values ends in string, result needs adjustment.

instead use Loop approach.
==================================

add new class SplitReview




"" -> empty string object
null -> null, no object at all


String word = "java";
String[] strArr = word.split("");
strArr ==> {"j", "a", "v", "a"}

Split method in java, is more powerful than we used so far.
it accepts REGULAR EXPRESSION as well.

REGULAR EXPRESSION (RegEx) => is a pattern based matching technique.

EX:
\d --> match any number
[A-Z] -> match any character from A to Z
....

String word = "java1html2sql";
String[] strArr = word.split("\\d");
strArr ==> {"java", "html", "sql"}

String password = "bcTddfsaf_a12sdf";
if(password.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^_&+=]).*$")) {
System.out.println("Valid password");
} else {
System.out.println("Invalid password");
}
https://stackoverflow.com/questions/3802192/regexp-java-for-password-validation

==================================

int[][] nums ;


add new class MultiDArrayExample
==================================

void method:

Summary:
- review
- reversing array
- review split
- listen interviews
- regular expression with split \d
- multi-d arrays
