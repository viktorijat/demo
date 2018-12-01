package com.example.demo;

import java.io.Console;

public class Question11 {

    public static void main(String[] args) {
        Console c = System.console();
        String i = c.readLine("enter value: ");
        String name = c.readLine("enter %d name: ", Integer.valueOf(i));
        char[] pwd = c.readPassword("enter %s pwd: ", "your");
        //String pwd = c.readPassword("enter %s pwd: ", "your");

        System.out.println(name + " " + (new String(pwd)));
    }
}
