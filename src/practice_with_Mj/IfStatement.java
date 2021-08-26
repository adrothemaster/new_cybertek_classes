package practice_with_Mj;

public class IfStatement {
    public static void main(String[] args) {

        if (9>2){
            System.out.println("control flow rocks");
        }
        int apples = 10;
        int oranges = 5;

        if (apples > oranges) {
            System.out.println("i have more apples");
        }
        String userName = "abc";
        String inputUserName = "abc";

        if(userName.equals("abc")) {
            System.out.println("access granted");
            System.out.println("welcome");
        }

        int books = 5;
        if (books < 10) {
            books += 10;
        }
        System.out.println(books);

        boolean hot = true;

        if (hot == true) {
            System.out.println("can i have some ice");
        }

        int age = 100;
        if (age >=18) {
            System.out.println("adult");
        }


    }
}
