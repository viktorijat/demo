package exam4;

interface A7 {
    String getA();
}

public class Question7 {

    public static void main(String[] args) {
        A7 a = new A7() {
            @Override
            public String getA() {
                return "First " + this.getNum();
            }

            private int getNum() {
                return 0;
            }
        };

        A7 b = new A7() {
            @Override
            public String getA() {
                return "Second " + this.getNum();
            }

            private int getNum() {
                return 1;
            }
        };

        //System.out.println(a.getA() + b.getA() + ((A7) a).getNum() + ((A7) b).getNum());
        System.out.println(a.getA() + b.getA());
    }
}
