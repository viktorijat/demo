package intenthq;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CyclicConnectedGraph {

    private static boolean hasACyclicConnection(Node a, Node b, List<Node> descendants) {

        if (descendants.contains(a)) {
            return false;
        } else if (a.equals(b)) {
            return true;
        } else {
            descendants.add(a);
            return a.edges.stream().anyMatch(i -> hasACyclicConnection(i, b, descendants));
        }
    }

    public static boolean run(Node source, Node target) {

        boolean connection = hasACyclicConnection(source, target, new ArrayList<>());
        System.out.println(source.value + "-" + target.value + ": " + connection);
        return connection;

    }

    public static class Node {
        public final int value;

        //I removed the final in order to be able to add a setter
        List<Node> edges;


        Node(final int value, List<Node> edges) {
            this.value = value;
            this.edges = edges;
        }

        Node(final int value) {
            this.value = value;
            this.edges = Collections.emptyList();
        }

        List<Node> getEdges() {
            return this.edges;
        }

        //I need a setter to be able to add edges
        void setEdges(List<Node> edges) {
            this.edges = edges;
        }

        //to be able to create cyclic graph
        void addEdge(Node edge) {
            List<Node> newEdges = this.getEdges();
            newEdges.add(edge);
            this.setEdges(newEdges);
        }
    }
}