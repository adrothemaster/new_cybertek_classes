package iterviewQuestions;

import java.util.Arrays;

public class ArrayFindMaxAndMin {
    public static void main(String[] args) {
        int[] example = {100,20000,300,400,1,2,5987,4,3,8,7,55,};
        System.out.println("MaxValue in example = " + MaxValue(example));
        System.out.println("MinValue of example = " + MinValue(example));
        System.out.println("minValue example with Arrays.sort() = " + minValue(example));
        System.out.println("maxValue example with Arrays.sort() = " + maxValue(example));

    }
    public static int MaxValue(int[] n){
        int max = Integer.MIN_VALUE;
        for (int each : n)
            if (each>max)
                max = each;
            return max;
    }
    public static int MinValue(int[] m){
        int min = Integer.MAX_VALUE;
        for (int each: m)
            if (each<min)
                min = each;
            return min;
    }
    public static int minValue( int[]  n ) {

        Arrays.sort( n );
        System.out.println(Arrays.toString(n));



        return  n [ 0 ];

    }
    public static int maxValue(int[] n) {
        Arrays.sort(n);
        System.out.println(Arrays.toString(n));


        return n[n.length - 1];
    }
}
