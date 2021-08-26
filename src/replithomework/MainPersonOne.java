package replithomework;

import java.util.Scanner;

public class MainPersonOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        personOne person = new personOne();
        System.out.println(person.getFirstName());
        System.out.println(person.getAge());
        person.setAge(in.nextInt());
        System.out.println(person.getAge());

        personOne person2 = new personOne(in.next(), in.next(), in.nextInt());
        System.out.println(person2.getLastName());
        System.out.println(person2.toString());

    }
}
