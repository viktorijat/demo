package exam3;

import java.util.Arrays;
import java.util.List;

class Int {
    int v;

    public Int(int v) {
        this.v = v;
    }
}

public class Question9 {

    public static void main(String[] args) {
        List<Int> list = Arrays.asList(new Int(1), new Int(2));

        Int res = list.stream().peek(p -> p.v++)//.forEach(c -> System.out.println(c.v)); // 2, 3
                .reduce(new Int(0), (elem, acc) -> new Int(elem.v + acc.v)); // se sobiraat 2 i 3

        System.out.println(res.v);
    }
}
