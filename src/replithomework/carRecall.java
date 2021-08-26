package replithomework;

import java.util.*;

class carRecall {
    public static void main(String[] args) {
        //DO NOT CHANGE:
        Scanner input = new Scanner(System.in);
        System.out.println("Enter vehicle's year:");
        int vehicleYear = input.nextInt();
//1995,1998,2001,2002,2004,2006,2015,2017
        //WRITE YOUR CODE HERE:
        if (vehicleYear == 1995 || vehicleYear == 1998 || vehicleYear == 2001 || vehicleYear == 2002 || vehicleYear == 2004 ||
                vehicleYear == 2006 || vehicleYear == 2015 || vehicleYear == 2017) {
            System.out.println("Your vehicle needs to be recalled!");

        }else{
            System.out.println("Your vehicle is fine, enjoy!");
        }
    }
}
