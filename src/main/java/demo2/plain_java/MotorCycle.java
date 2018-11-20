package demo2.plain_java;

import java.util.ArrayList;

interface Vehicle {}
//class Vehicle {}

public class MotorCycle implements Vehicle {
//public class MotorCycle extends Vehicle {

    public static void main(String[] args) {

        ArrayList<Vehicle> myList = new ArrayList<>();
        myList.add(new MotorCycle());

        // Vehicle is a superclass of MotorCycle
        // Vehicle is an interface that is implemented by the MotorCycle class
    }
}
