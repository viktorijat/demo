package com.example.demo;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class CheckWeather extends RecursiveTask { // j1
    private int start;
    private int end;

    public CheckWeather(int start, int end) {
        this.start = start;
        this.end = end;
    }

    protected Object compute() { // j2
        if ((end - start) < 2)
            return null;
        else {
            int middle = start + ((end - start) / 2);
            invokeAll(new CheckWeather(start, middle), new CheckWeather(middle, end)); // j3
        }
        return null;
    }

    public static void main(String[] args) {
        ForkJoinTask task = new CheckWeather(0, 4);
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(task);
    }
}
