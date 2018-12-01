package com.example.demo;

public class Question13 {

    static int y = 0;

    public static void main(String[] args) {

        abstract class A {
            public abstract int calc(int x);
        }

        A a = new A() {

            @Override
            public int calc(int x) {
                print(3);
                return x * y;
            }

            public void print(int x) {
                System.out.println(x);
            }
        };


        System.out.println(a.calc(2));
    }
}
