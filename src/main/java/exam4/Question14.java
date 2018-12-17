package exam4;

class Super {
    public String a = "S";

    public static void doMethod1() {
        System.out.println("Super M1");
    }

    public void doMethod2() {
        System.out.println("Super M2 " + a);
    }
}

class Sub extends Super {
    public String a = "B";

    public static void doMethod1() {
        System.out.println("Sub M1");
    }

    public void doMethod2() {
        System.out.println("Sub M2 " + a);
    }
}

public class Question14 {

    public static void main(String[] args) {
        Super s1 = new Super();
        Super s2 = new Sub();

        Super.doMethod1();
        Super.doMethod1();

        s1.doMethod2();
        s2.doMethod2();
    }
}

//Super M1
//Super M1
//Super M2 S
//Sub M2 B