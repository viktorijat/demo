package demo2.vehicle;

import java.util.ArrayList;

interface Vehicle2 {}
//class Vehicle {}

public class Question18 implements Vehicle2 {
//public class MotorCycle extends Vehicle {

    public static void main(String[] args) {

        ArrayList<Vehicle2> myList = new ArrayList<>();
        myList.add(new Question18());

        // Vehicle is a superclass of MotorCycle
        // Vehicle is an interface that is implemented by the MotorCycle class
    }
}
