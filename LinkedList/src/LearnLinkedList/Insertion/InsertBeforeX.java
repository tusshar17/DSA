package LearnLinkedList.Insertion;

public class InsertBeforeX {

    static ListNode insertBeforeX(int val, int x, ListNode head){

        if (head==null) return null;

        if (head.data==x){
            ListNode newNode = new ListNode(val, head);
            return newNode;
        }

        ListNode current = head;
        boolean found = false;

        while (current.next!=null){
            if (current.next.data==x){
                ListNode newNode = new ListNode(val, current.next);
                current.next = newNode;
                found = true;
                break;
            }

            current = current.next;

        }

        if (!found){
            System.out.println("Element not found!");
        }

        return head;

    }


    public static void main(String[] args) {

        ListNode head = null;

        head = InsertingNodeAtLast.insertAtLast(1, head);
        head = InsertingNodeAtLast.insertAtLast(2, head);
        head = InsertingNodeAtLast.insertAtLast(3, head);
        head = InsertingNodeAtLast.insertAtLast(4, head);
        head = InsertingNodeAtLast.insertAtLast(5, head);

        System.out.println("List before inserting 0 before 3");
        InsertingNodeAtLast.printList(head);

        head = insertBeforeX(0, 3, head);

        System.out.println("List after inserting 0 before 3");
        InsertingNodeAtLast.printList(head);

    }
}
