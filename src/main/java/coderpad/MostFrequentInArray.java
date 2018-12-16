package coderpad;

import java.util.Arrays;
import java.util.List;

public class MostFrequentInArray {

    private static Integer mostFrequent(List<Integer> array) {

        Integer mostFrequent = null;
        int count = 0;

        for (int i = 0; i < array.size(); i++) {
            int countThisElement = 0;
            for (Integer anArray : array) {
                if (array.get(i).equals(anArray)) {
                    countThisElement++;
                }
            }
            if (countThisElement > count) {
                mostFrequent = array.get(i);
                count = countThisElement;
            }
        }
        return mostFrequent;
    }

    public static void main(String[] args) {
        System.out.println(mostFrequent(Arrays.asList(1, 2, 4, 4, 4, 3, 2)));
    }
}
