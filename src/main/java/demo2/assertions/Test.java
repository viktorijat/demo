package demo2.assertions;

public class Test {

    public static void main(String[] args) {

        question87();
    }

    private static void question87() {

        int a = 10;
        int b = -1;

        assert (b >= 1): "Invalid denominator";
        int c = a/b;
        System.out.println(c);
    }
}

// Exception in thread "main" java.lang.AssertionError: Invalid denominator