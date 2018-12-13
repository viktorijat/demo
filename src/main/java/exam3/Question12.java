package exam3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question12 {

    public static void main(String[] args) {
        List<Comparable> list = new ArrayList<Comparable>();
        list.add(new Long(7));
        list.add(new Long(5));
        list.add(new Integer(1));
        list.add(new Integer(4));
        Collections.sort(list); // Exception in thread "main" java.lang.ClassCastException: java.lang.Long cannot be cast to java.lang.Integer

        list.forEach(System.out::println);
    }

}
