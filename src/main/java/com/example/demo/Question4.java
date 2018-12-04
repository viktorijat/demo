package com.example.demo;

import java.util.Arrays;
import java.util.List;

public class Question4 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(4, 6, 12, 66, 3);

        String s = list.stream()
                .map(i -> {return " " + (i + 1);})
                .reduce("", String::concat);

        System.out.println(s);

        // 5 7 13 67 4
    }
}
