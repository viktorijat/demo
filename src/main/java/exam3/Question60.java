package exam3;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Question60 {

    private AtomicInteger x = new AtomicInteger();

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Question60 p = new Question60();

        ExecutorService executor = Executors.newFixedThreadPool(2);
        Callable<Integer> c = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return p.x.accumulateAndGet(3, (a, b) -> a + b);

                // se vika 2 pari ori ima nThreads 2
                // 3 * 2 = 6
            }
        };

        executor.submit(c).get();
        executor.submit(c).get();
        System.out.println(p.x.get());
        executor.shutdown();
    }
}
