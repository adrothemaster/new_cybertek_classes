package day38_methods;
/**
 * import all static methods. so that you can just call by method name, without classname
 */

public class StringUtilTest {
    public static void main(String[] args) {
        String userName = "";
        if(StringUtils.isNullOrEmpty(userName)) {
            System.out.println("FAIL: Username cannot be null or empty");
        }

        System.out.println("isPalinrome(civic) = " + StringUtils.isPalindrome("civic"));
        System.out.println("isPalindrome(kayak) = " + StringUtils.isPalindrome("kayak"));
        System.out.println("isPalindrome(Cybertek) = " + StringUtils.isPalindrome("Cybertek"));

        String word = "sunday";
        String revWord = StringUtils.reverse(word);
        System.out.println("word = " + word);
        System.out.println("revWord = " + revWord);
        System.out.println(StringUtils.reverse(word));
    }
}
