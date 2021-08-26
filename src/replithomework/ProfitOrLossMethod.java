package replithomework;

import java.util.Scanner;

public class ProfitOrLossMethod {
    public static String profits(int buyPrice, int sellPrice) {
        //your code here
        //Finish the profits method which accepts the buyPrice(int) and sellPrice(int) and determines if there was a profit or loss.
        //
        //It returns a string value that can be "profit","loss","no loss"
        //
        //Example
        //
        //profits(100,1500)
        //
        //returns: "profit"
        //profits(100,1500)
        //
        //returns: "profit"
        //profits(20,5)
        //
        //returns: "loss"
        //copied!
        //profits(20,5)
        //
        //returns: "loss"
        //profits(100,100)
        //
        //returns: "no loss"
        String result = "";
        if (buyPrice == sellPrice) {
            result= "no loss";
        } else if (sellPrice < buyPrice) {
            result = "loss";
        } else if (sellPrice > buyPrice) {
            result = "profit";
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(profits(in.nextInt(), in.nextInt()));
    }

}