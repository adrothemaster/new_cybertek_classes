package replithomework;

public class firstLast6CodingBat {
//The first element is nums[0] and the last element is nums[nums.length - 1]. Check if either of those is == 6.

    public boolean firstLast6(int[] nums) {
            if (nums[0] == 6 || nums[nums.length - 1] == 6) {
                return true;
            } else {
                return false;
            }
        }
    }
