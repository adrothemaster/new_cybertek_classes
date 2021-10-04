package iterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class removeMoreThan100 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1, 5, 102, 70, 29, 402, 99, 1, 55, 8000));

        Iterator<Integer> nums = numbers.iterator();

        while (nums.hasNext()) {
            if (nums.next() > 100) {
                nums.remove();
            }

//        numbers.removeIf(number -> number > 100);
//        System.out.println(numbers);
        }
        System.out.println(numbers);
    }
}
