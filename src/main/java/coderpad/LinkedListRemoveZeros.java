package coderpad;

class LinkedListLL {

    NodeLL head; // head of list

    LinkedListLL insert(LinkedListLL list, int data) {

        NodeLL newNode = new NodeLL(data);
        newNode.next = null;

        if (list.head == null) { // If the Linked List is empty, then make the new node as head
            list.head = newNode;
        } else {
            NodeLL last = list.head;
            while (last.next != null) { // Else traverse till the last node and insert the newNode there
                last = last.next;
            }
            last.next = newNode; // Insert the newNode at last node
        }
        return list; // Return the list by head
    }

    void printList(LinkedListLL list) {
        NodeLL currNode = list.head;
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }

    private void removeNode(NodeLL previous, NodeLL currNode) {

        if (previous == null) {
            previous = currNode;
        } else if (currNode == null) {
            previous.next = null;
        } else {
            previous.next = currNode.next;
        }

    }

    LinkedListLL removeSumZeros(LinkedListLL list) {

        NodeLL currNode = list.head;
        NodeLL prevToTheCurrent = null;
        while (currNode != null) {


            NodeLL nextNode = currNode.next;
            NodeLL prevToTheNext = currNode;
            while (nextNode != null) {
                if (currNode.data + nextNode.data == 0) {


                    NodeLL currentTemp = nextNode.next;
                    list.removeNode(prevToTheNext, nextNode);
                    nextNode = currentTemp;


                    NodeLL temp = currNode.next;
                    NodeLL tempPrevToTheCurrent = currentTemp;
                    list.removeNode(prevToTheCurrent, currNode);
                    currNode = temp;
                    prevToTheCurrent = tempPrevToTheCurrent;
                } else {
                    prevToTheNext = nextNode;
                    nextNode = nextNode.next;
                }

            }
            prevToTheCurrent = currNode;
            currNode = currNode.next;
        }

        return list;
    }

    class NodeLL {

        int data;
        NodeLL next;

        NodeLL(int d) { // Constructor to create a new node, Next is by default initialized as null
            data = d;
        }

        @Override
        public String toString() {
            return String.valueOf(data);
        }
    }
}

public class LinkedListRemoveZeros {

    public static void main(String[] args) {

        LinkedListLL list = new LinkedListLL();
        list.insert(list, 1);
        list.insert(list, 2);
        list.insert(list, 3);
        list.insert(list, -1);
        list.insert(list, -3);
        list.insert(list, 4);

        list.printList(list);

        list.removeSumZeros(list);
        System.out.println("\n");

        list.printList(list);
    }


}
