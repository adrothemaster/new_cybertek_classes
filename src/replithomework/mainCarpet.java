package replithomework;

import java.util.Scanner;

public class mainCarpet extends carpetOOP {
    public static  void main(String[] args) {
        Scanner in = new Scanner(System.in);
        carpetOOP c = new carpetOOP();
        System.out.println(c.totalPrice);

        carpetOOP c2 = new carpetOOP(in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextBoolean());
        System.out.println(c2.totalPrice);

    }
}