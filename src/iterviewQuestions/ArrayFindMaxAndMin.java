package iterviewQuestions;

public class ArrayFindMaxAndMin {
    public static void main(String[] args) {
        int[] example = {100,20000,300,400,1,2,5987,4,3,8,7,55,};
        System.out.println("MaxValue in example = " + MaxValue(example));
        System.out.println("MinValue of example = " + MinValue(example));

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
}
