package coderpad;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShopItems {

    private static List<List<Integer>> cheapestPriceIntervals(List<List<Integer>> prices) {

        List<List<Integer>> intervals = new ArrayList<>();

        for (int i = 0; i < prices.size(); i++) {

            List<Integer> currentInterval = prices.get(i);
            List<Integer> nextInterval = prices.get(i + 1);

            if (currentInterval.get(1) < nextInterval.get(0)) {
                continue;
            } else {

                if (currentInterval.get(2) > nextInterval.get(2)) {
                    //List<Integer> newInterval
                }
            }
        }


        return intervals;
    }

    public static void main(String[] args) {

        List<List<Integer>> prices = new ArrayList<>();

        prices.add(Arrays.asList(0, 5, 5));
        prices.add(Arrays.asList(2, 8, 3));
        prices.add(Arrays.asList(7, 11, 10));

        System.out.println(cheapestPriceIntervals(prices));
    }
}
