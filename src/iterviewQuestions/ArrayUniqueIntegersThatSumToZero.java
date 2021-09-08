package iterviewQuestions;

import java.util.Arrays;

public class ArrayUniqueIntegersThatSumToZero {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution(10)));
        System.out.println(Arrays.toString(Solution(5)));
        System.out.println(Arrays.toString(Solution(100)));

    }
    public static int[] Solution(int N){
        int[] result = new int[N];
        int sum = 0;
        for (int i = 0; i < N; i++) {
            result[i] = i;
            sum += i;
        }
        result[N-1] = -sum;
        return result;
    }
}
