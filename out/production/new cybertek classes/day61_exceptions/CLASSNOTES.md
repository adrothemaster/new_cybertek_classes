
07/11/2021
----------

Java Programming Day 61
-----------------------

Exception handling
Collections

Exception handling in Java:
-> try catch
-> try catch finally
-> try catch catch
-> try catch catch catch finally
-> try finally

-> Exception hierarchy:
Object > Throwable > Error
> Exception
> RunTimeException

-> throwing exceptions using throw keyword
--------------------------------------------

add new branch/package day61_exceptions_collections

add new class ElementaryStudent

-> name, age
-> encapsulate the data.

in the setter classes:
setName(String name) :
if name is empty
throw illegalArgument Exception
with message: "Name cannot be empty"
else
this.name = name;

	setAge(int age)
		if age is < 5 or more than 12 
			throw new illegalArgumentException
				with message: Age cannot be < 5 or > 12
		else
			this.age = age
========================================================

Irina Kulik -> Happy Birthday!


throw keyword -> manually throw error/exception
try catch will catch the run time exception

try {
throw new IllegalArgumentException("Error");
} catch (Exception e) {
println("Caught the exception");
}

code ...
===========================

throw keyword is used to throw exception during runtime.

throw new IndexOutOfBoundsException();
===========================

CREATING A CUSTOM EXCEPTION TYPE:

We can create a class that extends RuntimeException to create our custom error class.

public class BreaktimeException extends RuntimeException

balance - 400
itemPrice = 500

InsufficientBalanceException extends RuntimeException

add constructors -no args. -with string

CustomExceptionTest:

balance = 400
itemPrice = 500

if itemPrice is more than balance
throw InsufficientBalanceException("Transaction declined. Not enough funds")
else
print "Item successfully purchased"


Suleyman Yusifov — Today at 12:52 PM
Murodil can u please  sum up in one sentence, why would we need to throw intentionally the exceptions since it will come automatically in most cases ?

we throw intentionally the exceptions, when we want the execution to stop at that point. java does not know our custom conditions and requirements
===============================

EXCEPTION HANDLING IN JAVA:
-> Exception is error that happens during code execution
-> We also call it RuntimeException
-> When exception/error happens , execution is stopped
-> so we can handle the error/exception using try catch statements.
-> handle exception-> we successfully catch the exception and code execution is not interruped/stopped

	-> In selenium webdriver when or where do we use try catch to control or handle the exception:
		-> we should ONLY use try catch where code execution needs to continue even if exception happens. We only use with steps that is not important, or steps that are sometimes needed and not needed other times:
			ex:
				lets say there is pop up box asking user to sign up for email notification that might or might not come up in front end.
				if it comes up. we click and cancel
				if it does not come up, we continue

				so the code that clicks on cancel, could be in try catch like this:

		@Test
		public void createAccountTest() {
			HomePage homePage = new HomePage();
			homePage.goto();
			homePage.isCurrentPage();
			try{
				homePage.cancelAddEmailPopup();
			}catch(Exception e) {
				System.out.println("Pop error is handled");
			}

			homePage.clickOnCreateAccount();
			AddAccountPage addAccountPage = new AddAccountPage();
			addAccountPage.addAccountDetails("username", "email"...);
			addAccountPage.isAccountCreatedSuccessfully();
		}
	--------------------------------------------------

So basically, we use try catch when exception happens during runtime, we do not want the code to stop execution. we want to catch and handle and successfully continue code execution

--------
THROW keyword is used to manually create runtime exceptions.

ex:
throw new RuntimeException("invalid email provided");

We use throw new statement, when we want to the code execution to STOP when one of our requirements is NOT met.
So we show runtimeError and stop the code execution, because we decided at this point , execution should not continue, as something invalid took place.

String email = "cybertek.gmail.com";

System.out.println("Thank you for your email: " + email);

In above example, code will run successfully as it looks fine for java.
But for us, programmers, when email is not valid, we want to show ERROR and STOP the code execution:

String email = "cybertek.gmail.com";
if(!email.contains("@")) {
//SHOW ERROR AND STOP RIGHT HERE
throw new RuntimeException("Invalid email!");
}
System.out.println("Thank you for your email: " + email);
//code that rely on email below here

summarize: throw keyword is used to manually SHOW ERROR and STOP CODE EXECUTION.
throw new RuntimeException("Invalid email!");
=============================================

CUSTOM EXCEPTION TYPES:
java comes with many exceptions already ready togo. we can catch them and handle or we can throw them if needed.
As exceptions are java classes, they follow inheritance hierarchy.

	But sometimes. we would like to be able to throw specific exceptions that have todo with our project only.
	In those cases, we can create custom exception types:

	HOW:
		create a custom class that extends either RuntimeException class or Exception class.

		Here you go, now you have your own custom exception type, that you can throw or catch.

		ex:
		public class InvalidCredentialsException extends RunTimeException {
			public InvalidCredentialsException(){}
			public InvalidCredentialsException(String msg){
				super(msg);
			}
		}

		if(userName.isEmpty() || password.isEmpty()) {
			throw new InvalidCredentialsException("cannot be empty");
		}
===============================================

TYPES OF EXCEPTIONS:
ERROR class and SUB CLASSES:

	Throwable > Error class and its sub classes:
		there are Errors that happen while code execution due to bad code, or environment etc:
		 ex:
		 	StackOverFlowError -> it means stack memory is full.
		 	OutOfMemoryError -> it means heap memory is full
		 	etc...
		 We DO NOT HANDLE these types of ERRORS. We try to prevent by writing good code etc, no infinite loops, or no not exiting recursion etc.

		 Add new class ErrorExamples

STACK --> HEAP
=====================================================

CHECKED VS UNCHECKED EXCEPTIONS:

	CHECKED EXCEPTION -> exception types that are checked at compile time. 
	-> they are Throwable class, Exception class, and all sub classes of Exception except RuntimeException
	-> We must/mandatory to HANDLE or DECLARE checked exceptions, otherwise code will not compile

	EX:
		
		new sub package checked_exceptions
		add new class CheckExceptionDemo

		Thread.sleep(1000); -> this line causes a checked exception, and will not compile.

		we MUST either HANDLE or DECLARE the checked exception.

		1) HANDLE:
		  try {
			Thread.sleep(1000);
		  } catch(Exception e) {
		  	e.printStackTrace();
		  }

		2) DECLARE using THROWS keyword:

		  public static void sleep(int seconds) throws InterruptedException {
		  	 Thread.sleep(seconds*1000);
		  }
=================================================

CHECKED EXCEPTIONS: are checked by compliler. and we must either HANDLE or DECLARE them.

Another ex:

	public static void main(String[] args) {
		String filePath = "data.txt";
        List<String> data = Files.readAllLines(Paths.get(filePath));
	}

Files.readAllLines portion THROWS a checked exception, so code will NOT compile as is.
What do we do so that code compiles and we read data from file:

1) HANDLE it using try catch. code will compile and if exception happends during runtime, it will be caught and handled, then execution will continue successfully.
   public static void main(String[] args) {
   try {
   String filePath = "data.txt";
   List<String> data = Files.readAllLines(Paths.get(filePath));
   }catch(IOException e) {
   e.printStackTrace();
   }
   }

2) DECLARE the Exception using THROWS keyword in method signature:
   Code will compile and run.
   But if any error happens during the execution, code will STOP and show error. throws keyword DOES NOT HANDLE the error, it just DECLARES.

   public static void main(String[] args) throws Exception {
   String filePath = "data.txt";
   List<String> data = Files.readAllLines(Paths.get(filePath));
   }
   ==========================================================

UNCHECKED EXCEPTIONS are the exceptions that happen during RUNTIME and it is optional to handle them or declare them, Code will ALWAYS compile.

-> Unchecked Exceptions are also called Runtime Exceptions.
-> Uncheckec Exceptions are RuntimeException class and its Sub classes.

EX:
int[] nums = {30, 40, 50};
System.out.println(nums[5]);

The above code will compile just fine, because ArrayIndexOutOfBounds Exception is UN-Checked/Runtime exception.

During code execution, that line will throw an ArrayIndexOutOfBounds and stop.

We should ideally, fix the code so that to prevent the runtime exception:

EX:
int[] nums = {30, 40, 50};
System.out.println(nums[1]);
-------------------
OR we can handle it using try catch. then code will not stop:

EX:
try{
int[] nums = {30, 40, 50};
System.out.println(nums[5]);
} catch(Exception e) {
e.printStackTrace();
}

Can we declare un-checked exceptions using THROWS keyword?

Yes, but it will not make any benefit or difference. So no need to do so.
=========================================

IQ: Difference between Checked vs Unchecked Exceptions?
-> checked exceptions are checked during compile time, and must be handled using TRY catch or declared using throws keyword for code to compile. Otherwise code will not compile.
try catch -> code will not stop if exception happens
throws -> code will stop if exception happens

-> Unchecked exceptions are also called RuntimeExceptions, they are thrown during Runtime, and normally happen due to programming mistakes like wrong index, null pointer etc.
---------------------

-> checked exceptions are Throwable , Exception classes and all sub classes of Exception class except RuntimeTimeException classes.

-> unchecked exceptions are RuntimeException and all its sub classes.

----------------------
-> checked exceptions : Examples could be Thread.sleep. reading from files, connecting to database type of codes.

-> un-checked exceptions : Examples ArrayIndexOutOfBounds Exception, Nullpointer exception.
-----------------------

IQ: Difference between throw vs throws keywords?

THROW keyword is used to throw Exception manually, programmatically.
throw is followed by new object of Exception type
ex:
throw new IllegalArgumentException("message");

THROWS keyword is used to DECLARE the exception in the method signature.

We normally use throws while working with checked exceptions.

EX:
public static void main(String[] args) throws Exception {
String filePath = "data.txt";
List<String> data = Files.readAllLines(Paths.get(filePath));
}
========================================================

IQ: Can we create custom exceptions?
Normally, we might need custom exceptions for project specific errors.

Yes, We can create a class for our custom exception and extend either Exception or RuntimeException classes.

EX:
Bank application might need a custom exception like

	InsufficientFundException
	InvalidPinException
	CannotTransferFundsException
==========================================================

try finally


try{
A
B
} finally {
C
}
D
------------
A or B has issue: C will ALWAYS run

we put code into try that might throw exception, but we do not want to handle it. so we do not use catch.

finally - we put code that is guaranteed to run no matter if try block was successful or no. except System.exit(0)
--------------



































