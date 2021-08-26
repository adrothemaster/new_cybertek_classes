package replit_practice_debug;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();

        int wordCharCount = word.length();
        int tCharCount = 3;

        for (int i = 0; i <= wordCharCount - tCharCount; i++) {
            String currentWord = word.substring(i, i + tCharCount);
            if (currentWord.equals("cat")) {
                countOfCats++;
            } else if (currentWord.equals("dog")) {
                countOfDogs++;
            }
        }
        System.out.println(countOfCats == countOfDogs);
    }
    }










        /*
        for ( int i=0; i <= word.length(); i++){
            if (word.contains("cat") && word.contains("dog")){

                }
                if (countOfCats == countOfDogs){
                    System.out.println("true");

                    //countOfCats++;
                    //countOfDogs++;


                    System.out.println("true");
                    break;
                }else{
                    System.out.println("false");
                    break;
                }
            }
        }
    }
}

// for ( int j=0; j < countOfCats; j++){

//    }
//  }
//

         */


