package demo2.plain_java;

import demo2.plain_java.question29.Shirt;
import java.util.ArrayList;
import java.util.List;

public class TestPlainJava {

    public static void main(String[] args) {
        //test1();
        //test2();
        //test3();
        //question42();
        //question48();
        //question49();
        question50();
    }

    private static void question50() {
        StringBuilder sb = new StringBuilder(5);
        String s = "";

        if (sb.equals(s)) { // Suspicious call 'equals' on 'StringBuilder'
            System.out.println("match 1");
        } else if (sb.toString().equals(s.toString())) {
            System.out.println("match 2");
        } else {
            System.out.println("no match");
        }

        // match 2
    }

    private static void question49() {
        int x = 1;
        int y = 0;
        if (x++ > ++y) {
            System.out.println("Hello");
        } else {
            System.out.println(x + " - " + y);
            System.out.println("Welcome");
        }
        System.out.println("Log " + x + ":" +  y);


//        Welcome
//        Log 2:1
    }

    private static void question48() {
        Short s1 = 200;
        Integer s2 = 400;
        Long s3 = (long) s1 + s2; // line n1
        // String s4 = (String) (s3 * s2); // line n2
        // compilation fails Inconvertible types; cannot cast 'long' to 'java.lang.String'
    }

    private static void question42() {

        List colors = new ArrayList();
        colors.add("green");
        colors.add("red");
        colors.add("blue");
        colors.add("yellow");
        colors.remove(2);
        colors.add(3, "cyan");
        System.out.println(colors);

        // [green, red, yellow, cyan]
    }

    private static void test3() {

        String[] arr = {"A", "B", "C", "D"};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] = " ");
            if (arr[i].equals("C")) {
                continue;
            }
            System.out.println("work done");
            break;
        }

        // A work done
    }

    private static void test2() {

        int[] array = new int[2];
        array[0] = 10;
        array[1] = 20;
        System.out.println(array[0] + ":" + array[1]);

    }

    private static void test1() {
        StringBuilder sb1 = new StringBuilder("Duke");
        String str1 = sb1.toString();
        String str2 = str1;
        System.out.println(str1 == str2);
    }
}
