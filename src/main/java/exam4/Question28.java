package exam4;

import java.util.function.Consumer;
import java.util.function.Function;

public class Question28 {

    public static void main(String[] args) {

        Question28 p = new Question28();
        p.invoke((Integer x) -> 5);
        p.invoke((Integer x) -> {
            int y = 5;
        });
    }

    private void invoke(Consumer<Integer> f) {
        System.out.println("l1");
        f.accept(0);
    }

    private int invoke(Function<Integer, Integer> f) {
        System.out.println("l2");
        return f.apply(0);
    }
}
// l2 l1