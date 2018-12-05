package codility;

import java.util.Arrays;

public class CountNotDivisible {

    private static int[] solution(int[] A) {

        if (A.length == 0) {
            return A;
        }
        int[] divisorsInt = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            int divisorsCount = 0;
            for (int j = 0; j < A.length; j++) {
                if (A[j] == 0) {
                    continue;
                }
                if (A[i] % A[j] != 0) {
                    divisorsCount++;
                }
            }
            divisorsInt[i] = divisorsCount;
        }
        return (divisorsInt);
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{-3, 1, -2, 3, 0})));
    }


}
