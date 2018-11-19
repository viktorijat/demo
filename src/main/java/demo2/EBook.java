package demo2;

class Book {

    public void read(String bName) {
        System.out.println("Read " + bName);
    }
}

public class EBook extends Book {

    public void read(String url) {
        System.out.println("View " + url);
    }
}


class Test {

    public static void main(String[] args) {
        Book b1 = new Book();
        b1.read("Java Programing");
        Book b2 = new EBook();
        b2.read("http://wfade");
    }
}