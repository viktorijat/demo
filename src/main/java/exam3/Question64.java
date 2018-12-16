package exam3;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

class SAction extends RecursiveAction {

    String s;

    public SAction(String s) {
        this.s = s;
    }

    @Override
    protected void compute() {
        if (s.length() < 5) {
            System.out.println(s);
        } else {
            invokeAll(new SAction(s.substring(0, s.length()/2)), new SAction(s.substring(s.length()/2, s.length())));
        }
    }
}

public class Question64 {

    public static void main(String[] args) {

        ForkJoinPool fjp = new ForkJoinPool();
        SAction a = new SAction("Hello world");
        fjp.invoke(a);
    }
}
