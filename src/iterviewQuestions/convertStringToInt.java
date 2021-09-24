package iterviewQuestions;

public class convertStringToInt {
    public static void main(String[] args) {

        String str = "java";
        char[] str1 = str.toCharArray();

        for (Character each : str1) {
            int value = each;
            System.out.print(value + ",");

        }
    }
}
