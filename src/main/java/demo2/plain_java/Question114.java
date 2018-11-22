package demo2.plain_java;

public class Question114<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        Question114<String> type = new Question114<>();
        Question114 type1 = new Question114(); // line n1
        type.setT("Java");
        type1.setT(100);
        System.out.println(type.getT() + ":" + type1.getT());

        // Java:100
    }
}
