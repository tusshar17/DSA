package MediumProblems;

public class RemoveNthFromBack {


    static Node removeNthFromBack(Node head, int n){


        Node slow = head;
        Node fast = head;

        for (int i=0; i<n; i++){
            fast = fast.next;
        }

        if (fast==null) return head.next;

        while (fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }


        slow.next = slow.next.next;

        return head;


    }


    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};

        Node head = LinkedList.convertArrayToLL(arr);
        System.out.println("Original List:");
        LinkedList.printList(head);

        int n = 1;
        System.out.println("After deleting " + n + " node from end:");
        head = removeNthFromBack(head, n);
        LinkedList.printList(head);
    }

}
