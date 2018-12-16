package coderpad;

public class Anagram {

    private static boolean areAnagrams(String word1, String word2) {

        if (word1.length() != word2.length()) {
            return false;
        }

        char[] chars = word1.toCharArray();
        for (char aChar : chars) {
            if (!word2.contains(String.valueOf(aChar))) {
                return false;
            }
            word2 = word2.replaceFirst(String.valueOf(aChar), "");
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(areAnagrams("abdc", "cbad"));
    }
}
