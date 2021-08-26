package GroupPracticeMeeting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class inheritanceOOP extends Animal{
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.typeOfAnimal);
        animal.makeSound();
        System.out.println(BigListDemo.animals);
        DoingSmthg doingSmthg = new DoingSmthg();




    }

}

class Animal extends BigListDemo {
    protected String typeOfAnimal = "dog";
    public void makeSound(){
        System.out.println("makes sounds");

    }
}

class BigListDemo extends DoingSmthg{
    static int list;
    static List<String> animals;
    static {
        System.out.println("put things here");
        animals = new ArrayList<>();
        animals.addAll(Arrays.asList(
                "dog"  ,
                "cat" ,
                "horse" ,
                "elephant" ,
                "lion"  ,
                "fish"));
    }
}

class DoingSmthg{
    public static void run(){
        System.out.println("running");
    }
}