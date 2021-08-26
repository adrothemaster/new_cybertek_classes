package replithomework;

public class Chase extends CreditCard {

    public Chase(long cardNumber, double balance){
        super(cardNumber,balance);

        CreditCard.apr = 10.99;
        CreditCard.isCashback = true;
    }

    @Override
    public void useCard() {

        System.out.println("Using Chase card");
    }

    @Override
    public void payBalance(double balance) {

        System.out.println("Paying "+ balance + " from " + CreditCard.balance);
    }

    @Override
    public String toString() {
        return "Chase credit card | card number: " + cardNumber +" | balance used: " +balance +
                " | APR: "+  apr + " | has cashback: " +  isCashback;
    }


}
