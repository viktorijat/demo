package demo2.functional_interfaces;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {

        //question147();
        question149();
        //question134();
        //question126();
        //question122();
        //question121();
        //question118();
        //question92();
        //question84();
        //question83();
    }

    private static void question83() {
        IntStream stream = IntStream.of(1, 2, 3);
        IntFunction<IntUnaryOperator> inFu = x -> y -> x * y; // line n1
        IntStream newStream = stream.map(inFu.apply(10));
        newStream.forEach(System.out::print);


    }

    private static void question84() {
        List<Integer> values = Arrays.asList(1, 2, 3);
        values.stream()
                .map(n -> n * 2) // line n1
                .peek(System.out::print) // line n2
                .count();
    }

    private static void question92() {
        Stream<List<String>> iStr = Stream.of(
                Arrays.asList("1", "John"),
                Arrays.asList("2", null));
        Stream<String> nInSt = iStr.flatMap((x) -> x.stream());
        nInSt.forEach(System.out::println);
    }

    private static void question118() {
        List<String> listVal = Arrays.asList("Joe", "Paul", "Alice", "Tom");
        System.out.println(
                // line n1
                listVal.stream().filter(x -> x.length() > 3).count()
        );
    }

    private static void question121() {

        List<String> str = Arrays.asList("my", "pen", "is", "your", "pen");

        Predicate<String> test = s -> {
            int i = 0;
            boolean result = s.contains("pen");
            System.out.print(i++ + ":");
            return result;
        };

        //str.stream().filter(test).findFirst().isPresent(System.out::print);

        // compilation error occurs
    }

    private static void question122() {
        List<String> empDetails = Arrays.asList("100, Robin, HR",
                "200, Mary, AdminServices", "101, Peter, HR");

        empDetails.stream().filter(s -> s.contains("1")).sorted()
                .forEach(System.out::println); // line n1


        // 100, Robin, HR
        // 101, Peter, HR
    }

    private static void question126() {
        List<Integer> nums = Arrays.asList(10, 20, 8);
        System.out.println(
                //line n1
                nums.stream().max(Comparator.comparing(a -> a)).get()
        );

        // 20
    }

    private static void question134() {

        List<Integer> codes = Arrays.asList(10, 20);
         UnaryOperator<Double> uo = s -> s + 10.0;
        // taka si bese, zznaci compiler error
        UnaryOperator<Integer> uo2 = s -> s + 10; //UnaryOperator<Double> uo2 = s -> s + 10;
        //codes.replaceAll(uo); // tuka compiler error
        codes.replaceAll(uo2); // 20 30
        codes.forEach(System.out::println);

//        List<Double> codes = Arrays.asList(10.0, 20.0);
//        UnaryOperator<Integer> uo = s -> s + 10.0;
//        // taka si bese, zznaci compiler error
//        UnaryOperator<Integer> uo2 = s -> s + 10;
//        //codes.replaceAll(uo); // tuka compiler error
//        codes.replaceAll(uo2); // 20 30
//        codes.forEach(System.out::println);
    }

    private static void question147() {
        //BiFunction<Integer, Double, Integer> val = (t1, t2) -> t1 + t2; //line n1 compiler error double - integer

    }

    private static void question149() {

        UnaryOperator<Integer> uo1 = s -> s * 2; // line n1
        List<Double> loanValues = Arrays.asList(1000.0, 2000.0);
        loanValues.stream()
                .filter(lv -> lv >= 1500)
                //.map(lv -> uo1.apply(lv)) // compiler error
                .forEach(s -> System.out.println(s + " "));
    }
}
