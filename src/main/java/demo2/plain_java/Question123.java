package demo2.plain_java;

interface Rideable {
    Car getCar(String name);
}

class Car {
    private String name;
    public Car(String name) {}
}

public class Question123 {

    Rideable rider = Car::new;
    Car vehicle = rider.getCar("MyCar");
}
