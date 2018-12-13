package exam3;

import java.util.Comparator;
import java.util.TreeSet;

public class Question23 {

    public static void main(String[] args) {

        TreeSet<String> tree = new TreeSet<String>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1.charAt(1) - o2.charAt(1));
            }
        });

        tree.add("Dog");
        tree.add("Cat");
        tree.add("Big");
        tree.add("Ananas");
        tree.add("Horse");

        for (String s : tree) {
            System.out.print(s + " ");
        }

        // Cat Big Ananas Dog
    }
}
