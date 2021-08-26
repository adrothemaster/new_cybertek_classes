package replithomework;

import java.util.Scanner;

public class RemoveDuplicatesMethod {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(uniqueChars(in.next()));
    }

    public static String uniqueChars(String str) {
        //TODO: write your code
        /**
         * uniqueChars is a method that will accept any String and return the String with out any dupclicate characters
         *
         * Examples:
         * uniqueChars("java") =jav
         * uniqueChars("mama") ==> "ma"
         * uniqueChars("spoon") ==> "spon"
         */
        String unique = "";
        for(int i = 0; i< str.length(); i++){
            // if (str.charAt(i) == )
            if(!unique.contains(str.charAt(i) + "")){
                unique += "" + str.charAt(i);
            }
        }
      return unique;

    }
}
