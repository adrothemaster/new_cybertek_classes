package replithomework;

import java.util.*;

class zombieAttack2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //TODO. Write you code below this line.
        //3, 6, 0, 4, 3, 2, 7, 0
        //3, 3, 0, 2, 3, 2, 4, 0
        //3, 1, 0, 1, 3, 2, 2, 0
        //3, 0, 0, 0, 3, 2, 1, 0
        //1, 0, 0, 0, 1, 2, 0, 0
        //0, 0, 0, 0, 0, 1, 0, 0
        //0, 0, 0, 0, 0, 0, 0, 0

        int[] zeroArray = new int[inhabitants.length];
        int day = 1;
        System.out.println("Day 0 " + Arrays.toString(inhabitants));
        while (!(Arrays.toString(inhabitants).equals(Arrays.toString(zeroArray)))) {

            for (int i = 0; i<inhabitants.length; i++){
                if (i == 0 && inhabitants[i] ==0 ){
                    inhabitants[i+1] /= 2;
                    if (inhabitants[i+1] ==0) {

                    }

                }
                else if (i == inhabitants.length -1 && inhabitants[i] == 0){
                    inhabitants[i-1] /= 2;


                }else if (inhabitants[i] ==0){
                    inhabitants[i-1] /= 2;
                    inhabitants[i+1] /= 2;
                }
            }
            System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
            day++;
        }
        System.out.println("---- EXTINCT ----");
    }
}
