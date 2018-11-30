package demo2.plain_java;

import java.util.ArrayList;
import java.util.Arrays;

public class Test2 {

    public static void main(String[] args) {
        //question77();
        question76("91");
        //question75();
        //question74();
        //question73();
        //question69();

        //String[] arg = {"0", "1", "2", "3"};
        //question67(arg);

        //question66();

//        String[] arg2 = {"TRUE", "null"};
//        questions65(arg2);

        //question59();

    }

    private static void question59() {
        int array[] = {10, 20, 30, 40, 50};
        int x = array.length;

        //line n1
        // treba reverse order

//        do {
//            System.out.println(array[x]);
//            --x;
//        } while (x >= 0);

        while (x > 0) {
            System.out.println(array[--x]);
        }

//        do {
//            x--;
//            System.out.println(array[x]);
//        } while (x >= 0);

//        while (x >= 0) {
//            System.out.println(array[x]);
//            x--;
//        }

        while (x > 0) {
            x--;
            System.out.println(array[x]);
        }
    }

    private static void questions65(String[] args) {
        boolean a = new Boolean(Boolean.valueOf(args[0]));
        boolean b = new Boolean(args[1]);
        Boolean c = new Boolean(null);
        System.out.println(c);
        System.out.println(a + " " + b);

        //true false
        // se so e razlicno od true kje bide false
    }

    private static void question66() {
        int numbers[];
        numbers = new int[2];
        numbers[0] = 10;
        numbers[1] = 20;

        numbers = new int[4];
        numbers[2] = 30;
        numbers[3] = 40;

        for (int x : numbers) {
            System.out.println(" " + x);
        }
    }

    private static void question67(String[] args) {
        String arg1 = args[1];
        String arg2 = args[2];
        String arg3 = args[3];
        System.out.println("Arg is " + arg3);
    }

    private static void question69() {
        float var1 = (12_345.01 >= 123_45.00) ? 12_456 : 124_56.02f;
        float var2 = var1 + 1024;
        System.out.println(var2);
    }

    private static void question73() {
        String s = " Java Duke ";
        int len = s.trim().length();
        System.out.println(len);
    }

    private static void question74() {
        int[] intArr = {8, 16, 32, 64, 128};

        for (int i = 0 ; i < intArr.length; i++) {
            System.out.print(intArr[i] + " ");
        }
    }

    private static void question75() {

        int wd = 0;
        String days[] = {"sun", "mon", "wed", "sat"};

        for (String s : days) {
            switch (s) {
                case "sat":
                case "sun":
                    wd -= 1;
                    break;
                case "mon": wd++;
                case "wed": wd += 2;
            }
        }
        System.out.println(wd);
    }

    private static void question76(String argument) {
        int qty = Integer.parseInt(argument);
        //line n1
        // pogolemo ili ednakvo so 90 -> 0.5
        // megju 80 i 90 -> 0.2

//        double discount1 = 0;
//        discount1 = (qty >= 90) ? 0.5 : 0.2;
//        discount1 = (qty > 80) ? 0.2 : 0.0;
//        System.out.println("discount 1 " + discount1);
//        za 90 -> 0.2

        double discount2 = 0;
        discount2 = (qty >= 90) ? 0.5 : (qty > 80) ? 0.2 : 0;
        System.out.println("discount 2 " + discount2);

        double discount3 = 0;
        if (qty >= 90) { discount3 = 0.5; }
        if (qty > 80 && qty < 90) { discount3 = 0.2; }
        System.out.println("discount 3 " + discount3);

//        double discount4 = 0;
//        discount4 = (qty > 80) ? 0.2 : (qty >= 90) ? 0.5 : 0;
//        System.out.println("discount 4 " + discount4);
//        za 90 -> 0.2

//        double discount5 = 0;
//        if (qty > 80 && qty < 90) {
//            discount5 = 0.2;
//        } else {
//            discount5 = 0;
//        }
//        if (qty >= 90) {
//            discount5 = 0.5;
//        } else {
//            discount5 = 0;
//        }
//        System.out.println("discount 5 " + discount5);
//        za 81 -> 0


    }

    private static void question77() {
        int n[][] = {{1, 3}, {2, 4}};

        for (int i = n.length - 1; i >= 0; i--) {
            for (int y : n[i]) {
                System.out.print(y);
            }
            //System.out.println("/n");
        }
    }
}
