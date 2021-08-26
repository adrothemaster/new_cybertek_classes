package replithomework;

public class nonDuplicated {
    public static void main(String[] args) {


        int[] nums = {1, 1, 2, 3, 4, 3, 4, 4, 9, 7};

        int nonDuplicates = 0;
        int count = 0;

        for (int each :
                nums) {
            for (int i = 0; i < nums.length; i++) {
                //System.out.println( "/" +nums[i]);
                if (nums[i] == each) {
                    count++;
                    //System.out.println("each = " + each);

                }


            }
            if (count == 1) {
                nonDuplicates = each;
                System.out.println("nonDuplicates = " + nonDuplicates);
            }
            count = 0;
        }
    }
}