05/01/2021

Java Programming Day 41
-----------------------

Saturday -> java
Tuesday -> java

Sunday -> Selenium
Wednesday -> Selenium

Tomorrow: OFF - Easter

java
Git classes
Html

Automation engineer:
- java
- html
- selenium webdriver
- junit/testng
- maven
- CI - jenkins
--------------------------------

JAVA -> Front END/UI(User interface)/GUI
-> Selenium
-> Back End -> (backend code/database)
API -> backend code kind of
-> RestAssured
Database
-> SQL
-> JDBC
---------------------------------------

WRAPPER CLASSES:
-special classes to convert a primitive to an object
-each primitive type has a matching Wrapper class
byte -> Byte
short -> Short
int -> Integer
long -> Long
float -> Float
double -> Double
boolean -> Boolean
char -> Character
- they come with useful methods to perform actions
- we can use wrapper classes with collections.
- EX: we need Wrapper classes for arraylist:
-> Arraylist does not accept primitives, it can only accept objects

ARRAYLIST:
-> ordered collection of data of same type
-> unlike arrays, arraylist is re-sizable, we can change length of arraylist at any time.
-> it also accepts only objects
-> we use wrapper classes with arraylist
-> it is array based collection, -> it used array internally
-> when we add values to arraylist, it remembers the index numbers

------------------------------------------------

Add new package day41_arraylist

Add new class Cities

Arraylist methods:
-> add(value) -> adds to last index position
-> add(index, value) -> adds to given index position
-> get -> returns value at certain index
-> size -> returns the count of elements
-> remove(index) -> removes element at certain index
-> remove(object) -> removes given object from list, if many, removes first one
-> clear -> remove all elements
-> contains -> checks if element is present in list
-> isEmpty -> return true if no elements, or false if there elements
--> set -> updates/replaces value at certain index
--> replace is not present in ArrayList.
-> indexOf + set - can be used to replace
--> toString() -> returns all elements as single String, surrounded by []
--> indexOf -> finds the index of element
--> contains -> checks if element is present in list
=================================

add new class UpdatingArrayList

add new class ArraysAsList

Arrays class -> is a utility class for arrays,it contains many useful methods.
EX:
-> sort , toString, equals, binarySearch


asList() is another method in Arrays class.
It will convert an array to arraylist

List<Integer> nums = Arrays.asList(10, 4, 5, 3);

int[] array = {23, 54, 23, 454, 23};

Arrays.asList(array) -> this is converting array to arraylist
-------------------------------------

List<Integer> nums = Arrays.asList( 23, 1 ,34 , 54, 654);
System.out.println("nums = " + nums);
//nums.add(100); UnsupportedOperationException
//nums.remove(0);UnsupportedOperationException
//nums.clear();UnsupportedOperationException

The reason for UnsupportedOperationException is
when we use Arrays.asList it will return immutable list, that size cannot be modified.
But we can do any other operations on it.

WorkAround:
List<Integer> nums = new ArrayList(Arrays.asList( 23, 1 ,34 , 54));
-------------------------------------

How to create and assign values to ArrayList in 1 statement.

We can use Arrays.asList method.

1) List<Double> nums1 = Arrays.asList(23.3, 54.1, 2.2);

Disadvantage: nums1 is fixed size, cannot change the size by adding or removing values.
It will work for any other ArrayList methods.

add, remove, clear --> Cannot be used
contains, get, isEmpty or any other methods that does not change the size --> can be used.

2) List<Double> nums2 = new ArrayList<>(Arrays.asList(23.3, 54.1, 2.2));
   Now nums2 is resizable and can use any methods.

--------------------------

LOOPING ARRAYLIST:
1) for loop
2) for each loop
3) forEach method. starting from java 8


forEach method is introduced from jdk 1.8 => java 8.

it is another way of looping arraylist, we need to use
LAMBDA EXPESSION ( -> ) to specify action to do with elements in list.

List<Integer> nums = Arrays.asList(2, 4, 5);

nums.forEach(n -> System.out.println(n * n));

4
16
25
--------------------------------

nums.forEach(n -> {
if(n > 2) {
System.out.println(n * n);
}
});
16
25
--------

SORTING ARRAYLIST:


Array sorting -> Arrays.sort(arrayName);

ArrayList sorting -> Collections.sort(arrayListName);


Add new a class SortingList

main method


SUMMARY:
- review arraylist
- practice arraylist methods
- learn couple new methods
- for each
- sort
- conditions, and loop review/practice
--------------------------------------------
next class: ArrayList: custom methods with arraylist
--------------------------------------------
