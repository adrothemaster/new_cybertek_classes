package testTest;

import java.util.Arrays;

public class arraysConcat {
    public static int[] concatArrays (int[] arr1, int[] arr2){
     int[] result = new int[arr1.length + arr2.length];
     int i = 0;
        for (int each :
                arr1) {
            result[i++] = each;
        }
        for (int each :
                arr2) {
            result[i++] = each;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(concatArrays(new int[]{2, 1, 3, 5, 6}, new int[]{2, 1, 8, 7, 5})));
    }
}
