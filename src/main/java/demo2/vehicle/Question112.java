package demo2.vehicle;

import java.util.Set;
import java.util.TreeSet;

class Vehicle112 {

    int vno;
    String name;

    public Vehicle112(int vno, String name) {
        this.vno = vno;
        this.name = name;
    }

    @Override
    public String toString() {
        return vno + ":" + name;
    }
}

public class Question112 {

    public static void main(String[] args) {

        Set<Vehicle112> vehicles = new TreeSet<>();
        vehicles.add(new Vehicle112(10123, "Ford"));
        vehicles.add(new Vehicle112(10124, "BMW"));
        System.out.println(vehicles);

        // Exception in thread "main" java.lang.ClassCastException: demo2.plain_java.Vehicle112 cannot be cast to java.lang.Comparable
    }

}
