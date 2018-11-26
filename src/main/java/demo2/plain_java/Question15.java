package demo2.plain_java;

import java.io.IOException;

class X {
    //public void printFileContent() {
    public void printFileContent() throws IOException {
        throw new IOException();
    }
}

public class Question15 {

    //public static void main(String[] args) {
    public static void main(String[] args) throws Exception {
        X xobj = new X();

        xobj.printFileContent();

    }
}
