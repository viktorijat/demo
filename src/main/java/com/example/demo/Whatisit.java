package com.example.demo;

import java.time.LocalDate;
import java.time.Month;

public class Whatisit {

    static interface Furry {
    }

    static class Chipmunk {
    }

    class FurryChipmunk implements Furry {
    }

    public static void main(String[] args) {
        //Whatisit w = new Whatisit();
        Chipmunk c = new Chipmunk();
        int result = 0;
        if (c instanceof Furry) result += 1;
        if (c instanceof Chipmunk) result += 2;
        if (null instanceof FurryChipmunk) result += 4;
        System.out.println(result);

        LocalDate date = LocalDate.of(2014, Month.JUNE, 21);
    }
}
