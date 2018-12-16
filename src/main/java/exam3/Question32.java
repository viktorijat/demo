package exam3;

class MyException extends RuntimeException {
    public MyException(String message) {

    }
}

public class Question32 {

    public static void main(String[] args) {

        try {
            method();
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Runtime Exception");
        }
    }

    private static void method() {
        throw new MyException("MyException");
    }

}
// null