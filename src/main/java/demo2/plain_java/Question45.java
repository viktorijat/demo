package demo2.plain_java;

public class Question45 {

    public static void main(String[] args) {
        System.out.println("String main " + args[0]);
    }

    public static void main(Object[] args) {
        System.out.println("String main " + args[0]);
    }

    public static void main(int[] args) {
        System.out.println("String main " + args[0]);
    }

    // args: 1 2 3

    // String main 1
}
