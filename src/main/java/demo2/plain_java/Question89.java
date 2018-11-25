package demo2.plain_java;


abstract class Shape {

    Shape() {
        System.out.println("Shape");
    }

    protected void area() {
        System.out.println("Shape");
    }
}

class Square extends Shape {
    int side;

    Square(int side) {
        // line 9
        this.side = side;
    }

    //line 12
    public void area() {
        System.out.println("Square");
    }
}

class Rectangle extends Square {
    int len, br;

    Rectangle(int x, int y) {
        // line 17
        super(x);
        super.side = x;
        len = x;
        br = y;
    }

    public void area() {
        System.out.println("Rectangle");
    }
}

public class Question89 {
}
