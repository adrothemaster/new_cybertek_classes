package replithomework;

import java.util.ArrayList;

public class multiDArrayToSingle {
    public static void main(String[] args) {


        /**
         * String [][] arr={["a", "b", "c"],["d", "e", "f"]};
         *
         * Print out as ["a", "b", "c", "d", "e", "f"]
         */
        String[][] arr = {{"a", "b", "c"},{"d", "e", "f"}};

        ArrayList<String> arr2 = new ArrayList<>();

        //arr[0][0]
        //arr[0][1]
        //arr[0][2]
        //arr[1][0]
        //arr[1][1]
        //arr[1][2]


        for (int i = 0; i < 2; i++) {
            //System.out.println("arr = " + arr[i][i]);
            for (int j = 0; j < 3; j++) {
                arr2.add(arr[i][j]);

            }
        }
        System.out.println("arr2 = " + arr2);
    }
}
