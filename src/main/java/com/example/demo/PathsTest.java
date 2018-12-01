package com.example.demo;


import java.nio.file.Path;
import java.nio.file.Paths;

public class PathsTest {

    public static void main(String[] args) {
        relativize();
        resolve();
    }

    private static void resolve() {

        Path p = Paths.get("/a/../b/");
        Path p2 = Paths.get("/c/../d/");
        Path p3 = p.resolve(p2);
        System.out.println("p3: " + p3);  // /c/../d

        Path q = Paths.get("/a/../b");
        Path q2 = Paths.get("/c/../d/");
        Path q3 = q.resolve(q2);
        System.out.println("q3: " + q3); // /c/../d

//        Path k = Paths.get("/a/../b/");
//        Path k2 = Paths.get("c/../d/");
//        Path k3 = k.relativize(k2);
//        System.out.println("k3: " + k3); // java.lang.IllegalArgumentException: 'other' is different type of Path

        Path m = Paths.get("/a/./b");
        Path m2 = Paths.get("/c/./d");
        Path m3 = m.resolve(m2);
        System.out.println("m3: " + m3); // /c/./d

    }

    private static void relativize() {

        Path p = Paths.get("/a/../b/");
        Path p2 = Paths.get("/c/../d/");
        Path p3 = p.relativize(p2);
        System.out.println("p3: " + p3);  // ../../../c/../d

        Path q = Paths.get("/a/../b");
        Path q2 = Paths.get("/c/../d/");
        Path q3 = q.relativize(q2);
        System.out.println("q3: " + q3); // ../../../c/../d

//        Path k = Paths.get("/a/../b/");
//        Path k2 = Paths.get("c/../d/");
//        Path k3 = k.relativize(k2);
//        System.out.println("k3: " + k3); // java.lang.IllegalArgumentException: 'other' is different type of Path

        Path m = Paths.get("/a/./b");
        Path m2 = Paths.get("/c/./d");
        Path m3 = m.relativize(m2);
        System.out.println("m3: " + m3); // ../../../c/./d
    }
}
