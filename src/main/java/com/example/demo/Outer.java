package com.example.demo;

public class Outer {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            class Inner {
//                public static void print() {
//                    System.out.println("Roar!");
//                }
            }
        }
        //new Inner().print();
    }
}
