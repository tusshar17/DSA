package DoublyLinkedList.Deletion;

import static DoublyLinkedList.Deletion.DeleteHead.printList;
import static DoublyLinkedList.Deletion.DeleteHead.convertArrayToDLL;

public class DeleteTail {

    static Node deleteTail(Node head){

        if (head==null || head.next==null) return null;

        Node tail = head;

        while (tail.next!=null){
            tail = tail.next;
        }

        Node prev = tail.prev;
        prev.next = null;
        tail.prev = null;

        return head;

    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Node head = convertArrayToDLL(arr);

        System.out.println("Before deleting tail");
        printList(head);

        head = deleteTail(head);

        System.out.println("After deleting tail");
        printList(head);
    }


}
