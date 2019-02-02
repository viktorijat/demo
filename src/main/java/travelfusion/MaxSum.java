package travelfusion;

import java.util.*;
import java.util.stream.Collectors;

public class MaxSum {

    private static int findMaxSum(List<Integer> list) {

        List<Integer> listWithoutDuplicates = new ArrayList<>(new HashSet<>(list));
        listWithoutDuplicates.sort(Collections.reverseOrder());
        return listWithoutDuplicates.get(0) + listWithoutDuplicates.get(1);
    }

    private static List<Integer> removeNegativeNumbers(List<Integer> list) {
        list = list.stream().filter(i -> i > 0).collect(Collectors.toList());
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(-5, 9, 7, 11, 11);
        list = removeNegativeNumbers(list);
        if (list.isEmpty()) {
            System.out.println(0);
        } else if (list.size() == 1) {
            System.out.println(list.get(0));
        } else {
            System.out.println(findMaxSum(list));
        }
    }
}