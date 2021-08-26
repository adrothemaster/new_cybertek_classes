package replithomework;

public class CreditCard {
   /**
    Practice inheritance, super keyword, constructors, classes, objects
You are given 5 java files on the left side. Do not touch the Main.java file.
In the CapitalOne, CreditCard, Chase, and Discover java files write the code to get the expected outputs.
The CreditCard is the parent class of all the other classes
Use the below information to get the expected outcome
CreditCard:
    Variables:
        card number (long)
        balance (double)
        apr (double)
        cashback (boolean)
    Methods:
        useCard() -> Doesn't need any code inside this class
        payBalance() -> Doesn't need any code inside this class

        Discover:
	  Instance variables values:
	   	apr - 11.99
	    cashback - yes
    Methods:
        useCard() -> Print "Using Discover card"
        payBalance(double balance) -> Print "Paying $givenBalance from $cardBalance)

Capital One:
	  Instance variables values:
	   	apr - 14.35
	    cashback - no
    Methods:
        useCard() -> Print "Using Capital One card"
        payBalance(double balance) -> Print "Paying $givenBalance from $cardBalance)

Chase:
	  Instance variables values:
	   	apr - 10.99
	    cashback - yes
    Methods:
        useCard() -> Print "Using Chase card"
        payBalance(double balance) -> Print "Paying $givenBalance from $cardBalance)
     */
    static long cardNumber;
    static double balance;
	static double apr;
	static boolean isCashback;

	public CreditCard(long cardNumber, double balance){

		this.cardNumber = cardNumber;
		this.balance = balance;

	}

    public void useCard(){}

    public void payBalance(double balance){}


}
