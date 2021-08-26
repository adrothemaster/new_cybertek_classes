package replithomework;

import java.util.Scanner;

public class methodWithStringCover {
    //The coverString method will take 2 string parameters from the caller.
    //Your job is to write an important code that will :
    //    to search and find each appearance of coverME within main
    //    then surround it with square brackets [coverMe]
    //    if you cannot find the coverME within main then just return whole main itself covered [main].
    //    keep in mind that coverME value can be of any length.

    // coverString("java methods", "me") ) ; ==> "java [me]thods"
    // coverString("Certified Wooden Spoon", "o") ) ; ==> "Certified W[o][o]den Sp[o][o]n"

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(coverString(in.nextLine(), in.nextLine()));
    }

    public static String coverString(String main, String coverME) {
        // your code here
        String temp = "";
        if(main.contains(coverME)){
            temp = main.replace(coverME,"[" + coverME + "]");
        }else{
            temp = "[" + main + "]";
        }
        return temp;
    }

}