package demo2.plain_java;

class Vehicle82 {
    int distance; //line n1

    Vehicle82(int x) {
        this.distance = x;
    }

    public void increSpeed(int time) { //line n2
        int timeTravel = time; //line n3

        class Car {
            int value = 0;
            public void speed() {
                value =  distance / timeTravel;
                System.out.println("Velocity with new speed: " + value + "km/h");
            }
        }
        new Car().speed();
    }
}

public class Question82 {

    public static void main(String[] args) {
         Vehicle82 v = new Vehicle82(100);
         v.increSpeed(60);
    }
}
