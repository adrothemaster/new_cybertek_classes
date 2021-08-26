package replit_practice_debug;

import java.util.Scanner;

public class hasJava {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if (word.substring(0,1).equalsIgnoreCase("j")){
            System.out.println("true");
            }
        if (word.substring(1,2).equalsIgnoreCase("j")){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}