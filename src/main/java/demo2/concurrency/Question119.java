package demo2.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Caller implements Callable<String> {

    String str;
    public Caller(String s) {
        this.str = s;
    }

    @Override
    public String call() throws Exception {
        return str.concat("Caller");
    }
}


class Runner implements Runnable {


    String str;

    public Runner(String str) {
        this.str = str;
    }

    @Override
    public void run() {
        System.out.println(str.concat("Runner"));
    }
}

public class Question119 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService es = Executors.newFixedThreadPool(2);
        Future f1 = es.submit(new Caller("Call "));
        Future f2 = es.submit(new Runner("Run "));

        String str1 = (String) f1.get();
        String str2 = (String) f2.get(); //line n1

        System.out.println(str1 + ":" +  str2);


        // Run Runner
        // Call Caller:null
    }
}
