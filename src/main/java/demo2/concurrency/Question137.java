package demo2.concurrency;

import java.util.concurrent.CyclicBarrier;

class Worker extends Thread {

    CyclicBarrier cb;

    public Worker(CyclicBarrier cb) {
        this.cb = cb;
    }

    public void run() {
        try {
            cb.await();
            System.out.println("worker...");
        } catch (Exception e) {}
    }
}

class Master extends Thread { //line n1

    public void run() {
        System.out.println("master...");
    }

}

public class Question137 {

    public static void main(String[] args) {
        Master master = new Master();

        //line n2
        CyclicBarrier cb = new CyclicBarrier(1, master);

        Worker worker = new Worker(cb);
        worker.start();
    }

}

//master...
//worker...