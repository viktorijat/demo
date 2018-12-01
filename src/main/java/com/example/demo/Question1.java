package com.example.demo;

public class Question1 {

    final private String name;

    Question1(String name) {
        this.name = name;
        getName();
    }

    private String getName() {
        return name;
    }

    private String getName2() {
        return name + "a";
    }
}
