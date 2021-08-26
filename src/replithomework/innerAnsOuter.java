package replithomework;

import java.util.*;

public class innerAnsOuter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Outer");
        int[] outer = new int[scan.nextInt()];
        System.out.println("inner");
        int[] inner = new int[scan.nextInt()];

        System.out.println("outer values");
        for (int j = 0; j < outer.length; j++) {
            outer[j] = scan.nextInt();
        }
        System.out.println("inner values");
        for (int i = 0; i < inner.length; i++) {

            inner[i] = scan.nextInt();
        }
        Arrays.sort(inner);
        Arrays.sort(outer);

        int count = 0;
        for (int o = 0; o < outer.length; o++) {
            for (int in = 0; in < inner.length; in++) {
                if (outer[o] == inner[in]) {
                    count++;
                }
            }
        }
        if (count == inner.length || count == outer.length) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}

