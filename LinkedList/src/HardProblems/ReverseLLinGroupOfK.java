package HardProblems;


public class ReverseLLinGroupOfK {


    static int lengthOfList(Node head){
        Node temp = head;
        int length = 0;

        while (temp!=null){
            length++;
            temp = temp.next;
        }

        return length;
    }

    static Node reverseInfGroupOfK(Node head, int k){

        if (head==null || head.next==null) return head;

        int lengthOfList = lengthOfList(head);

        Node dummy = new Node(0, null);
        dummy.next = head;

        Node pre = dummy;
        Node current;
        Node next;

        while (lengthOfList>=k){
            current = pre.next;
            next = current.next;
            for (int i=1; i<k; i++){
                current.next = next.next;
                next.next = pre.next;
                pre.next = next;
                next = current.next;
            }
            pre = current;
            lengthOfList -=k;
        }

        return dummy.next;

    }


    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int k = 2;

        Node head = LinkedList.convertArrayToLL(arr);
        System.out.println("Original List:");
        LinkedList.printList(head);

        head = reverseInfGroupOfK(head, k);
        System.out.println("Reversed in group of" + k + " List:");
        LinkedList.printList(head);
    }
}
