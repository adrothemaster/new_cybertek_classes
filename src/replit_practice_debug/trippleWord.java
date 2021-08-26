package replit_practice_debug;

import java.util.Scanner;

public class trippleWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0 ;
        //WRITE YOUR CODE HERE

        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2)) {
                count++;
            }
        }
    }
}

/* name
  new variable = String new word = 0;
  L - R -- 0,1,2,3,4,5,6,7,8,9...
           ^---^ ^---^ ^---^ ...
   look for triples in the str starting

 */