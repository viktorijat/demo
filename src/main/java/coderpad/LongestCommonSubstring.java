package coderpad;

import java.util.HashMap;
import java.util.Map;

public class LongestCommonSubstring {


    private static Map<String, Integer> addNewEntry(char currentChar, int count, Map<String, Integer> subStrings) {

        String thisChar = String.valueOf(currentChar);
        if (!subStrings.containsKey(thisChar)) {
            subStrings.put(String.valueOf(currentChar), count);
        } else {
            if (subStrings.keySet().contains(thisChar)) {
                if (count > subStrings.get(thisChar)) {
                    subStrings.replace(thisChar, count);
                }
            }
        }
        return subStrings;
    }

    private static Map<String, Integer> findSubstrings(String inputString) {

        char[] chars = inputString.toCharArray();
        Map<String, Integer> subStrings = new HashMap<>();

        for (int i = 0; i < chars.length; i++) {
            char currentChar = chars[i];
            int count = 1;
            if (i == chars.length - 1) {
                subStrings = addNewEntry(chars[i], 1, subStrings);
                continue;
            }
            if (chars[i] != chars[i + 1]) {
                subStrings = addNewEntry(chars[i], 1, subStrings);
                continue;
            }
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[j] == currentChar) {
                    count++;
                }
            }
            subStrings = addNewEntry(chars[i], count, subStrings);
        }
        return subStrings;
    }

    private static String findLongestCommonSubstring(String word1, String word2) {

        Map<String, Integer> word1SubStrings = findSubstrings(word1);
        Map<String, Integer> word2SubStrings = findSubstrings(word2);

        System.out.println(word1SubStrings.entrySet());
        System.out.println(word2SubStrings.entrySet());

        String longest = "";
        Integer count = 0;

        for (Map.Entry<String, Integer> entry : word1SubStrings.entrySet()) {
            if (word2SubStrings.containsKey(entry.getKey())) {
                if (entry.getValue().equals(word2SubStrings.get(entry.getKey()))) {
                    if (count < entry.getValue()) {
                        longest = entry.getKey();
                    }
                }
            }
        }

        return longest;
    }


    public static void main(String[] args) {
        System.out.println(findLongestCommonSubstring("abcccde", "becccdefffff"));
    }
}
