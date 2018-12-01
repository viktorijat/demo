package com.example.demo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Question10 {

    public static void main(String[] args) {
        test();
    }

    private static void test() {

        Runnable r = new Runnable() {
            @Override
            public void run() {

            }
        };

        Callable<Long> c = new Callable<Long>() {
            @Override
            public Long call() throws Exception {
                return 0L;
            }
        };

        //ExecutorService es1 = Executors.newSingleThreadExecutor(4);
        ExecutorService es2 = Executors.newFixedThreadPool(10);
        //ExecutorService es3 = Executors.newScheduledThreadPool();
        ExecutorService es4 = Executors.newScheduledThreadPool(10);
        ExecutorService es5 = Executors.newSingleThreadScheduledExecutor();

        Executors.newSingleThreadExecutor().execute(r);
        //Executors.newSingleThreadExecutor().execute(c);
        Future<Long> f = Executors.newSingleThreadExecutor().submit(c);
        //Future<Long> f2 = Executors.newSingleThreadExecutor().submit(r);

    }
}
