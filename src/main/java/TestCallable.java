import demo2.threads.Question153;

import java.util.concurrent.*;

class TestRunnable implements Runnable {

    String str;

    public TestRunnable(String str) {
        this.str = str;
    }

    @Override
    public void run() {
        System.out.println(str);
    }
}


class TestCallable implements Callable<String> {

    String str;

    public TestCallable(String str) {
        this.str = str;
    }

    @Override
    public String call() throws Exception {
        return str.concat("Call");
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService es = Executors.newFixedThreadPool(2); // line n1

        Callable c = new TestCallable("call1");
        Future f1 = es.submit(c);
        Future f2 = es.submit(new TestRunnable("Run"));
        String str = f1.get().toString();
        //String str2 = f2.get();
        System.out.println(str);

    }
}
