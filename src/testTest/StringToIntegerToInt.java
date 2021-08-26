package testTest;

public class StringToIntegerToInt {
    public static void main(String[] args) {
        String s = "102";

        Integer.parseInt(s);

        System.out.println(Integer.parseInt(s) +4);

        int n = 8;

        System.out.println(Integer.toString(n) + 8);

        String str = "age: 47";
        str = str.replaceAll("\\D+","");

        int i = Integer.parseInt(str);

        System.out.println(i + 2);


    }
}
