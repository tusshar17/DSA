package DoublyLinkedList;

import static DoublyLinkedList.Insertion.InsertAtHead.convertArrayToDLL;

public class Reverse_DLL {

    static Node reverseDLL(Node head){

        if (head==null || head.next==null) return head;

        Node current = head;
        Node prevNode = null;

        while (current!=null){
            prevNode = current.prev;
            current.prev = current.next;
            current.next = prevNode;

            current = current.prev;
        }

        return prevNode.prev;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Node head = DoublyLL.convertArrayToDLL(arr);
        System.out.println("Original List:");
        DoublyLL.printList(head);
        Node reversedList = reverseDLL(head);
        System.out.println("Reversed List:");
        DoublyLL.printList(reversedList);
    }


}
