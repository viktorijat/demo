package exam3;

import java.util.concurrent.atomic.AtomicInteger;

public class Question52 {

    int val = 10;
    int x;
    Question52(int i) {
        val = i;
    }

    private AtomicInteger value = new AtomicInteger(val);

    public static void main(String[] args) {
        Question52 at = new Question52(5);
        System.out.println(at.value.decrementAndGet()); // 9
    }
}
