package com.example.demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class School {
    private List<Object> exceptions;
    private List<?> names = new ArrayList<Object>();

    public School() {
        exceptions = new LinkedList<>();
        //names.add(new Object());
    }
}
