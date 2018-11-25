package demo2.plain_java;

import java.util.function.Consumer;
import java.util.function.Supplier;

class Bird {
    public void fly() {
        System.out.println("Can fly");
    }
}

class Penguin extends Bird {

    @Override
    public void fly() {
        System.out.println("Cannot fly");
    }
}

public class Question88 {

    public static void main(String[] args) {

        fly(() -> new Bird());
        fly(Penguin::new);


    }

    // line n1
    static void fly(Supplier<Bird> bird) {
        bird.get().fly();
    }
}
