package OfficeHoursMyExamples.May3rd;

import java.util.ArrayList;
import java.util.Arrays;

public class HidePassword {
    public static void main(String[] args) {

        String [] password = {"one", "apple", "hold"};
        System.out.println("Arrays.toString(password) = " + Arrays.toString(password));
        ArrayList<String> answer = new ArrayList<>();





        for (int i = 0; i < password.length; i++) {

            int temp = password[i].length();
            String hidder = "";

            for (int j = 0; j < temp; j++) {
                hidder += "*";

            }
            answer.add(hidder);
        }
        System.out.println("answer = " + answer);

    }
}
