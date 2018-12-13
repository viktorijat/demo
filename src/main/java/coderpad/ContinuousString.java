package coderpad;

// Given an input string, divide it into substrings where each substring contains the longest
// continuous string of the same character and output a string with the character for each
// substring and the length of the respective substring


public class ContinuousString {

    private static String findLength(String inputString) {

        char[] chars = inputString.toCharArray();
        StringBuilder occurrences = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {
            if (occurrences.toString().contains(String.valueOf(chars[i]))) {
                continue;
            }
            char currentChar = chars[i];
            int count = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[j] == currentChar) {
                    count++;
                }
            }
            occurrences.append(currentChar).append(count);
        }
        return occurrences.toString();
    }

    public static void main(String[] args) {

        System.out.println(findLength("aaabbbcddabc"));
    }
}
