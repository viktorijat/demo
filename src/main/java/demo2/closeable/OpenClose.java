package demo2.closeable;

class CL1 implements AutoCloseable {

    void open() throws Exception {
        System.out.println("open 1");
        throw new Exception();
    }

    public void close() {
        System.out.println("close 1");
    }
}

public class OpenClose {

    public static void main(String[] args) throws Exception {
        try (CL1 o = new CL1();) {
            o.open();
        } catch (Exception e) {
            throw e;
        }
    }
}


//    Exception in thread "main" java.lang.Exception
//        at demo2.closeable.CL1.open(OpenClose.java:7)
//        at demo2.closeable.OpenClose.main(OpenClose.java:19)
//        open 1
//        close 1