package replithomework;

public class CapitolOne extends CreditCard {

    public CapitolOne(long cardNumber, double balance){
        super(cardNumber,balance);

        CreditCard.apr = 14.35;
        CreditCard.isCashback = false;
    }

    @Override
    public void useCard() {

        System.out.println("Using Capital One card");
    }

    @Override
    public void payBalance(double balance) {

        System.out.println("Paying "+ balance + " from " + CreditCard.balance);
    }

    @Override
    public String toString() {
        return "Capital One credit card | card number: " + cardNumber +" | balance used: " +balance +
                " | APR: "+  apr + " | has cashback: " +  isCashback;
    }
}
