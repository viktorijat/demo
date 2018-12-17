package coderpad;

public class PowerOf10 {

    private static boolean isPowerOf10(int number) {

        while (number > 1) {
            if (number % 10 != 0) {
                return false;
            }
            number /= 10;
        }

        return number == 1;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOf10(10001));
    }
}
