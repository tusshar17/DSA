package DoublyLinkedList.Deletion;

import static DoublyLinkedList.Deletion.DeleteHead.convertArrayToDLL;
import static DoublyLinkedList.Deletion.DeleteHead.printList;

public class DeleteNode {

    static void deleteNode(Node node){

        // if node to delete is tail
        if (node.next==null){
            node.prev.next = null;
            node.prev = null;
        }

        Node prevNode = node.prev;
        Node nextNode = node.next;

        prevNode.next = nextNode;
        nextNode.prev = prevNode;

        node.prev = null;
        node.next = null;

    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Node head = convertArrayToDLL(arr);

        System.out.println("Before");
        printList(head);

        deleteNode(head.next.next);

        System.out.println("After deleting node");
        printList(head);
    }

}
