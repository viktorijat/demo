package codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BinaryGap {

    private static Integer solution(Integer number) {

        String binaryNumber = Integer.toBinaryString(number);
        List<String> binaryList = new ArrayList<>(Arrays.asList(binaryNumber.split("")));
        System.out.println(binaryList);
        List<Integer> counter = findSubLists(binaryList);
        return counter.stream().max(Comparator.comparing(a -> a)).orElse(0);
    }

    private static List<Integer> findSubLists(List<String> binaryList) {
        List<Integer> counter = new ArrayList<>();
        for (int i = 0; i < binaryList.size(); i++) {
            if (binaryList.get(i).equals("1")) {
                continue;
            }
            if (binaryList.get(i).equals("0")) {
                Integer countZeros = 1;
                for (int j = i + 1; j < binaryList.size(); j++) {
                    if (binaryList.get(j).equals("1")) {
                        counter.add(countZeros);
                        i = j;
                        break;
                    } else {
                        countZeros++;
                        if (j == binaryList.size() - 1) {
                            break;
                        }
                    }
                }
            }
        }
        return counter;
    }


    public static void main(String[] args) {
        System.out.println(solution(-23));
    }
}