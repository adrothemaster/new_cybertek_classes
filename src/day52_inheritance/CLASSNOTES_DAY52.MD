
06/12/2021
----------

Saturday - java programming day 52
----------------------------------

Sat & Sun are both java classes
-------------------------------

OOP principles/concepts:
	- Encapsulation
	- Inheritance
	- Abstraction
	- Polymorphism

Inheritance: 
	-> extends keyword used to inherit from super class to sub class
	-> variables and methods are inherited to sub class
	-> we can override the inherited methods :
		-> same name, same parameter
		-> same or more visible access modifier
		-> same or sub class return type


public Person getFirstPerson(String name) {
	
}

While overriding, we can change return type to sub class of Person class: Person > Student

public Student getFirstPerson(String firstName) {}
=========================================

Sprint (2 weeks) :
	-> Sprint backlog(capacity: 80 points) -> Stories that need to be completed within the Sprint
	-> Story types: development of new feature, modify existing feature, bug fix, Automation user stories
	-> Each story will have unique ID in Jira. 
	    VYT-4312 : Automation - Search for fleet by name (3 points)
		VYT-4312 : Automation - Search for trip by name (4 points)
	-> When you start working on the story:	
		1) analyze it , and make you understand the requerement and AC(Acceptance criteria). Ask others if not clear
		2) Manually test it, make sure it is passing and working as expected. if not, reject automation (in Jira, we set the status to Blocked and leave a comment saying "Functionality has a bug related to ....")

		3) Create new branch with Story ID: VYT-4312_Automation_ Search_for_fleet_by_name from master/main branch

		4) write all automation code and commit into that story branch

		5) push that story branch into GitHub

		6) create PR(pull request) and add code reviewers(coworker, someone more senior, someone with more experience in this module) 1 or 2 people

		7) They review and leave comments, ask change requests 

		8) Update your code in local branch for changes that were requested and commit, then push to GitHub again

		9) Reviewer will review new changes and hopefully approve

		10) Merge your story branch in the GitHub into master branch in the GitHub. Pull remote master into local master

		11) your story is now completed, goto Jira and change the status to "Ready for QA", "Review Comleted", "Automated"

		12) Delete story branch from local and github

add new branch > package :
	day52_inheritance

==============================


MobileApp
	-> name
	-> version
	-------
	-> useTheApp(int minutes)

Instagram
	-> postPhoto

Discord
	-> chat
----------------------


4 most important rules:
	1) inherited method with same signature (same method name and same parameter)
	See screenshots for full list
======================================

What is inherited from Super class to Sub class?

It depends on access modifier. Which sets the visibility and access to the variable or method.

There are 4 types of Access modifiers:

public -> visible/accessible to every class. In same package or another.
	   -> public variables and methods are always inherited to subclasses
protected -> visible/accessible to every class in SAME package and to SUB_CLASSES in other packages.
		  -> protected variables and methods are always inherited to sub classes

default -> visible/accessible in SAME package only. Not visible or accessible to ANY other CLASS in different package.
		-> default variables and methods are inherited ONLY when sub class and super class are IN THE SAME package. Not inherited to sub classes in different packages

private -> visible/accessible in SAME CLASS ONLY. and nowhere else.
		-> private variables and methods are NOT inherited from super class to sub class

Bashir Hasanov — Today at 12:54 PM
@Murodil does it mean that encapsulation and inheritance can not be used together? If private is not inherited

	-> Good question Bashir, when we apply encapsulation - we need to provide public/getters and setters. Sub classes will inherit those public getter/setter methods. and can assign /read value from private variable in Super class

=================================================

ENCAPSULATION + INHERITANCE
---------------------------

ENCAPSULATION -> is a process of hiding data/variable by making instance variables private and providing public getters and setters

If a super class has encapsulated variables, then how sub class can use them?

Even though private variables are not inherited, sub classes can use parent class getters and setters or parent class constructor to assign/read value from private variables.
==========================================

User levels : admin, teacher, student

User -> Admin, Teacher, Student

encapsulated data: role, name, id 

constructor + toString
===========================

POJO -> Plain Old Java Object
When we write a class to match the data in the application, we call it POJO class. Or Beans class.
===========================

User 
UserService
    
Item -> name, price, .... getter.setter. contsturcit
basic methods
ItemsService/VendingService
	-> add new item to database
	-> buy item
	-> remove item from list, database
	-> discount item
===================================

CONSTRUCTORS AND INHERITANCE

When we use inheritance, and create object of child class.
Java will first create object of parent class
and then create object of child class.

When we create object of sub class, java will first run the constructor of super class then run the constructor of sub class.

public class B extends A {}

B b = new B();
  -> create object of A
  -> then create object of B

A class constructor runs first
Then B class constructor runs next

SUPER() -> we can use super() to call super/parent class constructor from within Child class constructor.

When we create object of child class:

1) java creates object of parent class , so it goes and runs parent class constructor
2) java creates object of child class, so it runs child class constructor.

Child ch = new Child();

Parent constructor > Child constructor

SUPER. -> Is used to call/access parent class methods and variables

SUPER() -> is used to call parent class constructor
-----------------------------------------------------

Summary:
	-> overriding rules
	-> access modifiers and what is inherited
	-> encapsulation + inheritance
	-> constructors + inheritance
	-> super()
--------------------------
Tomorrow:
	-> review constructors + inheritance
	-> static (hidden)
	-> final keyword
