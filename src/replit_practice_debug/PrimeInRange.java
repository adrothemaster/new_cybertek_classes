package replit_practice_debug;

public class PrimeInRange {
    public static void main(String[] args) {

        int number = 50;


        for (int j = 2; j <= number; j++){
            boolean isPrime = true;
            for (int i = 2; i < j/2; i++){

                if (j % i == 0) {
                    isPrime = false;
                    break;

                }
            }
            if (isPrime) {
                System.out.print(j + " ");
            }
        }
    }
}
