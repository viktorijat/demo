package demo2;

class Book {

    public void read(String bName) {
        System.out.println("Read " + bName);
    }
}

public class Question6 extends Book {
    public void read(String url) {
        System.out.println("View " + url);
    }
}


class Test {

    public static void main(String[] args) {
        Book b1 = new Book();
        b1.read("Java Programing");
        Book b2 = new Question6();
        b2.read("http://wfade");
    }
}