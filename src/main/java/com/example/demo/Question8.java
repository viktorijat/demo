package com.example.demo;

class Task implements Runnable {


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
        }
    }
}

public class Question8 {

    public static void main(String[] args) {
        Task t = new Task();
        Thread thread = new Thread(t);
        thread.start();
    }
    //0123456789
}
