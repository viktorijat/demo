package demo2.closeable;

import java.io.IOException;

class Folder implements AutoCloseable {  //line n1

    public void open() {
        System.out.println("Open");
    }

    //line n2
    public void close() throws IOException {
        System.out.println("Close");
    } // dodadeno
}

public class Question131 {

    public static void main(String[] args) throws Exception {
        try (Folder f = new Folder();) {
            f.open();
        }
    }
}
