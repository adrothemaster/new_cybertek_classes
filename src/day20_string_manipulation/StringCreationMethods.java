package day20_string_manipulation;

/** Below import statement is automatically added to each class by compiler*/
/**import all classes from java.lang package */
import java.lang.*;
import java.util.Scanner;

public class StringCreationMethods {
    public static void main(String[] args) {
        String word1 = "imac";
        String word2 = new String("macbook");
        String word3 = "";
        String word4 = new String();
        System.out.println("Hello World");
        Scanner scan = new Scanner(System.in);

        String city = " ";
        System.out.println(city.isEmpty());
        System.out.println(city.length() == 0); //true
        System.out.println(city.equals("")); //true
        System.out.println(city.equalsIgnoreCase("")); //true


    }
}
