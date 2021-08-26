package replithomework;

import java.util.Arrays;
import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[8];
        for (int i=0;i<8;i++)
        {
            arr[i] = input.nextLine();
        }

        // DO NOT TOUCH ABOVE


        for (int i = 0; i < arr.length; i=i+2){
            System.out.println(arr[i] + " , " + arr[i+1]);

        }
    }
}
//i
//love
//you
//very
//much
//so
//much
//pain