package coderpad;

class BSTNode {
    int data;
    Node left, right;

    BSTNode(int data) {
        this.data = data;
        this.left = this.right = null;
    }

    public void print(String prefix, Node n, boolean isLeft) {
        if (n != null) {
            System.out.println(prefix + (isLeft ? "|-- " : "\\-- ") + n.data);
            print(prefix + (isLeft ? "|   " : "    "), n.left, true);
            print(prefix + (isLeft ? "|   " : "    "), n.right, false);
        }
    }
}


public class BinaryTreeMirror {

    Node root;

    private static void printAscending(Node node) {
        // is there actually a node here
        // or was this called from a node with no children
        if (node != null) {
            // print everything that's earlier than this node
            printAscending(node.left);

            // print this node's value
            System.out.println(node.data);

            // print everything that's afterthan this node
            printAscending(node.right);
        }
    }

    private static Node mirror(Node node) {

        if (node == null) {
            return node;
        }

        Node left = mirror(node.left);
        Node right = mirror(node.right);

        node.left = right;
        node.right = left;

        return node;
    }

    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();
        BinarySearchTree.root = new Node(4);
        BinarySearchTree.root.left = new Node(2);
        BinarySearchTree.root.right = new Node(5);
        BinarySearchTree.root.left.left = new Node(1);
        BinarySearchTree.root.left.right = new Node(3);

        printAscending(BinarySearchTree.root);

        System.out.println(mirror(BinarySearchTree.root));


        printAscending(BinarySearchTree.root);


    }


}
