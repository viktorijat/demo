package demo2.plain_java;

public class Question32 {

    static boolean isAvailable = false;

    public static boolean doStuff() {
        return !isAvailable;
    }

    public static void main(String[] args) {
        Question32 ts = new Question32();
        System.out.print(isAvailable + " ");
        isAvailable = ts.doStuff();
        System.out.print(isAvailable);
    }

    // false true
}
