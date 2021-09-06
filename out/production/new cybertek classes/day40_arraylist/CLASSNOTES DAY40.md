
04/20/2021
----------

Java programming Day 40
-----------------------

ArrayList

In programming, we always deal with multiple sets of data. it could be user data like names, emails, addresses, phone numbers etc. Or it could be product data like product names, categories, statuses, prices, etc. or it could be mixed data, like user history, steps that user does, etc etc.

In order to work with large amounts of data, we use DATA Structures, as you can see by name that they help programmatically structure the data so that we can easily work with data.

In java DATA STRUCTURES:
-> Arrays
-> Collections Framework:
-> List - ArrayList
-> List - LinkedList
-> Set -> HashSet
etc
Maps and other ones that help us structure the data into managable format.
So that we can verify, store, delete , update data easy way.

In general Data Structures are there so that we can work with data easily.

They are like tools of a car mechanic.
-----------------------------------------

In Java - Arrays are fixed size, once declared we cannot add or remove elements.
So it has a disadvantage when you work with dynamic or unpredictable sets of data.

This is where ARRAYLIST comes in, it is dynamic sized and we can add and remove elements any time. It is not FIXED size.

IQ: Difference between Array and ArrayList?

Array is fixed size
ArrayList is re-sizable | dynamic size
---------------------------------------

add new package day40_arraylist
add new class RawArrayList

ArrayList -> is a class in java. that is used to store multiple sets of data like array.

1) It keeps index ordering
2) It allows duplicated values
----------------------------------

DECLARE ARRAYLIST:
2 ways:

	ArrayList list = new ArrayList();
	List list2 = new ArrayList();

ArrayList is located in java.util package and needs to be imported to your class.
import java.util.*;

ADD DATA TO ARRAYLIST:
we use ADD method with our arraylist object.


When we declare arraylist, DEFAULT_CAPACITY = 10. it means java declares arraylist with 10 null data.

Raw ArrayList -> is arraylist that can store objects of ANY TYPE.
It is not recommended to use like this, unless in certain cases.

EX:
ArrayList list = new ArrayList();
list.add("hi");
list.add(15);
list.add(true);

As you can see - the above list is of RAW type and allows any type of data. It is not recommended.

Instead we need to use Restricted Type that only allows certain type of data.

EX:
RESTRICTED:	ArrayList<Integer> nums = new ArrayList<>();

RAW :       ArrayList nums = new ArrayList(); -> not recommended
-----------------------------------

ARRAYLIST Internally USES normal Arrays. It is based on Array.
It wraps around normal array. It uses dynamic array by copying values.

add new class ArrayListExample

===================================

ArrayList  methods:
- add(value) -> adds value to arraylist
- size() -> returns the size of arraylist
- get(index) -> returns value at the index
- remove(index) -> removes element at the given index
- remove(value) -> removes the value from arraylist
- isEmpty() -> checks if list is empty
- contains(element) -> checks if element is present in list
- clear() -> remove all elements

CAPACITY -> how many it could hold
SIZE -> how many actual values are there

ArrayList uses more computer memory compared to array.
Array by itself is faster. when we have fixed set of data.

add new class ArrayListLoop
main method
import java.util.*;

add new class ArrayListMethods

ticket
training@cybertekschool.com

Easter - May 2

gurhan@cybertekschool.com
--------------------------
