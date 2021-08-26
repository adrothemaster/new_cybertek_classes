package replit_practice_debug;

import java.util.Scanner;

public class EqualsJavaPython {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        int charCount = sentence.length();
        int tCharCount = 4;
        int javaCount=0, pythonCount=0;

        for (int i =0; i <= charCount-tCharCount; i++){
            if(sentence.substring(i,i+tCharCount).equals("java")){
                javaCount++;
            }
        }
        tCharCount = 6;
        for (int i =0; i <= charCount-tCharCount; i++){
            if(sentence.substring(i,i+tCharCount).equals("python")){
                pythonCount++;
            }
        }
        System.out.println(javaCount == pythonCount);
    }
}