package testTest;


import java.util.Scanner;

public class reverseAString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String temp = "";

        for (int i = word.length()-1; i>=0; i--){
            temp += word.charAt(i);
        }
        System.out.println(temp);

    }
}
