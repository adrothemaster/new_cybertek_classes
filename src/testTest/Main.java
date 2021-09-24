package testTest;


import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] ar = {1, 2, 0, 3, 4, 0, 0, 5, 6};
        int[] ar2 = new int[ar.length];
        //this is empty array to save the changes to
        Arrays.sort(ar);
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] != 0) {
                //ar2[i] += ar[i];
                int[] ar3 = new int[ar2.length];
                 for (int j = ar2.length-1; j >=0 ; j--) {
                     ar3[j] += ar2[i];
            }

            }
        }
        System.out.println(Arrays.toString(ar2));

    }
}

