package travelfusion;

class Node {
    private Node leftChild, rightChild;

    public Node(Node leftChild, Node rightChild) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public static void main(String[] args) {
        Node leaf1 = new Node(null, null);
        Node leaf2 = new Node(null, null);
        //Node node = new Node(leaf1, null);
        Node root = new Node(null, leaf2);

        System.out.println(root.height());
    }

    public Node getLeftChild() {
        return this.leftChild;
    }


    public Node getRightChild() {
        return this.rightChild;
    }

    public int height() {
        if (this == null) {
            return 0;
        } else {

            int leftHeight = 0;
            if (this.getLeftChild() == null) {
                leftHeight = 0;
            } else {
                leftHeight = 1 + this.getLeftChild().height();
            }
            int rightHeight = 0;
            if (this.getRightChild() == null) {
                rightHeight = 0;
            } else {
                rightHeight = 1 + this.getRightChild().height();
            }

            System.out.println(leftHeight + " - " + rightHeight);
            if (leftHeight > rightHeight)
                return (leftHeight + 1);
            else
                return (rightHeight + 1);
        }
    }
}