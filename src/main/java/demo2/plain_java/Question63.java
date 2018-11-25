package demo2.plain_java;

import java.util.ArrayList;

public class Question63 {

    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        String[] myArray;

        try {
            while (true) {
                myList.add("My string");
            }
        } catch (RuntimeException re) {
            System.out.println("caught a RuntimeException");
        } catch (Exception e) {
            System.out.println("caught an Exception");
        }

        System.out.println("ready to use");
    }
}
