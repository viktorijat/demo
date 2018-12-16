package exam3;

import java.util.function.Consumer;

public class Question29 {

    public static void main(String[] args) {
        method(1);
        method(5);
        method(7);
    }

    private static void method(int x) {
        //int x = 5;
        Consumer<Integer> f = (y) -> {
            System.out.print(x + y + " ");
        };
        f.accept(3);
        // 4 8 10
    }
}
