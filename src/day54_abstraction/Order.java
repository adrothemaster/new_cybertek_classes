package day54_abstraction;

public class Order {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        pizza.order();
        pizza.prepare();
        pizza.serve();

        Salad salad = new Salad();
        salad.order();
        salad.prepare();
        salad.serve();
    }
}
