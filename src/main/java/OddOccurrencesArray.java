import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class OddOccurrencesArray {

    private static int solution2(int[] A) {

        List<Integer> numbers = Arrays.stream(A).boxed().collect(Collectors.toList());
        if (numbers.isEmpty()) {
            return 0;
        }
        if (numbers.size() == 1 || numbers.size() % 2 == 0) {
            return numbers.get(0);
        }

        return numbers.stream().filter(i -> Collections.frequency(numbers, i) == 1).findFirst().orElse(0);
    }

//    private static int solution(int[] A) {
//
//        Map<Integer, Integer> numbersAppearance = new HashMap<>();
//
//        for (int i = 0; i < A.length; i++) {
//            if (!numbersAppearance.containsKey(A[i])) {
//                numbersAppearance.put(A[i], 1);
//                for (int j = i + 1; j < A.length; j++) {
//                    if (A[i] == A[j]) {
//                        int count = numbersAppearance.get(A[i]);
//                        numbersAppearance.replace(A[i], count, count + 1);
//                    }
//                }
//            }
//        }
//        return numbersAppearance.entrySet().stream().filter(n -> n.getValue() == 1)
//                .findFirst().orElse(new AbstractMap.SimpleEntry<>(0, 0)).getKey();
//
//
//    }

    public static void main(String[] args) {
        System.out.println(solution2(new int[]{}));
    }


}
