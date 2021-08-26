03/24/2021
----------

java programming day 22
-----------------------

String manipulation methods:

- equals() -> checks if value equals another string. case sensitive
- equalsIgnoreCase() -> checks if value equals another string, case insensitive
- length() -> returns count of characters in string
- toUpperCase() -> converts all letters to uppercase
- toLowerCase() -> converts all letters to lowercase
- startsWith() -> checks if string value starts with another string
  returns boolean
- endsWith() -> checks if string value ends with another string and returns boolean
- contains() -> checks if string is present another anywhere in string value. returns boolean
- isEmpty() -> checks if string is empty/no characters "", returns boolean
- replace() -> searches for a string and replaces all occurences in string value
  ---> Index in String -> is position of characters in the string. starts with 0. Zero based. each character in string value has a position or index.
  -> charAt(index number) -> reads a character at given index and returns that character
  -> indexOf() -> searches for a string and returns index numbers. if not found returns -1
- substring() -> reads one portion of the string from beginning index to ending index.

add new package day22_string_manipulation
add new class ReverseUsingCharAt

String word = "java";
avaj
----------------------

charAt(index) vs indexOf(string)

they work differently:
charAt reads a character at certain index
indexOf searches for string and return index number

	charAt returns -> char (single character) at given position
	indexOf returns -> int (index/position number) for the string

add new class IndexOfExample
main method
String technologies = "java, html, css, selenium, testng, maven, cucumber";

indexOf method :
WHEN FOUND:
-> returns int index position number which is ALWAYS 0 or more

	WHEN NOT FOUND:
		-> returns -1
               01234
String word = "hello";

word.indexOf("h") ==> 0
word.indexOf("el") ==> 1
word.indexOf("lo") ==> 3

word.indexOf("j") ==> -1
word.indexOf("world") ==> -1
word.indexOf("tomato") ==> -1

if(word.indexOf("el") > -1) {  //OR >= 0 // != -1
present
}else{
not present
}

===============================

substring() String class method

returns part of the string.

2 ways of using substring()

1) substring(start, end) -> returns part of string from start index until end index. end index is not included.
   remember indexes starts from zero.

2) substring(start) -> returns part of string from start index until the last character.
   01234
   String word = "hello";

word.substring(0, 2) => he
word.substring(1, 4) => ell
word.substring(2, 4) => ll

word.substring(1, 6) => StringIndexOutOfBoundsException

word.substring(0) => hello
word.substring(2) => llo
word.substring(4) => o
word.substring(-2) => StringIndexOutOfBoundsException
word.substring(10) =>
==================================

add new class StringSubstring
main method
String word =


new class DynamicSubstring
main method

substring + indexOf
---------------------------

