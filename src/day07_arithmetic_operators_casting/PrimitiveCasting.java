package day07_arithmetic_operators_casting;

public class PrimitiveCasting {
    public static void main(String[] args) {
        int num1 = 100;
        byte b1 = (byte)num1;
        short shNum1 = (short)num1;
        long lNum1 = num1;

        System.out.println(num1);
        System.out.println(b1);
        System.out.println(shNum1);
        System.out.println(lNum1);
        //TODO: continue more practice on Casting.



        int num2 = 123;
        byte b2 = (byte) num2;
        int getNum2 = num2;
        double nums = (double) b2 + (double) getNum2;

        System.out.println(nums * 2 + getNum2 - num2);
        System.out.println((nums * 4) + getNum2 + 546 + (nums / 5 % 2));

    }
}
