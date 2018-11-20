package demo2.plain_java;

public class Question27 {

    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        int k = j += i/5;

        System.out.println(i + " : " + j + " : " + k);

        // 10 : 22 : 22
    }
}
