package exam4;

class Ex extends Throwable {
}

class A42 {

    private int a;

    public A42(int a) {
        this.a = a;
    }

    public class NA {
        int na;

        public NA(int na) {
            this.na = na;
        }

        public int getNa() {
            return na;
        }

        public int getA() {
            return a;
        }
    }
}

public class Question42 {

    public static void main(String[] args) {

        A42 a = new A42(3);
        A42.NA na1 = a.new NA(2);
        A42.NA na2 = a.new NA(5);

        System.out.println(na1.getNa());  // 2
        System.out.println(na2.getNa());  // 5
        System.out.println(na1.getA());   // 3
    }
}
