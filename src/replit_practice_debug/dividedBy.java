package replit_practice_debug;

public class dividedBy {
    public static void main(String[] args) {
        System.out.println(devides(26, 100));
        System.out.println(devides(5,20));
    }
///////////////////does not work dont use as example work on it/////////////////
    public static int devides(int num1, int num2) {

        if (num2 == 0) {

            System.out.println("Invalid Number");

            return num1;
        }

        System.out.print(num1 + " devid by " + num2 + " is: ");

        int count = 0;

        while (num1 >= num2) {

            num1 -= num2;

            count++;

        }

        System.out.println(count + " and remainder is " + num1);

        return num1;
    }
}
