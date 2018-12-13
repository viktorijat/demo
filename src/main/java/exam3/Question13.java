package exam3;

class B {

    void method() throws Exception {
        throw new Exception("BB");
    }

    public void close() throws Exception {
        System.out.println("AA");
    }
}

public class Question13 {

    public static void main(String[] args) {
        try {
            Question13.print();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void print() throws Exception {
//        try (B b = new B()) { // mora implements AutoCloseable
//            b.method();
//        }
    }
}
