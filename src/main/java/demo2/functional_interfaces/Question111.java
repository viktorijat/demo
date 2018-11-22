package demo2.functional_interfaces;

import java.util.Optional;

class Address {
    String city = "New York";

    public String getCity() {
        return city;
    }
    public String toString() {
        return city;
    }

}

class Employee {

    Optional<Address> address;

    public Employee(Optional<Address> address) {
        this.address = address;
    }
}

public class Question111 {

    public static void main(String[] args) {

        Address address = null;
        Optional<Address> address1 = Optional.ofNullable(address);
        Employee e1 = new Employee(address1);
        String eAddress = (address1.isPresent()) ? address1.get().getCity() : "City not available";
        System.out.println(eAddress);

        // City not available
    }
}
