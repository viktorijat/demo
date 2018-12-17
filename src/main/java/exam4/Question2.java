package exam4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Question2 {

    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("in.txt");
            out = new FileOutputStream("out.txt");

            int c;

            while ((c = in.read()) != -1) {
                in.skip(5); // bukva pa skoka 5, pa pa bukva
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
//Hw