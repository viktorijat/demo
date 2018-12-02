package com.example.demo;

import java.util.concurrent.RecursiveAction;

class SAction extends RecursiveAction {

    String s;
    static int count = 0;

    SAction(String s) {
        this.s = s;
    }

    @Override
    protected void compute() {
        if (s.length() < 5) {
            count += s.length();
        } else {
            int split = s.length() / 2;
            //invoke(new SAction(s.substring(0, split)), new SAction(s.substring(split, s.length())));
        }
    }
}

public class Question76 {


}
