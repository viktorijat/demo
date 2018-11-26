package demo2;

class Vehicle {
    int x;

    Vehicle() {
        this(10);
    }

    Vehicle(int x) {
        this.x =  x;
    }

}

public class Question13 extends Vehicle {
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
        Vehicle y = new Question13();
        System.out.println(y);
    }
}
