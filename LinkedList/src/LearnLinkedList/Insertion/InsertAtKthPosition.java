package LearnLinkedList.Insertion;

public class InsertAtKthPosition {

    static ListNode insertAtKthPosition(int val, int k, ListNode head){


        if (head==null){
            ListNode newNode = new ListNode(val);
            if (k==1) return newNode;
            else {
                System.out.println("K out of range");
                return head;
            }
        }

        if (k==1){
            return new ListNode(val, head);
        }

        int count = 0;
        ListNode current = head;

        while (current!=null){

            count++;

            if (count==k-1){
                ListNode newNode = new ListNode(val);
                newNode.next = current.next;
                current.next = newNode;
                break;
            }

            current = current.next;

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

        System.out.println("List before inserting 0 at 3rd position");
        InsertingNodeAtLast.printList(head);

        head = insertAtKthPosition(0, 3, head);

        System.out.println("List after inserting 0 at 3rd position");
        InsertingNodeAtLast.printList(head);

    }
}
