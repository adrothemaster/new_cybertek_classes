package iterviewQuestions;

public class smallestToLargestArray {
    public static void main(String[] args) {
        int[] arr = new int[]{-100000,-3, 655, -11, 5, 10, 15, 20, -25, 30, 1};


        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i <arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
            else if (arr[i] < min)
                min = arr[i];
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);

    }

    /**
     * figure out later how to return BELOW!!!!
     * @param a
     * @return
     */
    public static int minOrMax(int a) {
        int[] arr = {-100000, -3, 655, -11, 5, 10, 15, 20, -25, 30, 1};
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];

            }
        }
        return a;
    }
}
