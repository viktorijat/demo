package com.example.demo;

import java.util.Map;
import java.util.TreeMap;

public class Question47 {

    public static void main(String[] args) {

        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        map.replace(1, "1",null); // ako ne a potrefis old value nisto nema da sa dese
        map.replace(3, null);

        System.out.println(map.values());

        // [one, two, null]
    }
}
