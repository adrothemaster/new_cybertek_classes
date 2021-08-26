package testTest;

public class reverseStringWithBuffer {

    public static void main(String[] args) {
        String str = "Bless you";

        StringBuffer word = new StringBuffer(str);
        word.reverse();
        System.out.println(word);

    }
}
