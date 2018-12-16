package coderpad;

public class PalindromeString {

    private static boolean isPalindrome(String word) {

        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            System.out.println(chars[i] + " " + chars[chars.length - i - 1]);
            if (!(chars[i] == chars[chars.length - i - 1])) {
                return false;
            }
        }


        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("abcgcba"));
    }
}
