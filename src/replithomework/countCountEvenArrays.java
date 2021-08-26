package replithomework;

import java.util.Scanner;

public class countCountEvenArrays {
    public static void main(String[] args) {

        /**
         * Given an array nums, count and print the number of even numbers in the array
         *
         * Examples:
         *
         * nums → [2, 1, 2, 3, 4]) → 3
         *
         * nums → [2, 2, 0, 3, 5]) → 3
         *
         * nums → [1, 3, 5, 7, 9]) → 0
         */

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //TODO: Write your code below

        int numEven = 0;

        for (int each : nums){
            if(each % 2 == 0){
                numEven++;
            }
        }
        System.out.println(numEven);





    }
}
