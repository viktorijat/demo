package com.example.demo;

public class Question5 {

    public static <T extends Comparable<T>> int count(T[] array, T elem) {
        int count = 0;
        for (T e : array) {
            if (e.compareTo(elem) > 0) {
                ++count;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Integer[] a = {1, 2, 3, 4, 5};
        int n = Question5.<Integer>count(a, 3);
        System.out.println(n);
    }

    // 2
}
