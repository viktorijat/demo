package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {
    static class Lizard implements Comparable<Lizard> {
        int weight;

        Lizard(int w) {
            weight = w;
        }

        public int compareTo(Lizard l) {
            return weight - l.weight;
        }

        public String toString() {
            return "" + weight;
        }
    }

    public static void main(String[] args) {
        List<Lizard> list = new ArrayList<>();
        list.add(new Lizard(5));
        list.add(new Lizard(4));
        list.add(new Lizard(7));
        Collections.sort(list);
        System.out.println(list);
    }
}
