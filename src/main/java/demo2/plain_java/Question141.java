package demo2.plain_java;

interface Moveable<Integer> {

    public default void walk(Integer distance) {
        System.out.println("walking");
    }

    public void run(Integer distance);

}

public class Question141 {

    public static void main(String[] args) {

        Moveable<Integer> animal = n -> System.out.println("Running " + n);
        Moveable<Integer> animal2 = (Integer n) -> System.out.println("Running " + n);
        animal.run(100);
        animal2.walk(100);

    }
}
