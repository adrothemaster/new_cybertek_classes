package iterviewQuestions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ConcatTwoArrays {
    public static void main(String[] args) {
        int[] a = {2,1,85,7,25,36};
        int[] b = {29,20,2,1,85,7,25,36};
        System.out.println(Arrays.toString(concatTwoArrays(a, b)));
    }


    public static int[] concatTwoArrays(int[] arr1, int[] arr2) {


        int[] result = new int[arr1.length + arr2.length];
        int i = 0;
        for (int each : arr1) {
            result[i] = each;
            i++;
        }
        for (int each: arr2) {
            result[i] = each;
            i++;
        }
        return result;

    }
}

