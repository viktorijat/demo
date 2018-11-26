package demo2.plain_java;

import java.util.ArrayList;
import java.util.List;

public class TestPlainJava {

    public static void main(String[] args) {
        //question14();
        //question16();
        //question19();
        //question41();
        //question48();
        //question49();
        question50();
        //question81();
        //question78();
    }

    private static void question78() {
        String ta = "A ";
        ta = ta.concat("B ");
        String tb = "C ";
        System.out.println("1 " + ta);
        ta = ta.concat(tb);
        System.out.println("2 " + ta);
        ta.replace('C', 'D');
        ta = ta.concat(tb);
        System.out.println("3 " + ta);
    }

    private static void question81() {
        String[][] shirts = new String[2][2];
        shirts[0][0] = "red";
        shirts[0][1] = "blue";
        shirts[1][0] = "small";
        shirts[1][1] = "medium";

        for (int index = 0; index < 2; ) {
            for (int idx = 0; idx < 2; ) {
                System.out.print(shirts[index][idx] + ":");
                idx++;
            }
            index++;
        }
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
            System.out.print("Hello");
        } else {
            System.out.print("Welcome");
        }
        System.out.print(" Log " + x + ":" + y);


//        Welcome
//        Log 2:1
    }

    private static void question48() {
        Short s1 = 200;
        Integer s2 = 400;
        Long s3 = (long) s1 + s2; // line n1
        //String s4 = (String) (s3 * s2); // line n2
        // compilation fails Inconvertible types; cannot cast 'long' to 'java.lang.String'
    }

    private static void question41() {

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

    private static void question19() {

        String[] arr = {"A", "B", "C", "D"};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i].equals("C")) {
                continue;
            }
            System.out.println("work done");
            break;
        }

        // A work done
    }

    private static void question16() {

        int[] array = new int[2];
        array[0] = 10;
        array[1] = 20;
        System.out.println(array[0] + ":" + array[1]);

    }

    private static void question14() {

        StringBuilder sb1 = new StringBuilder("Duke");

        String str1 = sb1.toString();

        String str2 = str1;

        System.out.println(str1 == str2);
    }
}
