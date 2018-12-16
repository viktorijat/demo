package coderpad;

public class PalindromeNumber {

    private static boolean isPalindrome(int number) {


        int reverse = 0;
        int palindrome = number;
        while (palindrome > 0) {
            int remaining = palindrome % 10;
            reverse = reverse * 10 + remaining;
            palindrome = palindrome / 10;
        }
        return reverse == number;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(456654));
    }
}
