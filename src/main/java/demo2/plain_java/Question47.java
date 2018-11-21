package demo2.plain_java;

class C2 {
    public void displayC2() {
        System.out.println("c2");
    }
}

interface I {
    public void displayI();
}

class C1 extends C2 implements I {
    public void displayI() {
        System.out.println("cI");
    }
}

public class Question47 {

    public static void main(String[] args) {
        C2 obj1 = new C1();
        I obj2 = new C1();

        C2 s = (C2) obj2;
        I t = (I) obj1;

        t.displayI();
        s.displayC2();

        // taka bese:
//        C2 s = obj2;
//        I t = obj1;
        // compilation fails
    }
}
