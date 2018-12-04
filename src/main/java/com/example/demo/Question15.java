package com.example.demo;

class Super {

    String m1() {
        return "MS1";
    }

    String m2() {
        return "MS2";
    }
}

class B extends Super {

    String m1() {
        return "MA1";
    }

    String m2() {
        return "MA2";
    }
}

public class Question15 {

    public static void main(String[] args) {

        Super s = new B();

        B b = new B();

        System.out.println(s.m1());
        System.out.println(s.m2());
        System.out.println(b.m1());
        System.out.println(b.m2());


//        MA1
//        MA2
//        MA1
//        MA2


    }
}
