package LearnLinkedList.Insertion;

public class InsertingNodeAtLast {

    static ListNode insertAtLast(int val, ListNode head){

        ListNode newNode = new ListNode(val);

        if (head==null) return newNode;

        ListNode current = head;

        while (current.next!=null){
            current = current.next;
        }

        current.next = newNode;

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

        head = insertAtLast(1, head);
        head = insertAtLast(2, head);
        head = insertAtLast(3, head);
        head = insertAtLast(4, head);
        head = insertAtLast(5, head);

        System.out.println("List before inserting 0 at end");
        printList(head);

        head = insertAtLast(0, head);

        System.out.println("List after inserting 0 at end");
        printList(head);
    }
}
