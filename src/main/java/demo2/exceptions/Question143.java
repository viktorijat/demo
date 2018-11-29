package demo2.exceptions;

class FuelNotAvailException extends Exception {}

class Vehicle {
    protected void ride() throws Exception { // line n1
        System.out.println("happy journey");
    }
}

class SolarVehicle extends Vehicle {
     public void ride() throws Exception {
        super.ride();
    }
}

public class Question143 {

    public static void main(String[] args) throws Exception {
        Vehicle v = new SolarVehicle();
        v.ride();
    }
}
