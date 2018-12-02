package com.example.demo;

interface I1 {
    void print(String value);
}

public class Question69 {

    public static void main(String[] args) {
        printA("A");
        printA("B");
    }

    private static void printA(final String name) {
        I1 i = new I1() {
            @Override
            public void print(String value) {
                System.out.println(name + " " + value);
            }
        };
        i.print("A");
    }
}
