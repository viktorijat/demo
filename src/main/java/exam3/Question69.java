package exam3;

class A69 {
    static {
        System.out.println("sa");
    }
}

class B69 extends A69 {
    static {
        System.out.println("sb");
    }
}

public class Question69 {

    public static void main(String[] args) {
        new B69();
        new A69();
    }
}

// sa sb
// oti sekogas koga e extends prvo parent klasata printa PA NE ZNAM SO DA BIDE