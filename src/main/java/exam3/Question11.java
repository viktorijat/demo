package exam3;

import java.util.ArrayList;
import java.util.List;

public class Question11 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("John");
        list.add("Richard");
        list.add("Kevin");

        String[] array = (String[]) list.toArray(); // Exception in thread "main" java.lang.ClassCastException:
        // [Ljava.lang.Object; cannot be cast to [Ljava.lang.String;
        //toArray vrakja Object[]

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
