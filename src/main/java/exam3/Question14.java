package exam3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Question14 {

    public static void main(String[] args) {

        List<String> animals = Arrays.asList("", "dog", "cat", "fish", "pig");

        Optional o = animals.stream().map(s -> {
            if (s.length() > 0) return Optional.of(s);
            else return Optional.empty();
        }).findFirst();

        //System.out.println(((Optional)o.get().get()); doesn't compile

        System.out.println(o.get()); // Optional.empty
    }
}
