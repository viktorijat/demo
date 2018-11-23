package demo2.plain_java;

import java.util.Comparator;

class Book {

    String name;
    int id;

    public Book(int id, String name) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        boolean output = false;
        Book b = (Book) obj;
        if (this.name.equals(b.name)) {
            output = true;
        }
        return output;
    }
}


public class Question98 {

    public static void main(String[] args) {
        Book b1 = new Book (101, "Java Programing");
        Book b2 = new Book (102, "Java Programing");
        System.out.println(b1.equals(b2));
        // true
    }
    
}
