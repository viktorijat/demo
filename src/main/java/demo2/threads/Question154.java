package demo2.threads;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class Question154 implements Runnable {

    String fName;

    public Question154(String fName) {
        this.fName = fName;
    }

    @Override
    public void run() {
        System.out.println(fName);
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        ExecutorService executor = Executors.newCachedThreadPool();
        Stream<Path> listOfFiles = Files.walk(Paths.get("Java_Projects"));
        listOfFiles.forEach(line -> {
            executor.execute(new Question154(line.getFileName().toString())); // line n1
        });
        executor.shutdown();
        executor.awaitTermination(5, TimeUnit.DAYS);
    }

//    Java_Projects
//    a.txt
//            b
//    bb.txt

//    The program prints files names concurrently
}
