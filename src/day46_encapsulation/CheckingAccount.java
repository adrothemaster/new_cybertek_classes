package day46_encapsulation;

public class CheckingAccount {
    private double balance;
    private long accountNumber;
    private String accountHolder;
    private String type = "checking"; //default is checking, we can change if needed using setter

    /**
     * public void setAccountInfo(long accountNumber,String accountHolder, double balance,String type)
     * 1) this.accountNumber = accountNumber;
     * 2) setAccountNumber(accountNumber);
     */

    //right click > generate > Getter and Setter > Select all(shift+click last one) > Ok
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "balance=" + balance +
                ", accountNumber=" + accountNumber +
                ", accountHolder='" + accountHolder + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
