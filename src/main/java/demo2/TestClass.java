package demo2;

public class TestClass<T> {

    void apply() {
        System.out.println("a");
    }
}

class Use {

    public static void main(String[] args) {

        TestClass t = new TestClass();
        t.apply();

        TestClass<String> t2 = new TestClass<>();
        t.apply();
    }
}
