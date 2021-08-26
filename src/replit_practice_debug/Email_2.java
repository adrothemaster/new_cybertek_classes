package replit_practice_debug;

import java.util.Scanner;

    public class Email_2 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String email = scan.next();
            String firstName, lastName, domain;
            int underScoreIndex, atSignIndex, dotIndex;

            underScoreIndex = email.indexOf("_");
            atSignIndex = email.indexOf("@");
            dotIndex = email.indexOf(".");

            firstName = email.substring(0, underScoreIndex);
            lastName = email.substring(underScoreIndex+1, atSignIndex);
            domain = email.substring(atSignIndex +1, dotIndex);
            //char firstName1 = firstName.toUpperCase().charAt(0);
            //char lastName1 = lastName.toUpperCase().charAt(0);

            String output = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
            String output2 = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);

            System.out.println("First name: " + output);
            System.out.println("Last name: " + output2);
            System.out.println("Domain: " + domain);

        }
    }
