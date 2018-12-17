package coderpad;

class LinkedListLL {

    NodeLL head; // head of list

    /* Linked list Node*/
    class NodeLL {
        int data;
        NodeLL next;

        // Constructor to create a new node
        // Next is by default initialized
        // as null
        NodeLL(int d) { data = d; }
    }

    public LinkedListLL insert(LinkedListLL list, int data) {

        // Create a new node with given data
        NodeLL newNode = new NodeLL(data);
        newNode.next = null;

        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
            list.head = newNode;
        }
        else {
            // Else traverse till the last node
            // and insert the newNode there
            NodeLL last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            // Insert the newNode at last node
            last.next = newNode;
        }

        // Return the list by head
        return list;
    }

    public void printList(LinkedListLL list) {
        NodeLL currNode = list.head;
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
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

    }


}
