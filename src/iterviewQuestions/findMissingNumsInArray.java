package iterviewQuestions;

import java.util.Arrays;

public class findMissingNumsInArray {
    public static void main(String[] args) {

        /**                                                               need 3 here
         * get the sum of what it would be if we had 7 digits in order IE. 1,2,0,4,5,6,7
         */
        int[] arr1 = {7, 5, 6, 1, 4, 2};
        //Missing number : 3
        int[] arr2 = {5, 3, 1, 2};
        //Missing number : 4

        int max = Integer.MIN_VALUE;
        int expectedsum = 0;
        int actualValue = 0;

        for (int i = 0; i < arr1.length; i++) {
            actualValue += arr1[i];
            if (arr1[i] > max) {
                max = arr1[i];
            }
        }
        for (int j = max; j >= 0; j--) {
            expectedsum += j;
        }
        System.out.println("result = " + (expectedsum - actualValue));
    }

}

