package MediumProblems;

public class SegregateOddEvenNode {



    static Node segregateOddEven(Node head){

        if (head==null || head.next==null) return head;

        Node evenHead = head.next;

        Node odd = head;
        Node even = head.next;

        while (even!=null && even.next!=null){
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }

        odd.next = evenHead;

        return head;

    }


    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};

        Node head = LinkedList.convertArrayToLL(arr);
        System.out.println("Original List:");
        LinkedList.printList(head);

        System.out.println("Segregated List:");
        head = segregateOddEven(head);
        LinkedList.printList(head);
    }


}
