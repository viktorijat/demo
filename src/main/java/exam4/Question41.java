package exam4;

interface I {
    int getX();
}

class A {
    private int x;

    public A(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }
}

class B {
    private A a;
    private int y;

    public B(A a) {
        this.a = a;
        y = a.getX() + 1;
    }

    public int getX(boolean b) {
        return y;
    }

    public int getX() {
        return a.getX();
    }
}

class C extends B implements I {

    public C(int y) {
        super(new A(y));
    }
}

public class Question41 {

    public static void main(String[] args) {
        System.out.println(new C(1).getX());
        System.out.println(new C(1).getX(true));

        System.out.println(new B(new A(3)).getX());
        System.out.println(new B(new A(3)).getX(true));

        System.out.println(new A(4).getX());
        System.out.println(new A(4));
    }
}
// 1 2 3 4 4