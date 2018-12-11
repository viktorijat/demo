package codility;

import java.util.*;
import java.util.stream.Stream;

public class Plane {

    enum Seats {
        A(1), B(2), C(3), D(4), E(5), F(6), G(7), H(8), J(9), K(10);

        private int value;

        Seats(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

    }

    private static int findSeat(String letter) {
        return Seats.valueOf(letter).getValue();
    }

    private static int[][] assignTakenSeats(int n, String s) {
        int[][] s1 = new int[n][10];

        if (s.equals("")) {
            return s1;
        }

        List<String> taken = new ArrayList<>(Arrays.asList(s.split(" ")));
        for (String takenSeat : taken) {
            int letterOrder = findSeat(String.valueOf(takenSeat.charAt(1)));
            s1[Integer.parseInt(String.valueOf(takenSeat.charAt(0))) - 1][letterOrder - 1] = 1;

        }
        return s1;
    }

    private static int freeSeatsInRow(int[] ints) {

        List<Integer> abc = Arrays.asList(ints[0], ints[1], ints[2]);
        List<Integer> defg = Arrays.asList(ints[3], ints[4], ints[5], ints[6]);
        List<Integer> hjk = Arrays.asList(ints[7], ints[8], ints[9]);

        int count = 0;

        if (abc.stream().allMatch(n -> n == 0)) {
            count++;
        }
        if (hjk.stream().allMatch(n -> n == 0)) {
            count++;
        }
        if (defg.stream().allMatch(n -> n == 0)) {
            count++;
        } else {
            if (defg.stream().filter(n -> n == 1).count() == 1) {
                if (defg.get(1) != 1 && defg.get(2) != 1) {
                    count++;
                }
            }
        }
        return count;
    }

    private static int solution(int N, String S) {

        if (N < 1 && N > 50) {
            return 0;
        }

        int[][] seatingPlan = assignTakenSeats(N, S);

        int freeFamilySeats = 0;
        for (int i = 0; i < N; i++) {
            freeFamilySeats += freeSeatsInRow(seatingPlan[i]);
        }
        return freeFamilySeats;
    }

    public static void main(String[] args) {
        System.out.println(solution(1, ""));
    }
}
