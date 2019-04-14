package intenthq;

import java.util.Collections;
import java.util.List;

public class ConnectedGraph {

    public static boolean run(Node source, Node target) {

        if (source.equals(target)) {
            return true;
        }
        return source.edges.stream().anyMatch(i -> run(i, target));
    }

    public static class Node {

        public final int value;
        List<Node> edges;

        Node(final int value, List<Node> edges) {
            this.value = value;
            this.edges = edges;
        }

        Node(final int value) {
            this.value = value;
            this.edges = Collections.emptyList();
        }
    }
}

// Find if two nodes in a directed graph are connected.
// Based on http://www.codewars.com/kata/53897d3187c26d42ac00040d
// For example:
// a1 -+-> b2 -> c3 -> e5
//    |                |
//    +-> d4 ->  f6 -> g7
// run(a, a) == true
// run(a, b) == true
// run(a, c) == true
// run(b, d) == false