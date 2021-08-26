package SiamsExamples1_1;

public class Employee {
    public static void main(String[] args) {
        String firstName = "James",lastName = "Bond", companyName = "Tesla", startMonth = "January", jobTitle = "SDET",
                officeAddress = "100 S LaneHampton, VA 13312";
        double salary = 100000;
        byte startDay = 4;
        short startYear = 2021;
        boolean isFullTime = true;

        // Use previous variables together

        String fullName = firstName + " " + lastName;
        String fullStartDate = startMonth + " " + startDay + "," + startYear;
        String email = firstName + startDay + "@" + companyName + ".com";
        double salaryAfter3years = salary + (startDay * 1000);


        System.out.println("\t***** " + companyName +  " New Hire Information *****");
        System.out.println(firstName + " welcome to " + companyName);
        System.out.println("Your start date as a " + jobTitle + " will be on " + fullStartDate);
        System.out.println("You are fulltime: " + isFullTime + " and will he making " + salary + " per year");
        System.out.println("The office is located at: \n" + officeAddress);
        System.out.println("\n\tOfficial information:");
        System.out.println("New hire name: " + fullName);
        System.out.println("Starts on: " + fullStartDate);
        System.out.println("Email generated: " + email);
        System.out.println("Your expected salary after 3 years: " + salaryAfter3years);

    }

}

