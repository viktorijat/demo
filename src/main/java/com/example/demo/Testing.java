package com.example.demo;

import java.io.BufferedReader;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Testing {

    public static void main(String[] args) throws IOException {
        //test1(Collections.singletonList(123));
        //test2();
        //test3();
        //test4();
        //test5();
        //test6();
        //test7();
        //test8();
        //test9();
        //test47();
        //test48();
        //test55();
        //test75();
        //test78();
        //test79();
        //test80();
        //test81();
        test84();
    }

    private static void test84() {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        String s = "Help";

        Future<String> future1 = executor.submit(() -> s + 5);
        Future<String> future2 = executor.submit(() -> s + 7);
        Future<String> future3 = executor.submit(() -> s + 2);

        try {
            System.out.println(future3.get());
            System.out.println(future1.get());
            System.out.println(future2.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
        executor.shutdown();
    }

    private static void test81() {

        List<Integer> numbers = Arrays.asList(0, 1, 3, 9, 2, 4, 5, 11);

        Predicate<Integer> p = e -> {
            if (e > 3) return true;
            else return false;
        };

        Map<Boolean, List<Integer>> map = numbers.stream().collect(Collectors.partitioningBy(p));

        map.keySet().forEach(o -> {
            map.get(o).forEach(e -> System.out.print(e));
            System.out.println(" ");
        });
    }

    private static void test80() {

        List<?> list =  Arrays.asList(5, "AAA", 1, "BBB", "CCC");
        //list.stream().sorted(Integer::compareTo).forEach(s -> System.out.println(s));
    }

    private static void test79() {
        List<Integer> list = Arrays.asList(1, 2, 1, 3, 1);

        AtomicInteger count1 = new AtomicInteger();
        AtomicInteger count2 = new AtomicInteger();

        Consumer<Integer> f1 = (n) -> count1.addAndGet(n);
        Consumer<Integer> f2 = (n) -> {if (n < 2) count2.addAndGet(n);};

        list.stream().peek(f2).peek(f1);

        System.out.println(count1.get());
        System.out.println(count2.get());

    }

    private static void test78() {
        ToDoubleBiFunction<Integer, Integer> f = (x, y) -> x + y;
        //ToLongBiFunction<Double, Double> f2 = (x, y) -> x + y;
        ToIntBiFunction<Long, Long> f3 = (x, y) -> 0;
        //ToDoubleBiFunction<Double, Double> f4 = (x, y) -> "A";
        ToDoubleBiFunction<String, String> f4 = (x, y) -> 10.1;

    }

    private static void test75() {
        List<String> list = Arrays.asList("a", "b");
        Function<String, Stream<String>> f = s -> Stream.of(s + "e", s + "f");
        list.stream().flatMap(f).forEach(s -> System.out.print(s + " "));
    }

    private static void test55() {
        LongUnaryOperator lou = l -> l*2;
        long l = lou.compose(lou).applyAsLong(3);
        System.out.println(l);
    }

    private static void test48() {

        //LongFunction<String> f1 = (e) -> e.lenght() + 5L; nema lenght
        //IntConsumer<String> f2 = (e) -> System.out.println(e); nema argumenti
        DoublePredicate p = e -> e > 0.3;
        BooleanSupplier s = () -> false;
        //DoubleToLongFunction f = e -> 0.0;
    }

    private static void test47() {

        Consumer<String> c = s -> {
            if (s.startsWith("F")) {
                System.out.println(s);
            }
        };

        c.andThen(s -> System.out.println(s + "1")).andThen(s -> System.out.println(s + "2")).accept("Frank");
    }

    private static void test9() {

        LocalDate date = LocalDate.of(2016, Month.NOVEMBER, 6);
        LocalTime time = LocalTime.of(1, 30);

        ZoneId zone = ZoneId.of("US/Eastern");
        ZonedDateTime dateTime1 = ZonedDateTime.of(date, time, zone);
        ZonedDateTime dateTime2 = dateTime1.plus(1, ChronoUnit.HOURS);

        System.out.println("date1 " + dateTime1);
        System.out.println("date2 " + dateTime2);
        long hours = ChronoUnit.HOURS.between(dateTime1, dateTime2);
        int clock1 = dateTime1.getHour();
        int clock2 = dateTime2.getHour();
        System.out.println(hours + ", " + clock1 + ", " + clock2);
    }

    private static void test8() {
        Stream<String> s = Stream.empty();
        Stream<String> s2 = Stream.empty();

        Predicate<String> c = b -> b.startsWith("c");
        Map<Boolean, List<String>> p = s.collect(Collectors.partitioningBy(c));

        Function<String, Boolean> c1 = b -> b.startsWith("c");
        Map<Boolean, List<String>> g = s2.collect(Collectors.groupingBy(c1));
        System.out.println(p + " " + g);

    }

    private static void test7() {
        Set<Integer> set = new HashSet<>();
        set.add(new Integer(6));
        set.add(new Integer(6));
        System.out.println(set.size() + " " + set.contains(6));
    }

    private static void test6() throws IOException {

        System.out.println("Working Directory = " +
                System.getProperty("user.dir"));

        Path path = Paths.get("blabla.txt");
        try (BufferedReader reader = Files.newBufferedReader(path)) { // x1
            String s = null;
            while (reader.readLine() != null) // x2
                System.out.println(reader.readLine()); // x3
        }

    }

    private static void test5() {

        DoubleStream one = DoubleStream.generate(() -> 1).limit(10);

        //IntStream is = one.mapToInt(Integer::parseInt);
    }

    private static void test4() {
        Stream<LocalDate> s = Stream.of(LocalDate.now());
        UnaryOperator<LocalDate> u = l -> l;
        System.out.println(s.filter(l -> l != null).map(u));
    }

    private static void test3() {
//        Stream<Integer> prime = Stream.of(2, 3, 5, 7);
//        Stream<Integer> composite = Stream.of(4, 6, 8);
//        ConcurrentMap<Boolean, List<Integer>> data = Stream.concat(prime, composite)
//        .flatMap(s -> s).parallelStream()
//        .collect(Collectors.groupingByConcurrent(n -> (n % 2) == 0));
//        System.out.println(data.get(true).size() + " " + data.get(false).size());
    }

    private static void test2() {
        Arrays.asList(0, 1, 2).forEach(System.out::println);
        Arrays.asList(0, 1, 2).stream().forEach(System.out::println);
        IntStream.range(0, 3).forEach(System.out::println);
        IntStream.range(0, 3).forEach(System.out::println);
    }

    private static void test1(List<? super Number> list) {
        list.add(123);
    }
}
