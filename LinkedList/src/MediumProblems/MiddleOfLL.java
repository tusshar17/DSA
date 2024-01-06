package MediumProblems;

public class MiddleOfLL {

    static Node findMiddle(Node head){

        int sizeOfList = 0;
        Node current = head;

        while (current!=null){
            sizeOfList++;
            current = current.next;
        }

        int counter = 0;
        int middle = (sizeOfList/2) + 1;

        current = head;

        while (current!=null){
            counter++;
            if (counter==middle){
                break;
            }
            current = current.next;
        }

        return current;

    }


    // Tortoise Hare Approach - using a slow and a fast pointer
    static Node findMiddleOptimised(Node head){
        Node slow = head;
        Node fast = head;

        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }


    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6};

        Node head = LinkedList.convertArrayToLL(arr);
        System.out.println("Original List:");
        LinkedList.printList(head);

        Node middle = findMiddle(head);
        System.out.println("Middle Of List");
        LinkedList.printList(middle);

        Node middle2 = findMiddleOptimised(head);
        System.out.println("Middle of List using optimised solution:");
        LinkedList.printList(middle2);
    }


}
