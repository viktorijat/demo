package com.example.demo;

import java.io.BufferedReader;
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
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
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
        test9();
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
