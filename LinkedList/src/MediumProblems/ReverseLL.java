package MediumProblems;

public class ReverseLL {

    static Node reverseLL(Node head){

        if (head==null || head.next==null) return head;

        Node current = head;
        Node prevNode = null;

        while (current!=null){
            Node nextNode = current.next;
            current.next = prevNode;
            prevNode = current;
            current = nextNode;
        }

        return prevNode;

    }


    static Node reverseUsingRecursion(Node head){

        if (head==null || head.next==null) return head;

        Node newHead = reverseUsingRecursion(head.next);

        Node prevNode = head.next;
        prevNode.next = head;
        head.next = null;

        return newHead;
    }


    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6};

        Node head = LinkedList.convertArrayToLL(arr);
        System.out.println("Original List:");
        LinkedList.printList(head);

        // Node reversedLL = reverseLL(head);
        // System.out.println("Reversed List:");
        // LinkedList.printList(reversedLL);

        Node reversedLL2 = reverseUsingRecursion(head);
        System.out.println("Reversed List:");
        LinkedList.printList(reversedLL2);
    }
}
