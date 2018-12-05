package codility;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MinMaxDivision {

    private static boolean isGreaterThanM(int limit, List<Integer> numbers) {
        return numbers.stream().allMatch(n -> n <= limit);
    }

    private static int solution(int K, int M, int[] A) {

        List<Integer> numbers = Arrays.stream(A).boxed().collect(Collectors.toList());
        if (isGreaterThanM(M, numbers) || numbers.isEmpty()) {
            return 0;
        }
        int maxSum = numbers.stream().mapToInt(Integer::intValue).sum();


        return 0;
    }



    public static void main(String[] args) {
        System.out.println(solution(3, 5, new int[]{2, 1, 5, 1, 2, 2, 2}));
    }


}
