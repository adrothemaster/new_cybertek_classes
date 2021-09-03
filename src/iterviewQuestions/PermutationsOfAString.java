package iterviewQuestions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PermutationsOfAString {
    /**
     * Lets say you have String as ABC.
     * So we take out A from ABC
     * First character =A and RemainingString = BC
     * As we are applying recursion here, we will find permutations of BC.
     * Take out B from BC.
     * First character= B and RemainingString = C
     * As we are applying recursion here, we will find permutations of C.
     * When we take out C, our String size becomes 0 and that is our base case here.
     * First character = C and RemainingString = “”
     * We insert C to differences indexes of Permutations  of RemainingString(“”), so we get permutation of C as C.
     * We insert B to different indexes of Permutations of remainingString(C), so we get BC and CB.
     * C: BC, CB
     * Now we insert A to different indexes in BC and CB.
     * BC : ABC , BAC , BCA
     * CB : ACB, CAB, CBA
     * so thats how we got all permutations of ABC.
     * It may look tricky but once you practice the solution, you will be able to understand it better.
     */

    public static void main(String[] args) {
        Set set=permutationOfString("ABC");
        System.out.println("Permutations of String ABC are:");
        for (Iterator iterator = set.iterator(); iterator.hasNext();) {
            String string = (String) iterator.next();
            System.out.println(string);
        }
    }

    public static Set permutationOfString(String str)
    {
        Set permutationSet=new HashSet();

        if(str.length()==0)
        {
            permutationSet.add("");
            return permutationSet;
        }

        // take out first character of String
        char c=str.charAt(0);
        // Remaining String
        String rem=str.substring(1);

        Set permutatedSetForRemainingString=permutationOfString(rem);
        for (Object permutedString: permutatedSetForRemainingString) {
            for (int j = 0; j <= permutedString.toString().length(); j++) {
                String permutation=insertFirstCharAtDiffPlaces((String) permutedString,c,j);
                permutationSet.add(permutation);
            }

        }
        return permutationSet;

    }
    public static String insertFirstCharAtDiffPlaces(String perm,char firstChar,int index)
    {
        // Inserting firstCharacter of orig String at difference places based on index
        return perm.substring(0,index)+firstChar+perm.substring(index);
    }

}