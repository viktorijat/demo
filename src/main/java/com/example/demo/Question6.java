package com.example.demo;

public class Question6 {

    public static void main(String[] args) {

        Thread th = new Thread(new Runnable() {

//            static {
//                System.out.println("initial");
//            } // Inner classes cannot have static declarations

            @Override
            public void run() {
                System.out.println("start");
            }
        });

        th.start();
    }
}
