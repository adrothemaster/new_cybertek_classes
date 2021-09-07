package day54_abstraction;

public class Pizza extends MenuItem {

    @Override
    public void order() {
        System.out.println("ordering pizza");
    }

    @Override
    public void prepare() {
        System.out.println("Stretch the dough and put toppings and cheese and bake it");
    }

    @Override
    public void serve() {
        System.out.println("serve in plate or in a box");
    }
}
