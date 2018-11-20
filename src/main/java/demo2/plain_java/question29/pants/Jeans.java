package demo2.plain_java.question29.pants;

// line n1
//import static demo2.plain_java.question29.Shirt.getColor; // #C
import demo2.plain_java.question29.*; // #D

public class Jeans {

    public void matchShirt() {
        //line n2
        //String color = getColor(); // #C
        String color = Shirt.getColor(); // #D

        if(color.equals("Green")) {
            System.out.println("Fit");
        }
    }

    public static void main(String[] args) {
        Jeans trouser = new Jeans();
        trouser.matchShirt();
    }
}
