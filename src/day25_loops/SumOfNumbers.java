package day25_loops;

public class SumOfNumbers {
    public static void main(String[] args) {
        int sum = 0;
        //0 + 1 + 2 + 3 + 4 + 5
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            sum += i; // sum = sum + i;
        }

        System.out.println("sum = " + sum);
        
        int sum2 = 0;
        sum2 += 1;
        sum2 += 2;
        sum2 += 3;
        sum2 += 4;
        sum2 += 5;
        sum2 += 6;
        sum2 += 7;
        sum2 += 8;
        sum2 += 9;
        sum2 += 10;
        System.out.println("sum2 = " + sum2);
        
    }
}
