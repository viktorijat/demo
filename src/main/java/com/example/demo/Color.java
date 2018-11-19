package com.example.demo;

import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Color {
    private int hue = 10;

    public static class Shade {
        public int hue = this.hue;
        int a;
    }


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //System.out.println(new Shade().hue);
        //test1();
        //test2();
        //test3();
        //test4();
        //test5();
        //test6();
        //test7();
        //test8();
        //test9();
        //test10();
        //test11();
        //test12(Stream.empty()); //throws NoSuchElementException
        //test12(Stream.iterate(1, x-> x++)); //runs forever
        //test12(Stream.of(5, 10)); //NoSuchElementException
    }

    private static void test12(Stream<Integer> s) {
            Optional o = s.filter(x -> x < 5).max((x, y) -> x - y);
            System.out.println(o.get());
    }

    private static void test11() {
        List<Integer> l1 = Collections.emptyList();
        List<Integer> l2 = Arrays.asList(1, 2, 3);
        List<Integer> l3 = Arrays.asList(4, 5, 6);

        Stream.of(l1, l2, l3)
                .limit(2)
                .peek(m -> System.out.println("peek1: " + m)) // peek 1
                .flatMap(Collection::stream)
                .peek(p -> System.out.println("peek2: " + p)) // peek 2
                .map(x -> x + 1)
                .forEach(q -> System.out.println("for each: " + q));
    }

    private static void test10() {
        List letters = Arrays.asList('a', 'b', 'c');
        letters.stream() // c1
                .sorted() // c2
                .distinct() // c3
                .forEach(System.out::println); // c4
                //.sorted();
    }

    private static void test9() {
        IntStream ls = IntStream.of(1, 2, 3);
        OptionalInt opt = ls.map(n -> n * 10).filter(n -> n < 50).findFirst();
        System.out.println(opt.isPresent());
    }

    private static void test8() {
        Stream<String> s = Stream.empty();
        Predicate<String> c1 = b -> b.startsWith("c");
        Map<Boolean, List<String>> p = s.collect(Collectors.partitioningBy(c1));

        Function<String, Boolean> c = b -> b.startsWith("c");
        Map<Boolean, List<String>> g = s.collect(Collectors.groupingBy(c));
        System.out.println(p + " " + g);
    }

    private static void test7() {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, null);

        map.merge(1, 3, (a, b) -> null);

        System.out.println(map);

        map.merge(3, 3, (a, b) -> null);

        System.out.println(map);
    }

    private static void test6() {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> list2 = new CopyOnWriteArrayList<>(list1);
        List<Integer> list3 = Collections.synchronizedList(list1);

        for (Integer item : list2) list2.add(10); // h1
        for (Integer item : list3) list3.remove(0); // h2
        System.out.println(list1.size() + " " + list2.size() + " " + list3.size());
    }

    private static void test5() {
        LocalDate date = LocalDate.of(2100, 5, 14);
        LocalTime time = LocalTime.of(9, 15);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        Duration d = Duration.of(1, ChronoUnit.WEEKS);
        System.out.println(dateTime.plus(d));
    }

    private static void test4() throws ExecutionException, InterruptedException {
        Object o1 = new Object();
        Object o2 = new Object();
        ExecutorService service = Executors.newFixedThreadPool(10);
        Future<?> f1 = service.submit(() -> {
            synchronized (o1) {
                synchronized (o2) {
                    System.out.println("Frog");
                } // h1
            }
        });
        Future<?> f2 = service.submit(() -> {
            synchronized (o1) {
                synchronized (o2) {
                    System.out.println("Toad");
                } // h2
            }
        });
        f1.get();
        f2.get();

    }

    private static void test3() {
        Stream<Integer> prime = Stream.of(2, 3, 5, 7);
        Stream<Integer> composite = Stream.of(4, 6, 8);
//        ConcurrentMap<Boolean, List<Integer>> data = Stream.concat(prime, composite)
//                .flatMap(s -> s).parallelStream()
//                .collect(Collectors.groupingByConcurrent(n -> (n % 2) == 0));
//        System.out.println(data.get(true).size() + " " + data.get(false).size());
    }

    private static void test2() {
        DoubleStream ds = DoubleStream.empty();
        OptionalDouble opt = ds.findAny();
        System.out.println(opt.orElseGet(() -> 0));
    }

    static void test1() {
        List list = new ArrayList();
        list.add(1);
        list.add("2");
        list.add(.3);
        int a;

        for (Object object : list)
            System.out.println(object);

        //LocalTime.now()
    }


}