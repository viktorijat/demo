package com.example.demo;

import java.util.concurrent.*;

public class Question9 {

    public static void main(String[] args) {

        Callable<String> c = new Callable<String>() {
            @Override
            public String call() throws Exception {
                String s = "";
                for (int i = 0; i < 10; i++) {
                    s += i;
                }
                return s;
            }
        };

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<String> future = executor.submit(c);
        try {
            String result = future.get();
            //String result = future.wait();
            System.out.println(result);
        } catch (ExecutionException | InterruptedException e) {
        //} catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    // 0123456789
}
