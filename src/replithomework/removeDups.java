package replithomework;

public class removeDups {
    public static void main(String[] args) {


        /**
         * how would you take out any duplicates from the string below
         * easiest way
         * then harder way.
         * ====== abcd =======
         */
        char word1;
        String word = "fffffnnnnnnaaaaaaoooooopppppppppp";
        String temp = "";

        for (int i = 0; i < word.length(); i++) {
            word1 = word.charAt(i);

            if (!temp.contains(word1 + "")){
                temp += word1;

            }
        }
        System.out.println("before = " + word);
        System.out.println("after no duplicates in string = " + temp);
    }
}
