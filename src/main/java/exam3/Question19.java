package exam3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question19 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 3, 1, 1, 9, 5);
        Map<Object, List<Integer>> map = numbers.stream().collect(Collectors.groupingBy(i -> i));

        System.out.println(map.entrySet());

        map.keySet().forEach(o -> {
            map.get(o).forEach(System.out::print);
            System.out.print(" - ");
        });

//        [1=[1, 1], 3=[3], 5=[5, 5], 9=[9]]
//        11 - 3 - 55 - 9 -
    }
}
