package replit_practice_debug;
import java.util.*;
public class alphabetizeAndNumaratic {
    public static void main(String[] args) {

        practice("dc501gccca098911");
    }
    public static String practice(String str) {
        String cont1 = "";//DC501
        String cont2 = "";//GCCCA098911
        String cont3 = "";
        String[] arrstr;
        for (int i = 0; i < str.length()-1; i++) {
            cont1+=str.charAt(i);
            if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
                if(str.charAt(i+1)>='A'&&str.charAt(i+1)<='z'){
                    cont1+=",";

                }

            }
            if(str.charAt(i)>='A'&&str.charAt(i)<='z'){
                if(str.charAt(i+1)>='0'&&str.charAt(i+1)<='9') {
                    cont1+=",";

                }

            }

        }
        arrstr = cont1.split(",");
        for(String each:arrstr){
            char[] charArr= each.toCharArray();
            Arrays.sort(charArr);
            for(char eachChar:charArr){
                cont2+=eachChar;
            }
        }






        return cont2;
    }
}
