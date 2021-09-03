package iterviewQuestions;

public class smallestToLargestArray {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 10, 15, 20, 25, 30, 1};

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
}
