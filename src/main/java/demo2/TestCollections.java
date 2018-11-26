package demo2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;

public class TestCollections {

    public static void main(String[] args) {

        //question97();
        question4();
    }

    private static void question4() {

        List<Integer> list1 = Arrays.asList(10, 20);
        List<Integer> list2 = Arrays.asList(15, 30);

        Stream.of(list1, list2).flatMap(list -> list.stream()).forEach(s -> System.out.print(s + " "));
    }

    private static void question97() {

        Map<Integer, String> books = new TreeMap<>();
        books.put (1007, "A");
        books.put (1002, "C");
        books.put (1001, "B");
        books.put (1003, "B");
        System.out.println (books);

        // {1001=B, 1002=C, 1003=B, 1007=A}
    }
}
