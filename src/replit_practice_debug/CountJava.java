package replit_practice_debug;

import java.util.Scanner;

class CountJava {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String word = scan.next();

        int count = word.length();


        int counter = 0;
        for (int i =0; i <= count-4; i++){

            String current4 = word.substring(i,i+4);
            if (current4.equals("java")){
                counter++;
            }
        }
        System.out.println(counter);
    }
}