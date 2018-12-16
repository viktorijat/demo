package exam3;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Questions {

    public static void main(String[] args) throws IOException {

        //question26();
        //question30();
        //question37();
        //question39();
        //question48();
        //question49();
        //question50();
        //question54();
        //question57();
        //question66();
        //question71();
        //question73();
        //question76();
        //question79();
        question80();
    }

    private static void question80() {
        List<Integer> list = Arrays.asList(2, 5, 1, 3);
        OptionalInt x = list.stream().mapToInt(a -> a).min();
        x.ifPresent(System.out::println);
    }

    private static void question79() {
        //LongBinaryOperator f1 = (x, y) -> x + y + 1.2; // Bad return type in lambda expression: double cannot be converted to long
        LongBinaryOperator f2 = (x, y) -> x + 3L;
        //LongBinaryOperator f3 = (x, y) -> "a"; // Bad return type in lambda expression: String cannot be converted to long
        DoubleBinaryOperator f4 = (x, y) -> x + y + 1.2;
        //DoubleBinaryOperator f5 = (x, y) -> String.valueOf(x + y); // Bad return type in lambda expression: String cannot be converted to double

    }

    private static void question76() {
        List<Integer> list = Arrays.asList(1, 4, 5, 3, 7);
        long res = list.parallelStream().filter(n -> n < 3).collect(Collectors.counting());
        System.out.println(res);
    }

    private static void question73() {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Function<Integer, Stream<String>> f = s -> Stream.of(s + "a " + s + "b");
        list.stream().flatMap(f).forEach(System.out::println);
    }

    private static void question71() {

        Comparator c = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };

        Comparator<Integer> c2 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        };

        Comparator<String> c3 = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        };
    }

    private static void question66() {
        List<String> list = Arrays.asList("Jack", "Lucy", "Tom");
        //Function<String, Boolean> p = a -> a.charAt(2) == 'c';
        Predicate<String> p = a -> a.charAt(2) == 'c';
        list.stream().filter(p).forEach(System.out::println);
    }

    private static void question57() {

        List<Integer> list = Arrays.asList(1, 4, 7);

        int x = list.stream().reduce((a, b) -> (a + b)/2).get();
        System.out.println(x);
    }

    private static void question54() throws IOException {

        byte []b = new byte[10];
        InputStream in = System.in;
        int i = in.read(b);

        for (byte c : b) {
            System.out.print((char) c);
        }
        in.close();

        // hellohello1 -> hellohello
        // hellohello123 -> hellohello
    }

    private static void question50() {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        String s = "Help";

        Future<String> f1 = executor.submit(() -> s + 5);
        Future<String> f2 = executor.submit(() -> s + 7);
        Future<String> f3 = executor.submit(() -> s + 2);

        try {
            System.out.println(f3.get());
            System.out.println(f1.get());
            System.out.println(f2.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
        executor.shutdown();
    }

    private static void question49() {

        UnaryOperator<String> u = i -> i + 0.1;
        List<String> list = Arrays.asList("7", "3", "6", "9");

        list.forEach(c -> {
            System.out.println(u.apply(c) + 0.2);
        });

//        70.10.2
//        30.10.2
//        60.10.2
//        90.10.2
    }

    private static void question48() {
        ArrayList<Integer> ints = new ArrayList<>();
        IntStream.rangeClosed(0, 9).forEach(ints::add);
        //Stream.range(0, 9).forEach(ints::add); stream nema range
    }

    private static void question39() throws IOException {

        Path path = Paths.get("./data.txt");
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            writer.write("Hello\n");
            writer.write("World\n");
        }

        try (BufferedReader reader = Files.newBufferedReader(path)) {
            System.out.println(reader.lines().filter(s -> s.startsWith("H")).count());
        }

        try (BufferedReader reader = Files.newBufferedReader(path)) {
            System.out.println(reader.lines().filter(s -> s.startsWith("H")).count());
        }

        try (BufferedReader reader = Files.newBufferedReader(path)) {
            System.out.println(reader.lines().count());
        }
    }

    private static void question37() {

        Path inputPath = Paths.get("./test.txt").normalize();

        try {
            Files.createFile(inputPath);
        } catch (FileAlreadyExistsException e) {
            System.out.println("exae 1");
        } catch (IOException e) {
            System.out.println("ex 1");
        }

        try {
            Files.createFile(inputPath);
        } catch (FileAlreadyExistsException e) {
            System.out.println("exae 2");
        } catch (IOException e) {
            System.out.println("ex 2");
        }

        try {
            Files.createFile(inputPath);
        } catch (FileAlreadyExistsException e) {
            System.out.println("exae 3");
        } catch (IOException e) {
            System.out.println("ex 3");
        }

//        exae 2
//        exae 3
    }

    private static void question30() {

        try {
            int i = 0, j = 0;
            while (true) {
                try {
                    System.out.print(i + " " + j + " ");
                    if (j == 2) throw new Exception();
                    else j++;
                } catch (Exception e) {
                    if (i == 2) throw new Exception();
                    else j = 0;
                }
                i++;
            }
        } catch (Exception e) {

        }

        // 0 0 1 1 2 2
    }

        private static void question26() {

            //UnaryOperator<Integer> u = i -> "a" + i;
            //bad return type
        }
    }
