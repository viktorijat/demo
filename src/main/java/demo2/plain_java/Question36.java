package demo2.plain_java;

public class Question36 {

    int x;
    int y;

    public void doStuff(int x, int y) {
        this.x = x;
        y = this.y;
    }

    public void display() {
        System.out.print(x + " " + y + " : ");
    }

    public static void main(String[] args) {

        Question36 m1 = new Question36();
        m1.x = 100;
        m1.y = 200;
        Question36 m2 = new Question36();
        m2.doStuff(m1.x, m1.y);
        m1.display();
        m2.display();
    }

    // 100 200 : 100 0 :
}
