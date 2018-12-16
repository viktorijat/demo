package exam3;

import java.util.concurrent.CyclicBarrier;

class Worker extends Thread {
    private final CyclicBarrier cb;
    private final int a;

    public Worker (CyclicBarrier cb, int a) {
        this.cb = cb;
        this.a = a;
    }

    public void run() {
        try {
            cb.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("CL" + a);
    }
}

public class Question50 {

    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(2);
        Worker w1 = new Worker(cb, 1);
        w1.start();
        Worker w2 = new Worker(cb, 3);
        w2.start();
    }

//    CL1
//    CL3
}
