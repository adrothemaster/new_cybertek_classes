package practice_04_12_2021;

import java.util.Arrays;

public class EvenAndOddFromArray {
    public static void main(String[] args) {

        int [] nums = {4,8,2,8,6,7,13,32};
        int even = 0;
        int odd = 0;

        for (int eachNum : nums) {
            if (eachNum % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        int [] evenNumbers = new int[even];
        int [] oddNumbers = new int[odd];

        for (int i = 0, e = 0, o = 0; i < nums.length; i++){
            if (nums[i] %2 == 0) {
                evenNumbers[e++] = nums[i];
            }else{
                oddNumbers[o++] = nums[i];
            }
        }
        System.out.println("amount of even numbers = " + even + " numbers are: " + Arrays.toString(evenNumbers));
    }
}
