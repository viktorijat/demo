package demo2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Question2 {

    public static void main(String[] args) throws IOException {
        Path source = Paths.get("question2/green.txt");
        Path destination = Paths.get("question2/colors/yellow.txt");

        Files.move(source, destination, StandardCopyOption.ATOMIC_MOVE);

        //Files.delete(source);
    }
    //bla bla bla

    //FileAlreadyExistsException D
    //NoSuchFileException
}

//RaceCondition123$