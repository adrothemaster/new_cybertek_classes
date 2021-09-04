package testTest;

public class  reverseWithStringBuilder {
    public static void main(String[] args) {

        String word = "hello mister";
        StringBuilder word1 = new StringBuilder();
        word1.append(word);
        word1.reverse();
        System.out.println(word1);
    }
}
