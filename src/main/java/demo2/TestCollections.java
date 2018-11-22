package demo2;

import java.util.Map;
import java.util.TreeMap;

public class TestCollections {

    public static void main(String[] args) {

        question97();
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
