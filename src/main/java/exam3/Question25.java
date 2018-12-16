package exam3;

import java.util.LinkedList;

public class Question25 {

    public static void main(String[] args) {

        LinkedList<String> deque = new LinkedList<String>();

        deque.addFirst("cat");
        deque.addFirst("dog");
        deque.addLast("fish");
        deque.addFirst("monkey");

        for (int i = 0; i < deque.size(); i++) {
            String s = deque.get(i);
            System.out.println(s);
        }
    }
}
