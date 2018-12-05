import java.util.Arrays;

public class CyclicRotation {

    public static int[] solution(int[] A, int K) {

        if (A.length == 0 || A.length == 1 || A.length == K) {
            return A;
        }

        int[] newArray = new int[A.length];
        int count = 0;

        for (int j = A.length - K; j < A.length; j ++) {
            newArray[count] = A[j];
            count++;
        }

        for (int i = 0; i < A.length - K; i++) {
            newArray[count] = A[i];
            count++;
        }

        return newArray;
    }


    public static void main(String[] args) {


        System.out.println(Arrays.toString(solution(new int[]{2}, 2)));
    }
}
