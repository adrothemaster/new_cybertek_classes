package replit_practice_debug;

public class CamelCase {
    public static void main(String[] args) {

        String str = "thisHasManyWordsToFind";
        int words = 1;
        String temp = "";

        if (str.isEmpty()) {
            words = 0;
        }

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                words++;
                temp += str.charAt(i);
                System.out.println(temp);
                temp = "";

            }else{
                temp += str.charAt(i);

                System.out.println(temp.substring(0,temp.length()-1));
                temp = "";

            }
        }
        System.out.println("words: " + words);
    }
}
