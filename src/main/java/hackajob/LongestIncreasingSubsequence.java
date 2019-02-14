package hackajob;

import java.util.ArrayList;

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

        int a = findLongestIncreasingSubSequence(new int[]{0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15});
        System.out.println(a);

    }
}
