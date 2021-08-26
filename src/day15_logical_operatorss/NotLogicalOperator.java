package day15_logical_operatorss;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("!true = " + (!true));
        System.out.println("!false = " + (!false));

        int age = 20;
        //check if age IS NOT more than 7. print "Need to sit in child car seat. age

        if (!(age > 7)) {
            System.out.println("Need to sit in child car seat. age = " + age);
        } else {
            System.out.println("Can sit normal seat. age = " + age);
        }

        boolean isSmokingAllowed = true; //yes-> true no-> false
        //if smoking is not allowed: print "Smoking is not allowed here. Exit."
        if (!isSmokingAllowed) {
            System.out.println("Smoking is not allowed here. Exit");
        } else {
            System.out.println("This area is for smoking");
        }

        boolean isAffordable = false;
        //if its NOT affordable then print "Item Not affordable"
        if (!isAffordable) {
            System.out.println("Item is Not affordable");
        }

        String env = "qa";
        if (!env.equals("qa")) {
            System.out.println("In wrong environment for QA testing");
        }

        String carModel = "Tesla";
        //if its not Tesla, print "Not interested"
        if(!carModel.equals("Tesla")) {
            System.out.println("Not interested, thank you");
        }

        String secretPassword = "abc123";
        String inputPassword = "abc321";
        //if inputPassword IS NOT equals secretPassword: print "Incorrect Password"
        if (!inputPassword.equals("abc123")) {
            System.out.println("Incorrect password");
        }

        if (!inputPassword.equals(secretPassword)) {
            System.out.println("Incorrect password");
        }

        if (inputPassword.equals("abc123")) {
            System.out.println("Correct password");
        } else {
            System.out.println("In correct password");
        }

    }
}
