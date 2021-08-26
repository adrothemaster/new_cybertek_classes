package OfficeHours.Practice_06_01_2021;

/*
- create a class called ScrumTeam

               Attributes:
                            PO, BA, SM,
                            ArrayList<Tester> testersList = new ArrayList<>(),
                            ArrayList<Developer> devopsList = new ArrayList<>(),
                            sprintNumber

                Constructor:
                      sets the names of: PO, BA, SM

                Actions:

                   addTester(Tester tester): adds the given tester to the testers arraylist

                   addTesters(Tester[] testers): adds the given testers to the testers arraylist

                   addDeveloper(Developer developer): adds the given developer to the developers arraylist

                   addDevelopers(Developer[] developers): adds the given developers to the developers arraylist

                   removeTester(long employeeID): removes the given tester from the testers arraylist

                   removeDeveloper(long employeeID): removes the developer from the developers arraylist

                   toString(): prints number of tester,& developers,  PO name, SM name, BA name
 */


import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    String productOwner;
    String scrumMaster;
    String businessAnalyst;
    ArrayList<Tester> allTesters;
    ArrayList<Developer> allDevelopers;
    int sprintNumber;

    public ScrumTeam(String productOwner, String scrumMaster, String businessAnalyst) {
        this.productOwner = productOwner;
        this.scrumMaster = scrumMaster;
        this.businessAnalyst = businessAnalyst;
        this.allTesters = new ArrayList<>();
        this.allDevelopers = new ArrayList<>();
    }

    public void addTester(Tester tester){
        this.allTesters.add(tester);
    }
    public void addTester(Tester ... testers){ // Tester [] testers
        this.allTesters.addAll(Arrays.asList(testers));
    }

    public void addDeveloper(Developer developer){
        this.allDevelopers.add(developer);
    }
    public void addDeveloper(Developer ... developer){
        this.allDevelopers.addAll(Arrays.asList(developer));
    }

    public boolean removeTester(int employeeId ){

        for(int i=0; i < allTesters.size(); i++){

            if(allTesters.get(i).getEmployeeID() == employeeId){ // Tester -> 11 == 12
                allTesters.remove(i);
                return true;
            }

        }
        return false;
    }

    public boolean removeDeveloper (int employeeId){
        int size = allDevelopers.size();
       allDevelopers.removeIf(eachDev -> eachDev.getEmployeeId() == employeeId);
       return size != allDevelopers.size();
    }

    @Override
    public String toString() {
        return "ScrumTeam{" +
                "productOwner='" + productOwner + '\'' +
                ", scrumMaster='" + scrumMaster + '\'' +
                ", businessAnalyst='" + businessAnalyst + '\'' +
                ", allTesters=" + allTesters +
                ", allDevelopers=" + allDevelopers +
                ", sprintNumber=" + sprintNumber +
                '}';
    }

    //    public static void main(String[] args) {
//        ScrumTeam scrumTeam = new ScrumTeam("Ziba", "John", "Fikret");
//        System.out.println(scrumTeam.allTesters);
//        Tester tester1 = new Tester("Maxim", 10, "SDET", 1000000);
//        scrumTeam.addTester(tester1);
//        scrumTeam.addTester(new Tester("Anna", 11, "SDET", 10000000));
//        System.out.println(scrumTeam.allTesters);
//
//        scrumTeam.addDeveloper(new Developer("Anton", 1, "dev", 10000000));
//        System.out.println(scrumTeam.allDevelopers);
//
//    }


}
