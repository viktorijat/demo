package coderpad;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class BinarySearchTree {

    static Node root;

    private static boolean isBstUtil(Node node, int min, int max) {

        if (node == null) {
            return true;
        }

        if (node.data < min || node.data > max) {
            return false;
        }
        return isBstUtil(node.left, min, node.data - 1) && isBstUtil(node.right, node.data + 1, max);
    }

    private static boolean isBst() {
        return isBstUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();
        bst.root = new Node(4);
        bst.root.left = new Node(2);
        bst.root.right = new Node(5);
        bst.root.left.left = new Node(1);
        bst.root.left.right = new Node(3);

        System.out.println(isBst());

    }
}
