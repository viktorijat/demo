package demo2;

class Vehicle {
    int x;

    Vehicle() {
        this(10);
    }

    Vehicle(int x) {
        this.x =  x;
    }

}

public class Car extends Vehicle {
    int y;

    Car() {
        super();
        //this(20); // line n2 compilation error
    }

    Car(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return super.x + ":" + this.y;
    }

    public static void main(String[] args) {
        Vehicle y = new Car();
        System.out.println(y);
    }
}
