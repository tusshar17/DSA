package HardProblems;


class ListNode {
    int val;
    ListNode next;
    ListNode random;
    ListNode(int value){
        val = value;
        next = null;
        random = null;
    }
}

public class CloneListWithRandomNodes {

    static ListNode copyRandomList(ListNode head){

        ListNode temp = head;

        // step 1 - inserting new copied node in between
        while (temp!=null){
            ListNode newNode = new ListNode(temp.val);
            newNode.next = temp.next;
            temp.next = newNode;
            temp = temp.next.next;
        }

        // step 2 - copying random pointer
        ListNode itr = head;
        while (itr!=null){
            if (itr.random!=null){
                itr.next.random = itr.random.next;
            }
            itr = itr.next.next;
        }

        // step 3 - removing duplicate nodes from original list and creating a new list of them
        ListNode dummy = new ListNode(0);
        itr = head;
        temp = dummy;
        ListNode fast;

        while (itr!=null){
            fast = itr.next.next;
            temp.next = itr.next;
            itr.next = fast;
            temp = temp.next;
            itr = fast;
        }

        return dummy.next;

    }

    static void printList(ListNode head) {
        while(head != null) {
            System.out.print(head.val+":");
            if(head.next != null)
                System.out.print(head.next.val);
            else
                System.out.print("NULL");
            if(head.random != null)
                System.out.print(","+head.random.val);
            else
                System.out.print(",NULL");
            System.out.println();
            head = head.next;
        }
    }

    public static void main(String args[]) {
        ListNode head = null;

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        head = node1;
        head.next = node2;
        head.next.next = node3;
        head.next.next.next = node4;

        head.random = node4;
        head.next.random = node1;
        head.next.next.random = null;
        head.next.next.next.random = node2;

        System.out.println("Original list:(current node:node pointed by next pointer, node pointed by random pointer)");
        printList(head);

        System.out.println("Copy list:(current node:node pointed by next pointer,node pointed by random pointer)");
        ListNode newHead = copyRandomList(head);
        printList(newHead);
    }
}
