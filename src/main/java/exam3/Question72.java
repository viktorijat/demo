package exam3;

import java.util.function.BiConsumer;

class A72 {
    void print(int a, int b) {
        System.out.println(a + b);
    }
}

class B72 {
    void execPrint(int a, int b, BiConsumer<Integer, Integer> f) {
        f.accept(a, b);
    }
}

public class Question72 {

    public static void main(String[] args) {
        B72 b = new B72();
        A72 a = new A72();

        b.execPrint(2, 3, a::print);
        b.execPrint(5, 6, a::print);
    }
}
// 5 11