package travelfusion;

import java.util.*;
import java.util.stream.Collectors;

public class UniqueNumbers {

    public static Collection<Integer> findUniqueNumbers(Collection<Integer> numbers) {

        Map<Integer, Integer> appearences = new HashMap<>();
        for (int number : numbers) {
            appearences.put(number, Collections.frequency(numbers, number));
        }
        return appearences.entrySet().stream().filter(i -> i.getValue() == 1)
                .map(Map.Entry::getKey).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Collection<Integer> numbers = Arrays.asList(1, 2, 1, 3);
        for (int number : findUniqueNumbers(numbers))
            System.out.println(number);
    }
}
