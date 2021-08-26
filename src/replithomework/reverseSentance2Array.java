package replithomework;

import java.util.Scanner;

public class reverseSentance2Array {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //sentence -> Java is fun
        //reversed > fun is Java

        //TODO: start your code here
        String temp = "";
        String [] sent = sentence.split(" ");
        for(int i = sent.length-1; i>=0; i--){
            temp += " " + sent[i];
        }
        System.out.println(temp);



    }
}

