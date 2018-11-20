package demo2.plain_java;

import java.io.IOException;

class X {
    //public void printFileContent() {
    public void printFileContent() throws IOException {
        throw new IOException();
    }
}

public class TestX {

    //public static void main(String[] args) {
    public static void main(String[] args) throws IOException {
        X xobj = new X();
        xobj.printFileContent();
    }
}
