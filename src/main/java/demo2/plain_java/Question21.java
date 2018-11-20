package demo2.plain_java;

public class Question21 {

    public static int stVar = 100;
    public int var = 200;

    @Override
    public String toString() {
        return var + " : " + stVar;
    }

    public static void main(String[] args) {
        Question21 t1 = new Question21();
        t1.var = 300;
        System.out.println(t1);
        Question21 t2 = new Question21();
        t2.stVar = 300;

        System.out.println(t2);

        // 300 : 100
        // 200 : 300
    }
}
