package demo2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

class Man implements Comparable<Man> {

    String firstName;
    String lastName;

    public Man(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int compareTo(Man n) {
        if (firstName.compareTo(n.firstName) == 0) {
            return lastName.compareTo(n.lastName);
        }
        return firstName.compareTo(n.firstName);
    }

    @Override
    public String toString() {
        return "Man{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

public class OrderLists {

    public static void main(String[] args) {

        List<Man> people = new ArrayList<>();
        people.add(new Man("a", "a"));
        people.add(new Man("a", "b"));
        people.add(new Man("a", "c"));
        people.add(new Man("b", "d"));
        people.add(new Man("b", "a"));
        people.add(new Man("c", "a"));
        people.add(new Man("c", "q"));
        people.add(new Man("c", "d"));

//        Collections.sort(people);

        people.sort(Comparator.comparing(Man::getFirstName).reversed().thenComparing(Man::getLastName));
        System.out.println(people);
    }
}
