package hackajob;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";

    private static String getIdentifier(int n) {

        if (n % 5 == 0 && n % 3 == 0) {
            return FIZZ + BUZZ;
        } else if (n % 5 == 0) {
            return BUZZ;
        } else if (n % 3 == 0) {
            return FIZZ;
        } else {
            return String.valueOf(n);
        }
    }

    public static String run(int N, int M) {
        List<String> sequence = new ArrayList<>();

        for (int i = N; i <= M; i++) {
            sequence.add(getIdentifier(i));
        }
        return String.join(",", sequence);
    }

    public static void main(String[] args) {
        run(1, 5);
    }

}
