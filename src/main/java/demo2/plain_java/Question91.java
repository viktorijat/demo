package demo2.plain_java;


class Foo<K, V> {

    private K key;
    private V value;

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public Foo(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public static <T> Foo<T, T> twice(T value) {
        return new Foo<T, T>(value, value);
    }

    @Override
    public String toString() {
        return "Foo{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}

public class Question91 {

    public static void main(String[] args) {

        Foo<String, Integer> mark = new Foo<String, Integer>("Steve", 100);
        Foo<String, String> pair = Foo.<String>twice("Hello world");
        Foo<?, ?> percentage = new Foo<>(97, 32);
        Foo<String, String> grade = new Foo<>("John", "A");

        System.out.println(mark.toString()); // Foo{key=Steve, value=100}
        System.out.println(pair.toString()); // Foo{key=Hello world, value=Hello world}
        System.out.println(percentage.toString()); // Foo{key=97, value=32}
        System.out.println(grade.toString()); // Foo{key=John, value=A}
    }

}
