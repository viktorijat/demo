package demo2;

public class Risk {

    public static void main(String[] args) {

        String a = "2.0";

        String b = "Risk (";

        int c = (int) Double.parseDouble(a);

        String d = b + String.valueOf(c) + ")";

        System.out.println(d);

    }
}
