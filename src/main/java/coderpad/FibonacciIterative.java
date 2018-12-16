package coderpad;

public class FibonacciIterative {

    private static int fibonacci(int num) {

        int prev = 0, next = 1;
        for (int i = 0; i < num; i++) {
            int temp = next;
            next += prev;
            prev = temp;
        }
        return prev;
    }

    public static void main(String[] args) {

        int x = 5;
        for (int i = 1; i < x; i ++) {
            System.out.println(fibonacci(i));
        }
    }
}
