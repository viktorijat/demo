package demo2.plain_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question37 {

    public static void main(String[] args) {
        String[] arr = {"Hi", "How", "Are", "You"};
        List<String> arrList = new ArrayList<>(Arrays.asList(arr));
        if (arrList.removeIf((String s) -> {return s.length() <= 2;})) {
            //System.out.println(s + " removed");
            // Compilation fails
        }
    }
}
