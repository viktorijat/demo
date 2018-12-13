package coderpad;

public class ChildStairs {

    // A recursive function used by countWays
    private static int countWays(int n) {
        int[] res = new int[n + 1];
        res[0] = 1;
        res[1] = 1;
        res[2] = 2;

        for (int i = 3; i <= n; i++) {
            res[i] = res[i - 1] + res[i - 2] + res[i - 3];
        }

        return res[n];
    }

    // Returns count of ways to reach
    // n-th stair using 1 or 2 or 3 steps.
    private static int findStep(int n) {
        if (n == 1 || n == 0)
            return 1;
        else if (n == 2)
            return 2;

        else
            return findStep(n - 3) +
                    findStep(n - 2) +
                    findStep(n - 1);
    }

    public static void main(String argc []) {
        System.out.println(countWays(4));
        System.out.println(findStep(4));
    }
}



/*
A child wants to climb a staircase. It can climb up to 3 step at once.
Calculate the amount of permutations that are possible to the amount of steps the kid has to take
Example:

Input is 3
1 1 1
2 1
1 2
3
The answer for 3 is 4.



Input is 4
1 1 1 1
1 1 2
1 2 1
2 1 1
1 3
3 1
4

When the input is 4, the answer is 7.
 */