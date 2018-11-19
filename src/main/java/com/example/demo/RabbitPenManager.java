package com.example.demo;

import java.util.concurrent.*;
import java.util.stream.*;


import static java.util.stream.IntStream.iterate;

public class RabbitPenManager {
    public static void await(CyclicBarrier cb) { // k1
        try { cb.await(); } catch (InterruptedException | BrokenBarrierException e) {
// Handle exception
        }
    }
    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(3,
                () -> System.out.println("Pen is Full")); // k2

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        iterate(1, i -> i+1)
                .limit(3).forEach((i) -> executorService.submit(() -> cb.await())); // k3

//        System.out.println("Seed");
//       iterate(10, i -> i+2).limit(3).forEach(System.out::println);

    }
}
