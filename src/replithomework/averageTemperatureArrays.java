package replithomework;

import java.util.Scanner;

public class averageTemperatureArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] temps = {scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble()};

        // Do not touch above. Use array temps
        double count = 0.0;
        for (int i = 0; i < temps.length; i++) {
            count += temps[i];

        }
        double average = count / temps.length;
        System.out.println(average);

    }
}
