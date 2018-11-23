package demo2.functional_interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Country {

    public enum Continent {ASIA, EUROPE}

    String name;
    Continent region;

    public Country(String na, Continent reg) {
        name = na;
        region = reg;
    }

    public String getName() {
        return name;
    }

    public Continent getRegion() {
        return region;
    }

}

public class Question96 {

    public static void main(String[] args) {
        List<Country> couList = Arrays.asList (
                new Country ("Japan", Country.Continent.ASIA),
                new Country ("Italy", Country.Continent.EUROPE),
                new Country ("Germany", Country.Continent.EUROPE));

        Map<Country.Continent, List<String>> regionNames = couList.stream()
                .collect(Collectors.groupingBy(Country::getRegion,
                        Collectors.mapping(Country::getName, Collectors.toList())));

        System.out.println(regionNames);

        // {EUROPE=[Italy, Germany], ASIA=[Japan]}
    }
}
