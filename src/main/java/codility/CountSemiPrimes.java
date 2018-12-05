package codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountSemiPrimes {

    private static boolean isSemiPrime(int number) {
        int cnt = 0;
        for (int i = 2; cnt < 2 && i * i <= number; i++) {
            while (number % i == 0) {
                number /= i;
                cnt++;
            }
        }
        if (number > 1) {
            ++cnt;
        }
        return cnt == 2;
    }

    private static int[] solution(int N, int[] P, int[] Q) {

        List<List<Integer>> semiPrimes = new ArrayList<>();
        for (int i = 0; i < P.length; i++) {
            if (1 <= P[i] && P[i] <= Q[i] && Q[i] <= N) {
                List<Integer> range = new ArrayList<>();
                IntStream.rangeClosed(P[i], Q[i]).forEach(n -> {
                    if (isSemiPrime(n)) range.add(n);
                });
                semiPrimes.add(range);
            }
        }

        List<Long> collected = semiPrimes.stream().map(n -> (long) n.size()).collect(Collectors.toList());
        return collected.stream().mapToInt(Long::intValue).toArray();
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution(26, new int[]{1, 4, 16}, new int[]{26, 10, 20})));
    }
}
