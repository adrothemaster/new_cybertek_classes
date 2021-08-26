package SiamsExamples1_1;

/**
 * create a class named Apartment
 * create a main method
 *
 *     Create the variables with the most appropriate datatype:
 *
 *         - address, name of owner, number of units, average size of each unit, monthly rent amount, number of washers and driers,
 *         allows pets or not, has a pool, length of lease, total number of residents in building, phone number of owner, is near a gas station,
 *         number of floors, has a basement, has available units for rent, has air conditioning, number of parking spaces, has wheel chair access,
 *         number of review stars (out of 5)
 *
 *         - Create these variables and use previous variables to get the values
 *
 *             - monthly rent after 3 years (discount 10% off original rent)
 *             - monthly rent after 6 years (discount 20% off original rent)
 *             - Average number of residents per unit (total residents / number of units)
 *             - Average number of parking spots per unit ( parking spots / units)
 *             - Average number of units per floor ( units / number of floors)
 */
public class Apartment {
    public static void main(String[] args) {
        String owner = "kevin Carmichael", address = "2107 w argyle st, apt 107\n Chicago, IL, 60625", lengthOfLease = "1 year", ownerPhone = "321-186-6858";
                int numberOfUnits = 6, numberOfWashers = 4, numberOfFloors = 2, parkingSpots = 32;
                double sizeOfUnits = 1.545, numberOfStars = 4.3, rent = 1999.99,residentsInBuilding = 23;
                boolean allowsPets = true, hasPool = false, nearGasStation = true, hasBasement = true, aC = true,hasWheelChair = false;
                double budget1 = 2000;
                double price = 1850;

                if (price < budget1 ){
                    System.out.println(" owner:" + owner + "\n phone number " + ownerPhone+ "location of unit\n " + address + "\n term of stay: " + lengthOfLease + "\n has pool: " + hasPool + "\n has basement: " + hasBasement + "\n wheel chair accesable: " + hasWheelChair + "/n number of floors: " + numberOfFloors );
                }

    }
}
