package testTest;

/**
 * "FizzBuzz" -> when number is divisible by 3 and(&&) 5
 * "Fizz" -> when number is divisible by 3
 * "Buzz" -> when number is divisible by 5
 * otherwise print number
 */
public class FizzBuzzExample {
    public static void main(String[] args) {
        int number = 11;
        if(number % 3 == 0 && number % 5 == 0) {
            System.out.println("FizzBuzz");
        }else if (number % 3 == 0) {
            System.out.println("Fizz");
        }else if (number % 5 == 0) {
            System.out.println("Buzz");
        }else {
            System.out.println(number);
        }
    }
}
