package com.example.demo;

class A1 {
    protected int a;
    public A1 (int a) {
        this.a = a;
        System.out.println("a " + a);
    }
    public int getA() {
        return a;
    }
}

class B1 extends A1 {
    int b;
    public B1 (int b) {
        super(2);
        this.b = b;
        System.out.println("b " + b + " a " + a);
    }
    public int getB() {
        return a + b;
    }
}

public class Question45 {

    public static void main(String[] args) {
        A1 a = new A1(1);
        B1 b = new B1(3);
        System.out.println(a.getA());
        System.out.println(b.getA());
        System.out.println(b.getB());
    }
}
