package demo2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TestFunctionalInterfaces {

    public static void main(String[] args) {
        test1();
    }

    private static void test1() {

        List<String> colors = Arrays.asList("red", "green", "yellow");

        Predicate<String> test = n -> {
            System.out.println("Searching..." + n);
            return n.contains("red");
        };

        boolean found = colors.stream().filter(c -> c.length() > 3).allMatch(test);
        //allMatch kje prestane koa kje go najde prvoto
        // Searching...
    }
}
