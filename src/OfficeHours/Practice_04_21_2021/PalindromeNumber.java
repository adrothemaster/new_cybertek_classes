package OfficeHours.Practice_04_21_2021;

public class PalindromeNumber {

    public static void main(String[] args) {
//        System.out.println(112 % 1);
//        System.out.println(112 % 10);
//        System.out.println(112 % 100);

        System.out.println(isPalindrome(1234321));
    }

    public static boolean isPalindrome(int number){
        int reverse = 0; // 43
        int temp = number; // 123

        while (temp != 0) {

           int lastDigit = temp % 10; // 3
            reverse = (reverse * 10) + lastDigit;
            temp /= 10;
           // System.out.println(reverse);
        }
        return reverse == number;
    }


}
