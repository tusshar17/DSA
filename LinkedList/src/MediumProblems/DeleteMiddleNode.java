package MediumProblems;

public class DeleteMiddleNode {

    static Node deleteMiddleNode(Node head){

        if (head==null || head.next==null){
                return null;
        }

        Node slow = head;
        Node fast = head;

        Node prevOfMiddle = null;

        while (fast!=null && fast.next!=null){
            prevOfMiddle = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prevOfMiddle.next = slow.next;


        return head;
    }


    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};

        Node head = LinkedList.convertArrayToLL(arr);
        System.out.println("Original List:");
        LinkedList.printList(head);

        System.out.println("After deleting middle node:");
        head = deleteMiddleNode(head);
        LinkedList.printList(head);
    }
}
