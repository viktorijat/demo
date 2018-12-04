import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class BinaryGap {

    private static Integer solution(Integer number) {

        String binaryNumber = Integer.toBinaryString(number);
        List<String> binaryList = new ArrayList<>(Arrays.asList(binaryNumber.split("")));
        System.out.println(binaryList);

        List<Integer> counter = new ArrayList<>();

        for (int i = 0; i < binaryList.size(); i++) {

            if (binaryList.get(i).equals("1")) {
                continue;
            }
            if (binaryList.get(i).equals("0")) {
                Integer countZeros = 1;
                for (int j = i + 1; j < binaryList.size() - 1; j++) {
                    if (binaryList.get(j).equals("1")) {
                        counter.add(countZeros);
                        break;
                    } else {
                        countZeros++;
                    }
                }

//                while (binaryList.get(i).equals("0")) {
//                    countZeros++;
//                    i++;
//                }
//                counter.add(countZeros);
//                countZeros = 0;


//                for (int j = i + 1; j < binaryList.size(); j++) {
//                    if (binaryList.get(j).equals("0")) {
//                        countZeros++;
//                    } else {
//                        counter.add(countZeros);
//                        System.out.println("last counter: " + counter.get(counter.size() - 1));
//                        break;
//                    }
//                }
            }

        }

        System.out.println(counter);


        return 1;
    }


    public static void main(String[] args) {

        System.out.println(solution(1234));
    }


}
