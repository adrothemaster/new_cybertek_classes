package OfficeHours.Practice_04_13_2021;

public class Gradebook {
    /*
    Declare three arrays:
1. String array which will hold names for the students (give values)
2. Int array which has the score of the student got in the quiz (give values)
3. Char array which will have some letter grade based on the score (empty)
4. Output the gradebook at the end with all the information
Grade scale: Above 85: A Above 75: B Above 65: C Other: D
     */

    public static void main(String[] args) {

        String [] names = {"Anna", "Nancy", "Sarah"};
        int [] scores = {90, 75, 80};
        char [] grades = new char[names.length];

        for(int i=0; i < scores.length; i++){
            int eachScore = scores[i];

            if(eachScore >= 85) {
                grades[i] = 'A';
            } else if(eachScore >= 75){
                grades[i] = 'B';
            } else if(eachScore >= 65){
                grades[i] = 'C';
            } else {
                grades[i] = 'D';
            }

            System.out.println(names[i] + " | " + scores[i] + " | " + grades[i]);
        }

//        System.out.println("GRADEBOOK");
//
//        for(int i=0; i < names.length; i++) {
//            System.out.println(names[i] + " | " + scores[i] + " | " + grades[i]);
//        }


    }
}
