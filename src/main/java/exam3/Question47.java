package exam3;

abstract class A1 {
    protected int a;

    A1(int a) {
        this.a = a;
    }
    abstract public int getA();
}

class B1 extends A1 {

    int b;

    B1(int b) {
        super(b * 2);
        this.b = b;
    }

    @Override
    public int getA() {
        return a + b;
    }

    public int getB() {
        return b;
    }
}

public class Question47 {

    public static void main(String[] args) {
        B1 b1 = new B1(4);
        B1 b2 = new B1(3);

        System.out.println(b1.getA()); // 12
        System.out.println(b1.getB()); // 4
        System.out.println(b2.getA()); // 9
        System.out.println(b2.getB()); // 3
    }

}
