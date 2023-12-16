package LearnLinkedList.Insertion;


class ListNode{
    int data;
    ListNode next;

    ListNode(int data){
        this.data = data;
        this.next = null;
    }

    ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }
}

public class InsertingNodeAtBeginning {

    static ListNode insertAtFirst(int val, ListNode head){

        // Step 1 - creating a new node
        ListNode newNode  = new ListNode(val);

        // Step 2 - point newNode to head of the LinkedList
        newNode.next = head;

        // Step 3 - make newNode as the head of LinkedList
        head = newNode;

        return head;
    }


    static void printList(ListNode head){
        ListNode current = head;
        while (current.next!=null){
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print(current.data + "-->");
        System.out.println("end");
    }


    public static void main(String[] args) {
        ListNode head = null;

        head = insertAtFirst(40, head);
        head = insertAtFirst(30, head);
        head = insertAtFirst(20, head);
        head = insertAtFirst(10, head);

        System.out.println("LinkedList before inserting a zero in beginning");
        printList(head);

        head = insertAtFirst(0, head);

        System.out.println("LinkedList after inserting a zero in beginning");
        printList(head);
    }


}
