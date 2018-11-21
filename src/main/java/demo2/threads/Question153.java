package demo2.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Question153 implements Callable<String> {

    String str;

    public Question153(String str) {
        this.str = str;
    }

    @Override
    public String call() throws Exception {
        return str.concat("Call");
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService es = Executors.newFixedThreadPool(4); // line n1
        Future f1 = es.submit(new Question153("Call"));
        String str = f1.get().toString();
        System.out.println(str);

        // The program prints CallCall and does not terminate.
    }
}
