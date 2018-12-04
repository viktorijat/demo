package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Question14 {

    public static void main(String[] args) {
        List list = Arrays.asList(1, 3, 5, 7, 2);

        Consumer<List<Integer> > modify = l ->
        {
            for (int i = 0; i < l.size(); i++)
                l.set(i, 2 * l.get(i));
        };

        Consumer a = b -> {
            String json = new String(b + "r".toString());
            System.out.print(json);};


        a.accept("3");

        list.stream().peek(a).forEach(System.out::println);

        Supplier s = () -> "a";


        IntFunction<String> i = (x)->Integer.toString(x);

        System.out.println(i.apply(987).concat("blabla"));

    }
}
