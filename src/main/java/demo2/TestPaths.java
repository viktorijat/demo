package demo2;

import java.nio.file.Path;
import java.nio.file.Paths;

public class TestPaths {

    public static void main(String[] args) {
        test1();
    }

    private static void test1() {

        Path path1 = Paths.get("/app/./sys/");
        Path res1 = path1.resolve("log");
        Path path2 = Paths.get("/server/exe/");
        Path res2 = path2.resolve("/readme/");
        System.out.println(res1);
        System.out.println(res2);

        // /app/./sys/log
        // /readme
    }
}
