package day24_loops;

/**
 * a b c d e ... z
 * z ... a
 */
public class Alphabet {
    public static void main(String[] args) {
        char letter = 'a';
//        System.out.println("letter = " + letter);
//        letter++;
//        System.out.println("letter = " + letter);
        while (letter <= 'z') {
            System.out.print(letter+" ");
            letter++;
        }
        System.out.println();
        //print alphabet reverse order
        letter = 'z';
        while (letter >= 'a') {
            System.out.print(letter+ " ");
            letter--;
        }
    }
}
