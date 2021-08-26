package replithomework;
import java.util.Arrays;
import  java.util.Scanner;
public class CountApprence {
    public static int countAppearance(String[] arr,String t) {


        //array = ["a","foo","bar","foo","bla"]
        //string = "foo"
        //
        //countAppearance(array , string ) -> 2
        int count = 0;
        while (Arrays.toString(arr).contains(t)) {
            System.out.println(arr.toString());
            count++;
        }
        return count;
    }//end  count_appearance

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String [] strs = new String[in.nextInt()];
        String word = in.next();
        for(int i=0; i < strs.length; i++) {
            strs[i] = in.next();
        }

        System.out.println(countAppearance(strs,word));

    }

}
