package iterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class listOfNumbersAscending {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(5, 1, 99, 35, 78, 24, 86, 95, 15, 25, 100));
        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j < nums.size(); j++) {
                if (nums.get(i) < nums.get(j)) {
                   // System.out.println("nums = " + nums);
                    Integer num = nums.get(i);
                   // System.out.println("num = " + num);
                    nums.set(i, nums.get(j));
                   // System.out.println("j = " + j);
                   // System.out.println("i = " + i);
                    nums.set(j, num);

                }
            }
        }
        System.out.println(nums);
    }
}
