package com.example.demo;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SaladBarTracker {

    public static void await(CyclicBarrier cb) {
        try {
            cb.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            // Handle exception
        }
    }

    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(2, () -> System.out.println("Salad bar empty")); // r1
        ExecutorService service = Executors.newFixedThreadPool(10); // r2
        for (int i = 0; i < 12; i++) {
            service.submit(() -> await(cb)); // r3
            System.out.println("submit " +  i);
        }
        service.shutdown();
    }
}