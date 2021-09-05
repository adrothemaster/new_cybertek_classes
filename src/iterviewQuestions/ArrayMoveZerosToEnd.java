package iterviewQuestions;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayMoveZerosToEnd {
    public static void main(String[] args) {
        int [] list = {0,1,2,0,3,4,0,5,0,6,0,7,0,8,9,0,10};
        System.out.println("MoveZeros(list) = " + Arrays.toString(MoveZeros(list)));

    }
    public static int[] MoveZeros(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int countZero = 0;
        for (int each: arr){
            list.add(each);
            countZero+=(each == 0)?1:0;
        }
        list.removeAll(Arrays.asList(0));
        arr = new int[arr.length];
        for (int i = 0; i < arr.length-countZero; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
