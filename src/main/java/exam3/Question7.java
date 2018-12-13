package exam3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Question7 {

    private static int counter(List<String> list, Predicate<String> p) {
        int count = 0;
        for (String s : list) {
            if (p.test(s)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Dog", "Dog", "Dog", "Cat", "Cat");
        System.out.println(counter(list, s -> s.startsWith("Dog")));
        System.out.println(counter(list, s -> s.startsWith("Cat")));
    }
}
