package exam4;


class Int {

    int i;

    Int(int i) {
        this.i = i;
    }
}


public class Question31 {

    public static void main(String[] args) {

        System.out.println(method(2));
        System.out.println(method(5));
        System.out.println(method(3));
    }

    public static int method(int i) {

        int y = 0;
        Int ret = new Int(0);
        try {
            ret.i = i + 1;
            return ret.i;
        } finally {
            ret.i--;
        }
    }
}
// 3 6 4