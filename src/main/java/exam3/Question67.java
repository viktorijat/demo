package exam3;


class B3 implements AutoCloseable {

    void method() throws Exception {
        //throw new Exception("BB");
        System.out.println("BB");
    }

    @Override
    public void close() throws Exception {
        System.out.println("close");
    }
}
public class Question67 {

    public static void main(String[] args) {

        try {
            Question67.print();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void print() throws Exception {
        try (B3 b = new B3()) {
            b.method();
        }
    }
}

//    close
//    BB
// ako frla exception togas prvo se prionta toa od close a posle exception message: close BB
// ako ne frla, togas prvo se printa toa od metodot, posle close: BB close