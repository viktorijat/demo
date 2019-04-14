package hackajob;

import java.util.ArrayList;
import java.util.List;

public class LongestIncreasingSubsequence {


    private static int findLongestIncreasingSubSequence(int[] sequence) {

        if (sequence == null || sequence.length == 0)
            return 0;
        ArrayList<Integer> list = new ArrayList<>();

        for (int num : sequence) {
            if (list.size() == 0 || num > list.get(list.size() - 1)) {
                list.add(num);
            } else {
                int i = 0;
                int j = list.size() - 1;

                while (i < j) {
                    int mid = (i + j) / 2;
                    if (list.get(mid) < num) {
                        i = mid + 1;
                    } else {
                        j = mid;
                    }
                }
                list.set(j, num);
            }
        }
        return list.size();
    }

    public static void main(String[] args) {

//        int a = findLongestIncreasingSubSequence(new int[]{0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15});
//        System.out.println(a);

        String b = findA("AAABBCDDDD");

    }

    private static String findA(String aaabbcdddd) {

        List<String> recurring = new ArrayList<>();
        for (int i = 0; i < aaabbcdddd.length(); i++) {
            char c = aaabbcdddd.charAt(i);
            String sequence = String.valueOf(c);
            for (int j = i + 1; j < aaabbcdddd.length(); j++) {
                char d = aaabbcdddd.charAt(j);
                if (c == d) {
                    sequence = sequence + String.valueOf(d);
                } else {
                    break;
                }
            }
            if (recurring.isEmpty()) {
                recurring.add(sequence);
            } else {
                if (recurring.get(recurring.size() - 1).length() < sequence.length()) {
                    recurring.add(sequence);
                }
            }

        }
        System.out.println(recurring.get(recurring.size() - 1));
        return "";
    }
}
