package day47_constructors;

public class Student {
    private String name;
    private int age;
//    //No_args constructor
    public Student() {
        System.out.println("No-Args constructor");
    }

    //constructor overloading with 1 param: String name
    public Student(String name) {
        System.out.println("name param constructor | name = " + name);
    }

    //constructor with age
    public Student(int age) {
        System.out.println("age param constructor | age = " + age);
    }
    //constructor with name and age
    public Student(String name, int age) {
        System.out.println("name&age param constructor | " + name +"-"+age);
    }


}
