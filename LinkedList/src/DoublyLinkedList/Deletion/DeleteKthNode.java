package DoublyLinkedList.Deletion;

import static DoublyLinkedList.Deletion.DeleteHead.convertArrayToDLL;
import static DoublyLinkedList.Deletion.DeleteHead.printList;

public class DeleteKthNode {


    static Node deleteKthElement(Node head, int k){

        if (head==null) return null;

        Node current = head;
        int count = 0;

        while (current.next!=null){
            count++;
            if (count==k) break;
            current = current.next;
        }

        Node prev = current.prev;
        Node next = current.next;

        if (prev==null && next==null) return null; // LL is empty

        else if (prev==null) { // element to delete is head of LL
            Node oldHead = head;
            head = head.next;
            head.prev = null;
            oldHead.next = null;
            return head;
        }

        else if (next==null) { // element to delete is tail
            current.prev.next = null;
            current.prev = null;
            return head;
        }

        // element to delete is in between
        Node nextOfCurrent = current.next;
        Node prevOfCurrent = current.prev;

        prevOfCurrent.next = nextOfCurrent;
        nextOfCurrent.prev = prevOfCurrent;

        current.prev = null;
        current.next = null;

        return head;


    }


    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        Node head = convertArrayToDLL(arr);

        System.out.println("Before");
        printList(head);

        head = deleteKthElement(head, 2);

        System.out.println("After deleting 2nd node");
        printList(head);
    }
}
