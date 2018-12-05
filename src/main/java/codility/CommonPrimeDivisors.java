package codility;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CommonPrimeDivisors {

    private static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static List<Integer> primeDivisors(int number) {
        return IntStream.range(2, number).filter(n -> number % n == 0)
                .filter(CommonPrimeDivisors::isPrime).boxed().collect(Collectors.toList());
    }

    private static int solution(int[] A, int[] B) {

        int count = 0;
        for (int i = 0; i < A.length; i++) {
            List<Integer> aPrimes = primeDivisors(A[i]);
            List<Integer> bPrimes = primeDivisors(B[i]);
            if (!aPrimes.isEmpty() && !bPrimes.isEmpty()) {
                if (Arrays.equals(primeDivisors(A[i]).toArray(), primeDivisors(B[i]).toArray())) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(solution(new int[]{15, 10, 3}, new int[]{75, 30, 5}));
    }


}
