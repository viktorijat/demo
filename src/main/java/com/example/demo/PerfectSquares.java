package com.example.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class PerfectSquares {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        IntStream.of(1, 4, 9, 16, 25).parallel() // z1
                .forEachOrdered(c -> service.submit( // z2
                        () -> System.out.println(10 * c))); // z3
        service.submit(() -> System.out.println("Complete!")); // z4
        service.shutdown();
    }
}
