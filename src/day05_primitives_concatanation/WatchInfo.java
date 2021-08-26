package day05_primitives_concatanation;

public class WatchInfo {
    public static void main(String[] args) {
        String brand = "Chopard";
        String color = "Gold";
        double price = 4600.0;
        boolean waterResistant = true;
        boolean isSmart = false;
        char gender = 'F';

        System.out.println("BRAND: \t\t\t\t" + brand);
        System.out.println("COLOR: \t\t\t\t" + color);
        System.out.println("PRICE: \t\t\t\t" + "$" + price);
        System.out.println("WATER RESISTANT?: \t" + waterResistant);
        System.out.println("IS A SMART WATCH?: \t" + isSmart);
        System.out.println("GENDER: \t\t\t" + gender);

        System.out.println("Watch brand\t\t\t"+brand+"\n"+"Color\t\t\t\t"+color+"\n"+
                "Price\t\t\t\t"+price+"\n"+"Water resistant\t\t"+waterResistant+"\n"+"Is smart\t\t\t"+isSmart+"\n"+
                "Gender\t\t\t\t"+gender);
    }
}
