package com.example.demo;

import java.util.function.Consumer;

public class Question33 {

    public static void main(String[] args) {
        method(1);
        method(5);
        method(7);
    }

    private static void method(int i) {
        //i = i + 1;
        Consumer<Integer> f = (y) -> {
            //System.out.println(i + y + " ");
            System.out.println(i + 1 + y + " ");
        };
        //Variable used in lambda expression should be final or effectively final

        f.accept(3);
    }
}
