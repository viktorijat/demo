package com.example.demo;

import java.util.concurrent.atomic.AtomicIntegerArray;

public class Question63 {

    private AtomicIntegerArray x = new AtomicIntegerArray(3);

    public static void main(String[] args) {

        Question63 p = new Question63();

        p.x.addAndGet(0, 1);
        p.x.addAndGet(1, 2);
        p.x.addAndGet(2, 3);

        for (int i = 0; i < p.x.length(); i++) {
            System.out.println(p.x.get(i));
        }
    }
}
