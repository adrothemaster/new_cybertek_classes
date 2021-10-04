package iterviewQuestions;

import java.util.Arrays;

public class findUnique {
    //find unique character of array

    public static void main(String[] args) {


        String[] word = new String[]{"art", "paint", "happy", "art", "life", "paint", "loving", "wife"};

        for (String unique : word) {
            int count = 0;
            for (String value : word) {
                if (unique.equals(value)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(unique + " ");

            }
        }
        System.out.print("!!!!!!");
    }
}