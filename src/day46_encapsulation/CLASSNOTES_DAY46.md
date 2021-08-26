
05/18/2021
----------

java programming day 46

OOP principles:
- Encapsulation
- Inheritance
- Abstraction
- Polymorphism

Class and Objects

Class :
1) data/variables/ instance variables
2) methods/behaviour

From the Class, we create objects and assign data to variable and call the methods.

new keyword is used to create object or instance

- last class:
    - we defined the class with variables and method and used ONLY the methods to assign / read data from instance variables.

- Encapsulation - data hiding/information hiding. make instance variables PRIVATE, and provide PUBLIC getter and setter methods to access the instance variables.

- we hide PRIVATE information. SSN, salary, passwords, DL, bank account info, Card numbers etc etc. you hide this data from outside , because it is private for you. And you grant access to authorized requests.

- in Java, when we write custom classes, WE ENCASULATE our INSTANCE VARIABLES.
  How to encapsulate/hide instance variables -> we use PRIVATE keyword with variables.

Once we add Private keyword, the variable can only be accessed in SAME class, nowhere else.

But if variables are private , how do we even use them?
We provide public methods to access (get value/set value) to private variables.

In java programming, commonly, when we write custom classes, we make our variables PRIVATE and provide PUBLIC getter and setter methods.

add new package day46_encapsulation

add new class Car

	- model
	- year
	- mileage

add new class Dealership

main method
create car object


public class Car {
private String model;
}

private is an access modifier, when variable is private it can only be accessed in SAME class.

-------------

Encapsulation -> is a process of hiding the data by 1) making instance variables private and 2) providing public getter/setter methods to access instance variables.

Benefit:
- protect instance variables from invalid values.
- we can use conditions in setter methods to verify if data that is requested to be assigned is valid
- customize getter method to return data in certain format
- overall benefit is to protect your instance variables from unauthorized values/access

System.out.println(car1.toString());
System.out.println(car1);

toString() is a special method that exists in each and every object.

It is normally used to DESCRIBE the object with assigned data.
It converts each instance variable values into a String and returns as 1 string value.

Below 2 statements are both calling toString() method.
When you print object reference variable, it will call toString() method automatically.
System.out.println(car1.toString());
System.out.println(car1);

Encapsulation:
- data/variable hiding
- make instance variables private
- provide getter and setters methods

EX:

	public class Bird {
		private String type;
		private int age;

		public void setType(String type) {
			this.type = type;
		}

		public String getType() {
			return type;
		}
		....same for age
	} 


this.type = type; <=== this keyword means THIS INSTANCE OF THE CLASS.
this.type -> means type variable with is INSTANCE variable.
We need this. keyword in our methods when method parameter variable has same name as instance variable.
this.type -> instance variable type
= type; -> param variable type.
if we do not use this.type - java will not assign data to instance variable.


Bird bird = new Bird();
bird.type = "eagle"; =>> ERROR - type is private

bird.setType("eagle");
String t = bird.getType();

add new class CheckingAccount

encapsulated data:
balance, accountNumber, accountHolder, type = "checking"


add new class CapitalOne
add new object of CheckingAccount in main method here

===================================

Shortcut to generate getter and setters:
//right click > generate > Getter and Setter > Select all(shift+click last one) > Ok

---------------------------------
Lombok is special library to help with generating getter/setters , toString, constructor.








