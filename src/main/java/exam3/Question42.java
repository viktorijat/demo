package exam3;

class A {
    private int a;
    public A(int a) {
        this.a = a;
    }

    static class NA {
        int na;
        public NA(int na) {
            this.na = na;
        }
        public int getNa() {
            return na;
        }
        public int getA() {
            return this.getA();
            // taka si bese: return a;// Non-static field 'a' cannot be referenced from a static context
        }
    }
}

public class Question42 {

    public static void main(String[] args) {

        A a = new A(3);
        A.NA na1 = new A.NA(2);
        A.NA na2 = new A.NA(5);

        System.out.println(na1.getNa());
        System.out.println(na2.getNa());
        System.out.println(na1.getA()); // Exception in thread "main" java.lang.StackOverflowError
    }
}
