package demo2;

import java.util.Locale;
import java.util.ResourceBundle;

public class Loc {

    public static void main(String[] args) {

        Locale l = new Locale("en", "FR");

        ResourceBundle b = ResourceBundle.getBundle("Messages");

        System.out.println(b.getObject("hello"));

    }
}
