package demo2.closeable;

class ImageScanner implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("scanner closed");    // 3
    }

    public void scanImage() throws Exception {
        System.out.println("scan.");             // 1
        throw new Exception("Unable to scan.");  // 4
    }
}

class ImagePrinter implements AutoCloseable {

    public void close() throws Exception {
        System.out.println("Printer closed.");  // 2
    }

    public void printImage() {
        System.out.println("Print.");
    }
}

public class Question109 {

    public static void main(String[] args) {

        try (ImageScanner ir = new ImageScanner();
             ImagePrinter iw = new ImagePrinter()) {
            ir.scanImage();
            iw.printImage();
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }

//    scan.
//    Printer closed.
//    scanner closed
//    Unable to scan.
}
