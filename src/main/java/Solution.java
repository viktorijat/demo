import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {


    private static int findFirstBiggerThanOneDifference(List<Integer> array) {

        for (int i = 0; i < array.size() - 1; i++) {
            if (array.get(i + 1) - array.get(i) > 1) {
                return array.get(i);
            }
        }
        return array.get(array.size() - 1);
    }


    private static List<Integer> removeNegatives(List<Integer> array) {
        return array.stream().filter(p -> p > 0).collect(Collectors.toList());
    }

    private static List<Integer> toList(int[] array) {
        if (array.length == 0) {
            return Collections.emptyList();
        }
        List<Integer> newArray = new ArrayList<>();
        for (int anArray : array) {
            newArray.add(anArray);
        }
        return newArray;
    }

    private static Integer handleOneElement(List<Integer> numbers) {
        if (numbers.size() > 1) {
            return null;
        }
        Integer firstElement = numbers.get(0);
        if (firstElement == 0 || firstElement < 0 || firstElement > 1) {
            return 1;
        }
        return firstElement + 1;
    }

    private static int solution(int[] A) {

        List<Integer> numbers = toList(A);

        if (!numbers.contains(1)) {
            return 1;
        }

        numbers = removeNegatives(numbers);

        if (numbers.isEmpty()) {
            return 1;
        }
        Integer returnValueIfOneElement = handleOneElement(numbers);
        if (returnValueIfOneElement != null) {
            return returnValueIfOneElement;
        }

        Collections.sort(numbers);
        int smallestElementWithAGap = findFirstBiggerThanOneDifference(numbers);
        return smallestElementWithAGap + 1;
    }

    public static void main(String[] args) {

        System.out.println("\n" + solution(new int[]{2}));
    }
}