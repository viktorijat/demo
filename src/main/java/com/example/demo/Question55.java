package com.example.demo;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

interface I {

//    default boolean equals(Object o) {
//        return true;
//    } // ne moze override na equals so default
}

class C implements I {

    public boolean equals() {
        return false;
    }
}

public class Question55 {

    public static void main(String[] args) {


        //q1();
        //q2();

        q3();
    }

    private static void q3() {

        final Path path = Paths.get(".").normalize();
        System.out.println(path);

        int count = 0;
        System.out.println(path.getNameCount());
        for (int i = 0; i < path.getNameCount(); ++i) {
            count++;
        }

        System.out.println(count);
    }

    private static void q2() {
        List<Integer> list = Arrays.asList(4, 6, 2, 9);
        list.stream().anyMatch((x) -> x > 2);
        System.out.println(list.stream().noneMatch(x -> x > 11));
        System.out.println(list.stream().noneMatch(x -> x > 5));
        System.out.println(list.stream().noneMatch(x -> x < 10));
    }

    private static void q1() {

        List<Integer> list = Arrays.asList();
        Optional<Integer> i = list.stream().findFirst();
        System.out.println(i.get());

        // java.util.NoSuchElementException: No value present
    }
}
