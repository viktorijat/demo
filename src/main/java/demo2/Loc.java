package demo2;

import java.time.LocalDate;
import java.util.Locale;
import java.util.ResourceBundle;

public class Loc {

    public static void main(String[] args) {

        //test1();
        question142();

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
