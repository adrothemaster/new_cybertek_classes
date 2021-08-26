package replithomework;

import java.util.ArrayList;
import java.util.Scanner;

 class removeAllArrayList {
    //Create a static method that:
    //    is called removeAll
    //    returns ArrayList<String>
    //    takes two parameters: an ArrayList of Strings called wordList, and a String called targetWord
    //This method should go through every element of wordList and remove every instance of targetWord from the ArrayList.

    //ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi","hey","hi","yo"));
    //removeAll(wordList,"hi");
    //wordList: ["hey","yo"]

    //create your method below
    public static ArrayList<String> removeAll(ArrayList<String> wordlist, String targetWord) {
        for (int i = 0; i < wordlist.size(); i++) {
            if (wordlist.get(i).equals(targetWord)) {
                wordlist.remove(i);
                i--;
            }
        }
        return wordlist;
    }



    // Do not touch below


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        String target = in.next();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.next());
        }

        System.out.println(removeAll(list, target));

    }
}
