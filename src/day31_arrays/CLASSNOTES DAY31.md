
04/07/2021
----------

java programming day 31
-----------------------

java for test automation

Arrays -> Arrays class

add new package day31_arrays

add new class CharArray

char array with following values:
'j', 'a', 'v', 'a', ' ', 'i', 's', 'f', 'u', 'n'

char[] letters = {'j', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n'};

When we have char array, we can create a String out of it. It will automatically join each letter into a single string

String sentence = new String(letters); => "java is fun"

CONVERT CHAR ARRAY INTO STRING:
Just create a new String with char array in constructor

CONVERT STRING INTO CHAR ARRAY:

String item = "wooden spoon";
char[] itemArray = item.toCharArray();

itemArray => 'w', 'o', 'o', 'd', 'e', 'n',' ' ...spoon

System.out.println("hello world")

"hello world" -> char[] value

Any string that we write in java, is a char array internally for String class.

String word = "java";

String class internally uses char array to handle characters within double quote.

FOR EACH LOOP -> ENHANCED FOR LOOP (SINCE JAVA 5)
----------------------------------------------------

String >>> char[] array
String str = "git";
How to convert str to char[] array?

char[] letters = str.toCharArray();

letters ==> 'g' , 'i', 't'

--------------------------
char[] array >>> String

char[] grades = {'A', 'B', 'C', 'D', 'E'};
String gradesStr = new String(grades);

gradesStr ==> "ABCDE";
---------------------------
join method in String :

String[] array >>> Single String with delimiter

String[] words = {"one", "two", "three"};

String sentence = String.join("! ",words);
System.out.println(sentence);
"one! two! three"
---------------------------

Arrays utility class : has useful methods to work with arrays.
it is located in java.util package.
import java.util.Arrays;

1) Arrays.sort(arrayname) method:
   it will sort the array in ascending (small to large) order
   a - z

int[] nums = {5, 1, 7, 0};
Arrays.sort(nums);

nums ==> {0, 1, 5, 7}

2) Arrays.toString(arrayname):
   It will help us print array values in single statement without using a loop. it will convert any array to String, and help print in one statement.

int[] nums = {5, 1, 7, 0};
System.out.println(Arrays.toString(nums));
"[5, 1, 7, 0]"

-------------------------
Add new class ArraysUtil
main method


HOW TO SORT AN ARRAY:

EASIEST:
Arrays.sort(arrayName);
It will sort in ascending order

Reverse Order:
Arrays.sort(arrayName, Collections.reverseOrder());
But does not work with primitive type arrays. only object type.
---------------------------

Sorting arrays algothirms:

Bubble sort, linier sort, quick sort, etc.

Arrays.sort is good togo.
----------------------------

Arrays.binarySearch() :
this method/function helps search in array for a value

Arrays.binarySearch(ArrayName, item);
0    1   2    3
int[] nums = {33, 55, 123, 400};

Arrays.binarySearch(nums, 55); ==> 1
Arrays.binarySearch(nums, 400); ==> 3
Arrays.binarySearch(nums, 40); ==> -1, -3
Arrays.binarySearch(nums, 300); ==> ??

PRE-REQUISITE
PRE-CONDITION: Array must be sorted for binarySearch to work.
otherwise we get unexpected result

add new class BinarySearch

EQUALS METHOD IN ARRAYS CLASS:
Accepts 2 arrays of same type and returns true:
if arrays are same length
and have same data in same order
otherwise
returns false

int[] nums1 = {4, 12, 53};
int[] nums2 = {4, 12, 53};
Arrays.equals(nums1, nums2); ==> true

int[] nums1 = {4, 12, 53};
int[] nums2 = {4, 12, 53, 45};
Arrays.equals(nums1, nums2); ==> false, different length

int[] nums1 = {4, 12, 53};
int[] nums2 = {12, 4, 53};
Arrays.equals(nums1, nums2); ==> false

add new class ArrayEquals

Summary:
toCharArray
new String(char[] here)
String.join
Arrays: sort, toString, binarySearch, equals
copyOf -> helps copy one array to another
---------------------------------	
