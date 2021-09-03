package iterviewQuestions;

public class LengthOfStringArray {

    public static void main(String[] args) {
        String word = "hello im the word";

        //below is the usual way to get length of string
        System.out.println("length of word using length() = " + word.length());

        //this is a more complex way using a char[array] counting through each char. then adding each iteration to int = length
        System.out.println("length of word using char[array] = " + getTheLengthOfChar(word));

        //TRY CATCH WAY BELOW!!!!
        //Initialize i with 0 and iterate over String without specifying any condition. So it will be always true.
        //Once value of i will be more than length of String, it will throw StringIndexOutOfBoundsException exception.
        //We will catch the exception and return i after coming out of catch block.
        System.out.println("this way is using try catch to find length = " + getWithTryCatch(word));


    }
    /**
     *char[array] way
     */
    public static int getTheLengthOfChar(String str) {

        int length = 0;
        char[] strCharArray = str.toCharArray();
        for (char c : strCharArray) {
            length++;
        }
        return length;
    }

    /**
     *TRY CATCH WAY BELOW!!!!
     */
    public static int getWithTryCatch(String str) {
        int i = 0;
        try {
            for (i = 0; ; i++) {
                str.charAt(i);
            }
        } catch (Exception e) {

        }
        return i;
    }
}
