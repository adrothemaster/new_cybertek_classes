package GroupPracticeMeeting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sortStringUsingFrequency {
    public static void main(String[] args) {

        String str = "tomorrow";
        List<String> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i)+"");

        }

        System.out.println(Collections.frequency(list, "o"));
        System.out.println(list);

    }
}
