package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Question16 {

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add(new Long(7));
        list.add(new Long(5));
        list.add(new Integer(1));
        list.add(new Integer(4));

        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if ((o1 instanceof Integer) && (o2 instanceof Long)) {
                    Long o3 = ((Integer) o1).longValue();
                    return o3.compareTo((Long) o2);
                } else if ((o2 instanceof Integer) && (o1 instanceof Long)) {
                    Long o3 = ((Integer) o2).longValue();
                    return o3.compareTo((Long) o1);
                } else {
                    return ((Comparable) o1).compareTo(o2);
                }
            }
        });

        list.forEach(a -> System.out.print(a.toString() + " "));

        // 1 4 5 7
    }
}
