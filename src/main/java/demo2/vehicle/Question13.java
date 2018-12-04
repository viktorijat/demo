package demo2.vehicle;

class Vehicle3 {
    int x;

    Vehicle3() {
        this(10);
    }

    Vehicle3(int x) {
        this.x =  x;
    }

}

public class Question13 extends Vehicle3 {
    int y;

    Question13() {
        super();
        //this(20); // line n2 compilation error
    }

    Question13(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return super.x + ":" + this.y;
    }

    public static void main(String[] args) {
        Vehicle3 y = new Question13();
        System.out.println(y);
    }
}
