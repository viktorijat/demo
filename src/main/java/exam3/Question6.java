package exam3;

public class Question6 {

    public static <T> int count(T[] array, T elem) {
        int count = 0;
//        for (T e: array)
//            if (e.compareTo(elem) > 0) ++count; // compiler error compareTo is not available for generic type
        return count;
    }

    public static void main(String[] args) {
        Integer[] a = {1, 2, 3, 4, 5};
        int n = Question6.<Integer>count(a, 3);
        System.out.println(n);
    }

}