
05/04/2021
----------

Java programming day 42
-----------------------
Vladislav Shekhovsev — Today at 7:07 PM
@Murodil can u please remind what the difference between ArrayList and List ?

ArrayList -> is a class in java
List -> is an interface in java

Normal way of declaring arraylist:
ArrayList<Integer> nums = new ArrayList<>();

Polimorphic way of declaring arraylist, this is little more flexible thanks to polymorphism in java.
This way is more prefferred by many programmers and more popular.
List<Integer> nums = new ArrayList<>();

Code analysis tools like SonarCube -> prefer List<String> ...

when we learn polymorphism, we will fully understand difference.
==============================

Collections class:
is a utility class in java to help with many common operations with Arraylist.

It is similar to Arrays class for Arrays.

It has many useful methods:
- sort
- reverse
- frequency
- min,max
- replaceAll
- shuffle
.....

add new package day42_arraylist

add class CollectionsUtil
------------------------------

add new class UniqueFromList

main

List<Integer> nums = new ArrayList<>(Arrays.asList(2, 4, 4, 1, 5, 6, 0, 6));




Nevzat Mutlu — Today at 9:00 PM
@Murodil If we write long complex codes, we can simply separate them into methods and even can use them in different classes to organize better right?

Absolutely yes, method in java, should be doing only ONE thing. if it is doing multiple things, it means we need more methods.


Summary:
- Collections class methods
- custom methods with Arraylist
- shortcuts {
ctrl + space --> gives suggesstions
Select code > right click > Refactor > Extract method

	}
Next class:
little more arraylist
custom classes / OOP introduction
