package day05_primitives_concatanation;

public class JobInfo {
    public static void main(String[] args){
        String title = "Java SDET";
        String company = "Palo Alto Networks";
        String jobDescription = "Experience in Java, Selenium, Cucumber, Tomato, JUnit";
        double salary = 123000.0;
        byte yearsOfExp = 3;
        boolean hasBenefits = true;

        System.out.println("Title: " + title);
        System.out.println("Company: " + company);
        System.out.println("Job description: " + jobDescription);
        System.out.println("Salary: $" + salary);
        System.out.println("Years of experience: " + yearsOfExp);
        System.out.println("Has benefits? " + hasBenefits);
    }
}
