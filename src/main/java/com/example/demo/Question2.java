package com.example.demo;

public class Question2 {

    public static void main(String[] args) {

        Runnable r = () -> System.out.println("running");
        Thread thread = new Thread(r);
        thread.start();
    }

}
