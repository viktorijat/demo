package try3;

public class OpenClose implements AutoCloseable {


    @Override
    public void close() throws Exception {
        try {
            System.out.println("try 1");
            throw new Exception();
        } finally {
            System.out.println("finally");
        }
        //System.out.println("");
    }

    public static void main(String[] args) {

        try (OpenClose o = new OpenClose();) {
            //o.close();
        } catch (Exception e) {
            System.out.println("catch 1");
        }


    }
}
