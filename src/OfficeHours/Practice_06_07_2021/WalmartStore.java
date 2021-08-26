package OfficeHours.Practice_06_07_2021;


import java.util.ArrayList;

/*
Create a class WalmartStore

    -> Instance variables:
        - location (String), totalWorth (double)
        - inventory (List of Items)

    -> Static variables:
        - company name (String),

    -> Constructor:
        - Accepts and initializes location, has an empty inventory

        - Overloaded: Accepts and initializes location, also accepts an ArrayList of Items for starting inventory

    -> Instance methods:

        - calculateWorth() -> Checks inventory, totals up amount of money all the items are worth. (each times price * quantity). Stores to the totalWorth variable

        - restockInventory(List of Item) -> Adds the given items to the store inventory.
            Challenge: If the item exists in the inventory already (same item name and price)


        - toString(): returns information about Item
 */
public class WalmartStore {

    String location;
    double totalWorth;
    ArrayList<Item> inventory;
    static String companyName;

    static {
        System.out.println("static block called");
        companyName = "Walmart";
    }

    public WalmartStore(String location){
        this.location = location;
        this.inventory = new ArrayList<>();
    }

    public WalmartStore(String location, ArrayList<Item> allItems){
        this.location = location;
       // this.inventory = allItems;
        this.inventory = new ArrayList<>(allItems);
        calculateWorth();
    }

    public void calculateWorth(){
        for(Item eachItem : inventory){
            totalWorth += (eachItem.price * eachItem.quantity);
        }
    }

    public void restockInventory(ArrayList<Item> newItems) {
        ArrayList<Item> newItemsToAdd = new ArrayList<>();

        for(Item eachNewItem : newItems){
            boolean isNew = true;
            for(Item eachInventoryItem : inventory){
                if(eachNewItem.name.equals(eachInventoryItem.name) && eachNewItem.price == eachInventoryItem.price){
                    eachInventoryItem.quantity += eachNewItem.quantity;
                    isNew = false;
                    break;
                }
            }
            if(isNew) {
                newItemsToAdd.add(eachNewItem);
            }
        }

        inventory.addAll(newItemsToAdd);

        totalWorth = 0;
        calculateWorth();

    }

    @Override
    public String toString() {
        return "{" +
                "location='" + location + '\'' +
                ", totalWorth=" + totalWorth +
                ", inventory=" + inventory +
                '}';
    }
}
