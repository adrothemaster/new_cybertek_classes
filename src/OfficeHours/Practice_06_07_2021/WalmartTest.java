package OfficeHours.Practice_06_07_2021;

import java.util.ArrayList;
import java.util.Arrays;

public class WalmartTest {

    public static void main(String[] args) {
        WalmartStore storeOne = new WalmartStore("VA");
        System.out.println(storeOne);

        Item pen = new Item("pen", 1.4, 10);
        Item hat = new Item("hat", 4.5, 20);
        ArrayList<Item> allItems = new ArrayList<>();
        allItems.add(pen);
        allItems.add(hat);

        WalmartStore storeTwo = new WalmartStore("IL", allItems);
        System.out.println(storeTwo);

        System.out.println(WalmartStore.companyName);

        // New code for restock method
        System.out.println();

        Item [] itemsForThird = {
                new Item("marker", 2.1, 10),
                new Item("charger", 1.5, 15),
                new Item("paper", 2.3, 30)
        };

        ArrayList<Item> forStoreThree = new ArrayList<>(Arrays.asList(itemsForThird));

        WalmartStore storeThree= new WalmartStore("NY", forStoreThree);
        System.out.println(storeThree);

        Item [] itemsForRestock = {
                new Item("marker", 2.1, 10),
                new Item("juice", 1.0, 24)
        };
        ArrayList<Item> restock = new ArrayList<>(Arrays.asList(itemsForRestock));
        storeThree.restockInventory(restock);

        System.out.println("After restock:");
        System.out.println(storeThree);
    }
}
