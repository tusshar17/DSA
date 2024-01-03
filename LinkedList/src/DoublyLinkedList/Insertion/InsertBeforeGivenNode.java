package DoublyLinkedList.Insertion;

import static DoublyLinkedList.Insertion.InsertAtHead.convertArrayToDLL;
import static DoublyLinkedList.Insertion.InsertAtHead.printList;

public class InsertBeforeGivenNode {

    static void insertBeforeNode(Node node, int x){
        Node prevNode = node.prev;
        Node newNode = new Node(x, node, prevNode);
        prevNode.next = newNode;
        node.prev = newNode;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Node head = convertArrayToDLL(arr);

        System.out.println("Before");
        printList(head);

        insertBeforeNode(head.next.next, 0);

        System.out.println("After");
        printList(head);
    }
}
