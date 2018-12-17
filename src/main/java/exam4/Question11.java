package exam4;

class B11 implements AutoCloseable {

    void method() throws Exception {
        throw new Exception("BB");
    }

    @Override
    public void close() throws Exception {
        throw new Exception("CC");
    }
}

public class Question11 {

    public static void main(String[] args) {

        try {
            Question11.print();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    private static void print() throws Exception {
        try (B11 b = new B11()) {
            b.method();
        }
    }
}
//BB