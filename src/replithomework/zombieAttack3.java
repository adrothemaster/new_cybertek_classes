package replithomework;

import java.util.*;

public class zombieAttack3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] inhabitants = {3, 6, 0, 4, 3, 2, 7, 0};

        int day = 0; // start day
        int[] zeroArray = new int[inhabitants.length]; // to compare with my original array

        int countZero = 0;
        while (countZero != inhabitants.length) { // if there are 8 zero means time to stop

            countZero = 0; // reset the Zero counter after each loop to count again

            System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
            day++;

            for (int i = 1; i < inhabitants.length; i++) { // first loop we just attack right to the left

                if (inhabitants[i] == 0) {
                    // inhabitants become half
                    inhabitants[i - 1] /= 2;
                }
            }
            for (int i = inhabitants.length - 2; i >= 0; i--) { // now we attack left to right

                if (inhabitants[i] == 0) {
                    // inhabitants become half
                    inhabitants[i + 1] /= 2;
                    countZero++; // count hoe many 0 do we have in array
                }
            }
            if (inhabitants[inhabitants.length - 1] == 0) {
                // since we didnt count last index
                // if the last index is also zero we should count it

                countZero++;
            }
        }
        System.out.println("---- EXTINCT ----");
    }
}

//Day 1 [3, 3, 0, 2, 3, 2, 3, 0]
//Day 2 [3, 1, 0, 1, 3, 2, 1, 0]


// -->  -->-->-->-->-->-->-->--> // attack to i-1
//Day 3 [3, 0, 0, 0, 3, 2, 0, 0]
// <--<--<--<--<--<--<--<--<--<- // attack to i+1


// Day 3 [1, 0, 0, 0, 1, 1, 0, 0]

//   for (int i = 1; i < inhabitants.length; i++) { // first loop we just attack left to right
//
//                if (inhabitants[i] == 0) {
//                    // inhabitants become half
//                    inhabitants[i - 1] /= 2;
//                }
//            }

// i== 6
// i== 5
// i== 4
// i== 3
// i== 2
// i== 1
// i== 0

// for (int i = inhabitants.length - 2; i >= 0; i--) { // now we attack right to left
//
//                if (inhabitants[i] == 0) {
//                    // inhabitants become half
//                    inhabitants[i + 1] /= 2;
//                    countZero++; // count hoe many 0 do we have in array
//                }
//            }
