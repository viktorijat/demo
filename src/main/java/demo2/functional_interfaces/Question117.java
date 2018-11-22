package demo2.functional_interfaces;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Book implements Comparator<Book> {

    String name;

    public Book() { }

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    double price;

    @Override
    public int compare(Book b1, Book b2) {
        return b1.name.compareTo(b2.name);
    }

    @Override
    public String toString() {
        return name + ":" + price;
    }
}

public class Question117 {

    public static void main(String[] args) {

        List<Book> books = Arrays.asList(new Book("Beginning with Java", 2),
                new Book("A Guide to Java Tour", 3));

        Collections.sort(books, new Book());
        System.out.println(books);

        // [A Guide to Java Tour:3.0, Beginning with Java:2.0]
    }
}
