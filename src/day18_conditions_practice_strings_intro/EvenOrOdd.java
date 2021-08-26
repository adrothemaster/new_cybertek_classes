package day18_conditions_practice_strings_intro;

public class EvenOrOdd {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(num % 2); // 5 / 2: 2+2+ remainder(1)
        System.out.println(num % 2 == 0); //true/false

        if(num % 2 == 0) { //divisible by 2
            System.out.println(num + " is even");
        }else {
            System.out.println(num + " is odd");
        }
    }
}
