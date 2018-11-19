package demo2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class TechName {

    String techName;
    TechName (String techName) {
        this.techName=techName; }

    public static void main(String[] args) {
        List<TechName> tech = Arrays.asList (
                new TechName("Java-"),
                new TechName("Oracle DB-"),
                new TechName("J2EE-")
        );

        Stream<TechName> stre = tech.stream();
        stre.forEachOrdered(a -> System.out.print(a.techName));

        //line n1
    }
}




