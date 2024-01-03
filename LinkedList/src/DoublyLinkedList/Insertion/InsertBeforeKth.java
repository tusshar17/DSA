package DoublyLinkedList.Insertion;

import static DoublyLinkedList.Insertion.InsertAtHead.*;

public class InsertBeforeKth {

    static Node insertBeforeKth(Node head, int x, int k){

        if (k==1){
            return insertAtHead(head, x);
        }

        Node temp = head;
        int count = 0;

        while (temp!=null){
            count++;
            if (count==k) break;
            temp = temp.next;
        }

        Node prevOfTemp = temp.prev;
        Node newNode = new Node(x, temp, prevOfTemp);

        prevOfTemp.next = newNode;
        temp.prev = newNode;

        return head;

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Node head = convertArrayToDLL(arr);

        System.out.println("Before");
        printList(head);

        head = insertBeforeKth(head, 0, 3);

        System.out.println("After");
        printList(head);
    }
}
