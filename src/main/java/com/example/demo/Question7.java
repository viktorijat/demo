package com.example.demo;

final class A {
    private String s;
    public A(String s) {
        this.s = s;
        System.out.println("s: " + this.s);
    }

    @Override
    public String toString() {
        return s;
    }

    public void setA(String a) {
        this.s += a;
    }
}

public class Question7 {

    private final A a;

    public Question7(A a) {
        this.a = a;
    }

    public String toString() {
        return a.toString();
    }

    public static void main(String[] args) {
        A a = new A("Bye");
        Question7 im = new Question7(a);
        System.out.print(im);

        a.setA(" bye");
        System.out.print(im);

        // ByeBye bye
    }
}
