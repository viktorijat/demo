package demo2.paths;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {

        question130();
    }

    private static void question130() {

        Stream<Path> paths = Stream.of(
                Paths.get("question130/data.txt"),
                Paths.get("question130/data.xml"));

        paths.filter(s -> s.toString().endsWith("txt")).forEach(
                s -> {
                    try {
                        Files.readAllLines(s).stream().forEach(System.out::println); // line n1
                    } catch (IOException e) {
                        System.out.println("Exception");
                    }

                }
        );

        //Exception
    }
}
