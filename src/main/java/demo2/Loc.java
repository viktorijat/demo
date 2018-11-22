package demo2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

public class Loc {

    public static void main(String[] args) throws IOException {

        //test1();
        //question142();
        question99();

    }

    private static void question99() throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("src/main/resources/question90.properties");
        prop.load(fis);
        System.out.println(prop.getProperty("welcome1"));
        System.out.println(prop.getProperty("welcome2", "Test"));
        //line n1

        System.out.println(prop.getProperty("welcome3"));

        //Good day
        //Test
        //null
    }

    private static void question142() {
        Locale loc1 = Locale.UK;
        Locale loc2 = new Locale("ru", "RU");
    }

    private static void test1() {
        Locale l = new Locale("en", "FR");
        ResourceBundle b = ResourceBundle.getBundle("Messages");
        System.out.println(b.getObject("hello"));
    }
}
