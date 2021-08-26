package iterviewQuestions;

public class FrequencyOfChars {
    public static void main(String[] args) {
        String str = "aacda";
        String temp = "";

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            // System.out.println("str.charAt(i) = " + str.charAt(i));

            System.out.println(" i is: " + i + " value is : " + str.charAt(i));
            System.out.println("temp is: " + temp);
            System.out.println();
            // i = 0 value = a
            // i = 1 value = a
            // i = 2 value = c
            // i = 3 value = d
            // i = 3 value = a

            if (!temp.contains(str.charAt(i) + "")) {

                temp += str.charAt(i); // temp is now "acd"

                // char temp2 = str.charAt(i); // temp2 is now 'd'

/*              //"aacda"
                System.out.println("unique");
                for (int j = 0; j < str.length(); j++) {

                    if(str.charAt(j) == temp2){
                        count++;
                   }

                }

                System.out.println(count);
                count = 0;
                */
            }
        }
    }
}