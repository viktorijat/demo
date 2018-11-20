package demo2.plain_java;

public class Question31 {

    int a1;

    public static void doProduct(int a) {
        a = a * a;
    }

    public static void doString(StringBuilder s) {
        s.append(" " + s);
    }

    public static void main(String[] args) {
        Question31 item = new Question31();
        item.a1 = 11;
        StringBuilder sb = new StringBuilder("Hello");
        Integer i = 10;
        doProduct(i);
        doString(sb);
        doProduct(item.a1);
        System.out.println(i + " " + sb + " " + item.a1);

        // 10 Hello Hello 11
    }
}
