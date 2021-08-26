package day23_string_manipulation_while_loop;

public class ChainingStringMethods {
    public static void main(String[] args) {
        String word = " woo den sp oon ";

        System.out.println(word.toUpperCase().toLowerCase().length());

        //remove spaces first then print everything uppercase
        System.out.println(word.replace(" ","").toUpperCase());

       // selenium.findElement(By.id("hi")).click();

        String city = "kAbUl";
                            //read 1st letter.makeUcase     +  read 2nd till last.make lowercase
        System.out.println(city.substring(0,1).toUpperCase() + city.substring(1).toLowerCase());
        String capitalized = city.substring(0,1).toUpperCase() + city.substring(1).toLowerCase();
        System.out.println("capitalized = " + capitalized);

        //.isEmpty().toUpperCase() Does not work since isEmpty is boolean
    }
}
