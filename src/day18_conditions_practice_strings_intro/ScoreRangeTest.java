package day18_conditions_practice_strings_intro;
/**
 * score:
 * 	1-40   -> D
 * 	41-60  -> C
 * 	61-90  -> B
 * 	91-100 ->A...
 * 	else
 * 		'invalid score'
 */
public class ScoreRangeTest {
    public static void main(String[] args) {
        int score = 100;
        if (score >= 1 && score <= 40) {
            System.out.println("Grade D");
        }else if (score >= 41 && score <= 60) {
            System.out.println("Grade C");
        }else if (score >= 61 && score <= 90){
            System.out.println("Grade B");
        }else if (score >= 91 && score <= 100) {
            System.out.println("Grade A");
        }else {
            System.out.println("Invalid score = " + score);
        }

//        else if(score <= 0 || score > 100){
//            System.out.println("Invalid score = " + score);
//        }
    }
}
