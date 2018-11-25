package demo2.plain_java;

public class Question55 {

    static int count = 0;
    int i = 0;

    public void changeCount() {
        while (i < 5) {
            i++;
            count++;
        }
    }

    public static void main(String[] args) {
        Question55 check1 = new Question55();
        Question55 check2 = new Question55();
        check1.changeCount();
        check2.changeCount();
        System.out.println(check1.count + " " +  check2.count);
    }
}
