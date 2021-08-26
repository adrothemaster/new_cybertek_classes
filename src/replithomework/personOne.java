package replithomework;

public class personOne {
    /*
    Person class has following attributes:
    private String instance variables: firstName, lastName
    private int instance variable: age
Methods:
    getter and setter methods for each instance variable. try to use `this keyword
    toString method. No parameters and returns person info in this format: firstName | lastName | age
        Note: does not print! no println in the method!
Constructors:
1) No-Args constructor
    sets default values for the Person object
        name and lastName => "undefined" age => -1
2) 3-Args Constructor:
    accepts firstName, lastName, age parameters and assigns values to encapsulated instance variable

Person person = new Person("Fatima", "Lee", 22);
System.out.println(person.getFirstName()); //"Fatima"
System.out.println(person.getLastName());  //"Lee"
System.out.println(person.getAge());       // 22
System.out.println(person.toString());     //"Fatima | Lee | 22"

Person person = new Person();
System.out.println(person.getFirstName()); //"undefined"
System.out.println(person.getLastName());  //"undefined"
System.out.println(person.getAge());       // -1
System.out.println(person.toString());     //"undefined | undefined | -1"
person.setFirstName("John");
person.setLastName("Doe");
person.setAge(44);
System.out.println(person.toString() ); // "John | Doe | 44"
     */

    private String FirstName;
    private String LastName;
    private int Age;

    public  personOne(){
        FirstName = "undefined";
        LastName = "undefined";
        Age = -1;
    }

    public personOne(String firstName, String lastName, int age) {
        FirstName = firstName;
        LastName = lastName;
        Age = age;
    }

    public void setFirstName(String firstName){
        this.FirstName = firstName;
    }
    public String getFirstName(){
        return FirstName;
    }

    public void setLastName(String lastName){
        this.LastName = lastName;
    }
    public String getLastName(){
        return LastName;
    }

    public void setAge(int age){
        this.Age = age;
    }
    public int getAge(){
        return Age;
    }

    @Override
    public String toString(){
        return FirstName + " | " + LastName + " | " + Age;
    }

}
