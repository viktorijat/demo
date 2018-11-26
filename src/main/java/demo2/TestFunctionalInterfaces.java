package demo2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

public class TestFunctionalInterfaces {

    public static void main(String[] args) {
        question9();
        //question139();
        //question140();
        //question138();
    }

    private static void question138() {
        String str = "Java is a programming language";
        ToIntFunction<String> indexval = str::indexOf; // line n1
        int x = indexval.applyAsInt("Java"); // line n2
        System.out.println(x);

        // kje go dade redniot broj na "J" bukvata
        // result: 0
    }


    private static void question139() {
        List<String> codes = Arrays.asList("DOC", "MPEG", "JPEG");
        codes.forEach(c -> System.out.print(c + " "));
        String fmt = codes.stream().filter(s -> s.contains("PEG")).reduce((s, t) -> s + t).get();
        System.out.println("\n" + fmt);

        //DOC MPEG JPEG
        //MPEGJPEG
    }

    private static void question140() {
        List<String> nl = Arrays.asList("Jim", "John", "Jeff");
        Function<String, String> funval = "Hello: "::concat;
        nl.stream().map(funval).peek(System.out::print);

        //peek ne e finalna operacija, nisto ne printa
    }

    private static void question9() {

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
