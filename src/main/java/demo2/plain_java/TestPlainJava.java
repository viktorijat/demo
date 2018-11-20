package demo2.plain_java;

public class TestPlainJava {

    public static void main(String[] args) {
        //test1();
        //test2();
        test3();
    }

    private static void test3() {

        String[] arr = {"A", "B", "C", "D"};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] = " ");
            if (arr[i].equals("C")) {
                continue;
            }
            System.out.println("work done");
            break;
        }

        // A work done
    }

    private static void test2() {

        int[] array = new int[2];
        array[0] = 10;
        array[1] = 20;
        System.out.println(array[0] + ":" + array[1]);

    }

    private static void test1() {
        StringBuilder sb1 = new StringBuilder("Duke");
        String str1 = sb1.toString();
        String str2 = str1;
        System.out.println(str1 == str2);
    }
}
