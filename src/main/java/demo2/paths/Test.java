package demo2.paths;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) throws IOException {

        question130();
        //question113();
        //question112();
    }

    private static void question112() throws IOException {

        System.out.println(System.getProperty("user.home")); // /Users/toshevav
        Stream<Path> files = Files.walk(Paths.get(System.getProperty("user.home")));

        files.forEach(fName -> {
            try {
                Path aPath = fName.toAbsolutePath(); // line n2
                System.out.println(fName + ":" + Files.readAttributes(aPath, BasicFileAttributes.class).creationTime());
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        // All files and directories under the home directory are listed along with their attributes
    }

    private static void question113() {

        int i;
        char c;

        try (FileInputStream fis = new FileInputStream("question113/course.txt");
             InputStreamReader isr = new InputStreamReader(fis);) {
            while (isr.ready()) { //line n1
                isr.skip(2);
                i = isr.read();
                c = (char) i;
                System.out.print(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // ueJa

        // sekoa treta ustravri ja cita

        // ako e skip 3 kje bide r:a

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
