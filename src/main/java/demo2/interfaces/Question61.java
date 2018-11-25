package demo2.interfaces;

interface Downloadable {
    public void download();
}

interface Readable extends Downloadable {  //line n1
    public void readBook();
}


abstract class Book implements Readable { //line n2
    public void readBook() {
        System.out.println("read book");
    }
}

class EBook extends Book {                //line n3
    public void readBook() {
        System.out.println("read ebook");
    }

    @Override
    public void download() {
        // dodadeno
    }
}

public class Question61 {

    public static void main(String[] args) {
        Book b = new EBook();
        b.readBook();
    }
}
