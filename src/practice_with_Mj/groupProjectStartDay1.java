package practice_with_Mj;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.List;

public class groupProjectStartDay1 {
    // LOOPS

    public static void main(String[] args) {
        WhileLoop();
        DoWhileLoop();
        forLoop();
        forEachLoop();
        List<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(4);
        nums.add(7);
        eachLoop(nums);
        controlStatements();

    }

    //1. while loop
    public static void WhileLoop() {
        int apples = 6;
        while (apples > 0) {
            apples--;
            System.out.println("Eat the apple " + " " + apples);


        }
        System.out.println("No more apples");
        System.out.println("-------------------------------------");
        System.out.println();
    }

    //2. do while
    public static String DoWhileLoop() {
        int apple1 = 10;
        do {
            System.out.println("runs first " + " " + apple1);
            apple1--;

        } while (apple1 >= 5);
        return "string";
    }

    //3. for loop
    public static void forLoop() {

        int apples3 = 10;

        // i=0=> initialization  i<10=> condition  i--/i++ updates
        for (int i = 0; i < 10; i--) ;
        apples3--;
        System.out.println("Eat the apple" + " " + apples3);
    }

    //4. for each loop
    public static void forEachLoop() {
        int[] arr = {1, 23};
        List<Integer> nums = new ArrayList<>();
        nums.add(25);
        nums.add(78);

        for (int each : nums) {
            System.out.println(nums);
        }
    }

    public static void eachLoop(List<Integer> data) {
        for (int each : data) {
            System.out.println(data + " ");
        }
    }

/** 1. Loop control statements
 *  2. nested loops
 *  3. switch statements
 *  4. ternary
 *  5. add if statements
 *   END OF DAY ONE...
 */

//=========================================================================

    /**
     * Day 2 start
     */
    public static void controlStatements() {
        //break example

        int i = 0;
        while (true) {
            if (i == 15) {
                i++;
                //break;
            for (int j=0; j < 10 ; j++)   {
                    if (j % 2 == 0) {
                          continue;
                    }
                System.out.println(j);
                }
            }
            System.out.println(i);
        }
    }
}

