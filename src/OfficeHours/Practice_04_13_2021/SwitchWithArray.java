package OfficeHours.Practice_04_13_2021;

public class SwitchWithArray {
    public static void main(String[] args) {

        int [] arr = {3,1,2};

        for(int each : arr){

            switch (each){
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
            }

        }

    }
}
