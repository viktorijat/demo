package demo2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestBufferedReader {

    public static void main(String[] args) throws IOException {

        test1();

    }

    private static void test1() throws IOException {

        BufferedReader brCopy = null;
        try (BufferedReader br = new BufferedReader (new FileReader("employee.txt"))) { //n1
            br.lines().forEach(c -> System.out.println(c));
            brCopy = br;
        }
        brCopy.ready(); //Exception in thread "main" java.io.IOException: Stream closed
        //navodno e compile error na n1
    }
}
