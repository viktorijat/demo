package coderpad;

// Given an input array of integers and an input integer, k, find the number of
// distinct pairs of integers in the array that add up to k

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DistinctPairs {

    private static List<List<Integer>> findDistinctPairs(int k, int[] ints) {

        List<List<Integer>> distinct = new ArrayList<>();

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == k) {
                continue;
            }

            for (int j = i + 1; j < ints.length; j++) {
                if (ints[i] + ints[j] == k) {
                    List<Integer> summedUp = Arrays.asList(ints[i], ints[j]);
                    List<Integer> summedUpReversed = Arrays.asList(ints[j], ints[i]);
                    if (!distinct.contains(summedUp) && !distinct.contains(summedUpReversed)) {
                        distinct.add(summedUp);
                    }
                }
            }

        }
        return distinct;
    }

    public static void main(String[] args) {
        System.out.println(findDistinctPairs(3, new int[]{1, 2, 1, 5, 3, 7, 2}).toString());
    }
}
