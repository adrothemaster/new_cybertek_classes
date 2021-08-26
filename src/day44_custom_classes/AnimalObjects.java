package day44_custom_classes;

public class AnimalObjects {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.type); //some animal
        animal.eat();
        animal.eat("grass");
        animal.speak();

        //create new Animal object  - cheetahObj
        Animal cheetahObj = new Animal();
        cheetahObj.type = "cheetah"; //change value/reassign to "cheetah"
        System.out.println(cheetahObj.type);
        cheetahObj.eat("kebab");
    }
}
