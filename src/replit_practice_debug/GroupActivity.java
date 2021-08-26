package replit_practice_debug;

public class GroupActivity {
    public static void main(String[] args) {

        String one = "aaaaa";
        String two = "qqq";
        String container = "";
        if(one.length()>two.length()){
            for (int i = 0; i < one.length(); i++) {
                if (i <= two.length() - 1) {
                    container += "" + one.charAt(i) + two.charAt(i);

                } else if (i > two.length() - 1) {
                    container += "" + one.charAt(i);
                }
            }
            System.out.println(container);

        }else if(one.length()<two.length()){
            for (int i = 0; i < two.length(); i++) {
                if (i <= one.length() - 1) {
                    container += "" + one.charAt(i) + two.charAt(i);

                } else if (i > one.length() - 1) {
                    container += "" + two.charAt(i);
                }
            }
            System.out.println(container);

        }
    }
}