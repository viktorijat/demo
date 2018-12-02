package com.example.demo;

class A3 {
    private int a;
    public A3(int a) {
        this.a = a;
    }

    public int getA() {
        int y = 3; //mora final ili efectively final

        class LC {
            private int x;
            public LC(int x) {
                this.x = x + y;
            }
            public int getX() {
                return x;
            }
        }
        //y++;
        LC lc1 = new LC(a + y);
        return lc1.getX();
    }
}

public class Question46 {

    public static void main(String[] args) {

        A3 a1 = new A3(3);
        A3 a2 = new A3(5);

        System.out.println(a1.getA());
        System.out.println(a2.getA());
    }
}
