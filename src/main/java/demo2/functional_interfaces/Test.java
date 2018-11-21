package demo2.functional_interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public class Test {

    public static void main(String[] args) {

        question147();
        question149();

    }

    private static void question147() {
        //BiFunction<Integer, Double, Integer> val = (t1, t2) -> t1 + t2; //line n1 compiler error double - integer

    }

    private static void question149() {

        UnaryOperator<Integer> uo1 = s -> s * 2; // line n1
        List<Double> loanValues = Arrays.asList(1000.0, 2000.0);
        loanValues.stream()
                .filter(lv -> lv >= 1500)
                // .map(lv -> uo1.apply(lv)) // compiler error
                .forEach(s -> System.out.println(s + " "));
    }
}
