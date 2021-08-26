package practice_04_12_2021;

public class MinAndMaxFromArray {
    public static void main(String[] args) {

        int [] arr = {3,1,5,5,7,9,1,6,3,1};
        int min = arr[0];
        int max = arr[0];

        for (int each:arr) {


            if (each < min) {
                min = each;
            }

            if(each > max) {
                max = each;
            }
        }
        System.out.println(" min = " + min + " max = " + max);



    }
}
