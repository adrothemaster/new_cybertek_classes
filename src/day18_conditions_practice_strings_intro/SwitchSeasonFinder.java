package day18_conditions_practice_strings_intro;
/**
 * Winter: 12,1,2
 * Spring: 3,4,5
 * Summer: 6,7,8
 * Fall:   9,10,11
 */
public class SwitchSeasonFinder {
    public static void main(String[] args) {
        int month = 15;
        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Winter");
        }else if (month == 3 || month == 4 || month == 5) {
            System.out.println("Spring");
        }

        switch(month) {
            case 12:
                System.out.println("Winter");
                break;
            case 1:
                System.out.println("Winter");
                break;
            case 2:
                System.out.println("Winter");
                break;
        }
        //OR LOGIC WITH SWITCH
        switch(month) {
            case 12: case 1: case 2:
                System.out.println("Winter");
                break;
            case 3: case 4: case 5:
                System.out.println("Spring");
                break;
            case 6: case 7: case 8:
                System.out.println("Summer");
                break;
            case 9: case 10: case 11:
                System.out.println("Fall");
                break;
            default:
                System.out.println("invalid month - " + month);
                break;
        }
    }
}
