package exam3;

public class Question20 {

    private static void doPrint(int num) {
        if (num <= 10) {
            System.out.println(num);
            return;
        }
        assert false;
    }

    public static void main(String[] args) {
        try {
            doPrint(1);
            doPrint(5);
            doPrint(7);
            doPrint(11);
        } catch (AssertionError e) {
            System.out.println(10);
        }
    }
}
