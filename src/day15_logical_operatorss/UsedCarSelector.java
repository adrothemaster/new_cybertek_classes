package day15_logical_operatorss;

/**
 * 1 - needs to be within budget
 * 	AND
 * 2 - needs to be "Toyota" OR "Honda" OR "Tesla"
 */
public class UsedCarSelector {
    public static void main(String[] args) {
        double budget = 5000.0;
        String model = "Honda";
        double carPrice = 8999.0;

        if (carPrice <= budget && (model.equals("Toyota") || model.equals("Honda"))) {
            System.out.println("Ready to purchase model = " + model + ", price = " + carPrice);
        } else {
            System.out.println("Not interested in model = " + model + ", price = " + carPrice);
        }
    }
}
