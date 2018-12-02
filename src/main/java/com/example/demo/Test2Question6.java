package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Test2Question6 {

    public static <T> int count (T[] array) {
        int count = 0;
        for (T e : array) ++count;
        return count;
    }

    public static void main(String[] args) {

        Integer[] a = {1, 2, 3, 4, 5};

        int n = Test2Question6.count(a);
        //int m = Test2Question6.count<Integer>(a);
        int m = Test2Question6.<Integer>count(a);


        List<Integer> l = Arrays.asList(4, 6, 16, 66, 3);
        String s = l.stream().map(i -> {return " " + (i + 1);}).reduce("", String::concat);
        //System.out.println(s);

        List<Integer> l2 = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));

        Iterator<Integer> iter = l2.iterator();
        while (iter.hasNext()) {
            iter.next();
            iter.remove();
        }

        for (int i : l2) {
            System.out.println(i);
        }

    }
}
