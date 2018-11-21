package demo2.plain_java;

public class Question44 {

    int x, y;

    public Question44(int x, int y) {
        initialize(x, y);
    }

    public void initialize(int x, int y) {
        this.x = x * x;
        this.y = y * y;
    }

    public static void main(String[] args) {
        int x = 3, y = 5;
        Question44 obj = new Question44(x, y);
        System.out.println(x + " " +  y);

        // 3 5
    }
}
