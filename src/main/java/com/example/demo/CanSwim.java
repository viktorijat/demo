package com.example.demo;

public abstract interface CanSwim {
    int MAX_DISTANCE = 10;

    abstract void swim();

//    default static boolean hasFlippers() {
//        return false;
//    }

    public static int getMaxDistance() {
        return MAX_DISTANCE;
    }

//    public final static void checkSwimmer() {
//    }
}
