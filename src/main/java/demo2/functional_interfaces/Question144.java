package demo2.functional_interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Emp {
    private String eName;
    private Integer eAge;

    public Emp(String eName, Integer eAge) {
        this.eName = eName;
        this.eAge = eAge;
    }

    public String geteName() {
        return eName;
    }

    public Integer geteAge() {
        return eAge;
    }
}

public class Question144 {

    public static void main(String[] args) {

        List<Emp> li = Arrays.asList(new Emp("Sam", 20), new Emp("John", 60), new Emp("Jim", 51));
        Predicate<Emp> agVal = s -> s.geteAge() > 50; // line n1
        li = li.stream().filter(agVal).collect(Collectors.toList());
        Stream<String> names = li.stream().map(Emp::geteName); // line n2
        names.forEach(System.out::println);

    }
}

//John
//Jim