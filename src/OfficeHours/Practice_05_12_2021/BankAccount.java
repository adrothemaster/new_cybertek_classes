package OfficeHours.Practice_05_12_2021;

public class BankAccount {

    String accountHolderName; // null by default
    int pin;
    double balance;
    long accountNumber;

    public double getBalance(int inputPin){
        if(pin == inputPin){
            return balance;
        }
        return -1;
    }


}
