package HardProblems;

public class RotateLinkedList {

    static Node rotateList(Node head, int k){

        if (head==null || head.next==null || k==0) return head;

        Node current = head;
        int length = 1;

        while (current.next!=null){
            length++;
            current =current.next;
        }

        current.next = head;
        k = length - k % length;

        while (k-- > 0) current = current.next;

        head = current.next;
        current.next = null;

        return head;

    }


    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};
        int k = 2;

        Node head = LinkedList.convertArrayToLL(arr);

        System.out.println("Original List:");
        LinkedList.printList(head);

        head = rotateList(head, k);
        System.out.println("After rotating list " + k + " times:");
        LinkedList.printList(head);
    }
}
