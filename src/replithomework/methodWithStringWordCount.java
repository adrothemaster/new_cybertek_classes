package replithomework;

import java.util.Scanner;

public class methodWithStringWordCount {
    //wordCount accepts String and returns how many words are in the given String
    // wordCount("foo bar")
    //returns 2

    public static int wordCount(String words) {
        // your code

      int count = 0;
      String[] arr = words.split(" ");
      count =  arr.length;
      return count;

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(wordCount(in.nextLine()));
    }

}
