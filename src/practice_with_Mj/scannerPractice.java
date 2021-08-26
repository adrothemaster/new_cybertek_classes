package practice_with_Mj;
import java.util.*;
public class scannerPractice {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("How many people do you live with?");
        int liveWith = input.nextInt();
        if (liveWith <= 2) {
            System.out.println("Live with less than 2 people");
        } else if (liveWith >= 3 && liveWith <= 6) {
            System.out.println("Live with 3 -6 people");
        } else {
            System.out.println("Live with more than 6 people");
        }
        System.out.println("What city do you live in?");
        input.nextLine();
        String city = input.nextLine();
        System.out.println("Do you live downtown");
        String downtown = input.next();
        if (downtown.equals("yes")) {
            System.out.println("Have you thought about moving to the suburbs");
            String suburbs = input.next();
            if (suburbs.equals("yes")) {
                System.out.println("Do it its great");
            } else {
                System.out.println("You should think about it");
            }
        }
    }
}
