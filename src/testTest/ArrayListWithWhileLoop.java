package testTest;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListWithWhileLoop {
    public static void main(String[] args) {
        String sentence = "I love my wife so much!";
        Scanner scan = new Scanner(sentence);
        ArrayList<String> word = new ArrayList<String>();

        while (scan.hasNext()) {
            word.add(scan.next());
        }
        System.out.println(word);
    }
}
