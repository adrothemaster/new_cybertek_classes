package replithomework;
import java.util.*;
public class ZombieAttack1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};



        int[] zeroArray = new int[inhabitants.length];
        int day = 0;
        while (!(Arrays.toString(inhabitants).equals(Arrays.toString(zeroArray)))) {

            for (int i = 0; i<inhabitants.length; i++){

                inhabitants[i] /=2;

            }
            System.out.println("day " + day + " " + Arrays.toString(inhabitants));
            day++;
        }
    }
}
