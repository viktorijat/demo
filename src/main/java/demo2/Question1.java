package demo2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Question1 {

    String techName;
    Question1(String techName) {
        this.techName=techName; }

    public static void main(String[] args) {
        List<Question1> tech = Arrays.asList (
                new Question1("Java-"),
                new Question1("Oracle DB-"),
                new Question1("J2EE-")
        );

        Stream<Question1> stre = tech.stream();
        stre.map(a -> a.techName).forEach(System.out::print);

        //line n1
    }
}




