package demo2.functional_interfaces;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Emp107 {

    String fName;
    String lName;

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public Emp107(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    @Override
    public String toString() {
        return "Emp107{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                '}';
    }
}

public class Question107 {

    public static void main(String[] args) {
        List<Emp107> emp = Arrays.asList(
                new Emp107("John", "Smith"),
                new Emp107("Peter", "Sam"),
                new Emp107("Thomas", "Wale"));

        List<Emp107> sorted = emp.stream()
                // line n1
                .sorted(Comparator.comparing(Emp107::getfName).reversed().thenComparing(Emp107::getlName))

        .collect(Collectors.toList());

        System.out.println(sorted.toString());

        // Emp107{fName='Thomas', lName='Wale'},
        // Emp107{fName='Peter', lName='Sam'},
        // Emp107{fName='John', lName='Smith'}
    }
}
