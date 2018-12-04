public class Pairing {


    private static int solution(int[] ints) {

        for (int i = 0; i < ints.length; i ++) {

            boolean foundPair = false;
            for (int j = i + 1; j < ints.length; j++) {
                if (ints[i] == ints[j]) {
                    foundPair = true;
                }
            }
            if (!foundPair) {
                return ints[i];
            }
        }

        return ints[0];
    }



    public static void main(String[] args) {
        System.out.println(solution(new int[]{9, 3, 9, 3, 9, 7, 9}));
    }


}
