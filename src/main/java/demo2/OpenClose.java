package demo2;

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
