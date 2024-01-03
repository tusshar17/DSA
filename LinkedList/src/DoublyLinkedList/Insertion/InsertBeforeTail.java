package DoublyLinkedList.Insertion;

import static DoublyLinkedList.Insertion.InsertAtHead.convertArrayToDLL;
import static DoublyLinkedList.Insertion.InsertAtHead.printList;

public class InsertBeforeTail {

    static Node insertBeforeTail(Node head, int x){

        if (head.next==null){
            // insert before head
            Node newNode = new Node(x, head, null);
            head.prev = newNode;
            return newNode;
        }

        Node tail = head;

        while (tail.next!=null){
            tail = tail.next;
        }

        Node prevOfTail = tail.prev;

        // creating new Node
        Node newNode = new Node(x, tail, prevOfTail);

        prevOfTail.next = newNode;
        tail.prev = newNode;

        return head;

    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Node head = convertArrayToDLL(arr);

        System.out.println("Before ");
        printList(head);

        head = insertBeforeTail(head, 0);

        System.out.println("After ");
        printList(head);
    }
}
