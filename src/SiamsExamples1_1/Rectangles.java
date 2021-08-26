package SiamsExamples1_1;

import java.util.*;
public class Rectangles {
        public static void main(String[] args) {
            System.out.println("input diameter length and width");
            // Hard coded values
//        double length = 5;
//        double width = 3;

            // dynamic with Scanner
            Scanner input = new Scanner(System.in);
            double length = input.nextDouble();
            double width = input.nextDouble();

            double perimeter = 2 * (length + width);
            double area = length * width;

            System.out.println("perimeter = " + perimeter);
            System.out.println("area = " + area);
        }

    }

