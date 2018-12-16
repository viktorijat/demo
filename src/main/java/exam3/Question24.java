package exam3;

import java.util.HashMap;

public class Question24 {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        map.put(new String("Cat"), 2);
        map.put(new String("Dog"), 3);
        map.put(new String("Fish"), 4);

//        for (String s : map.keySet()) {
//            map.remove(s);
//        }
//        Exception in thread "main" java.util.ConcurrentModificationException

        for (String s : map.keySet()) {
            int i = map.get(s);
            System.out.println(i);
        }


    }
}
