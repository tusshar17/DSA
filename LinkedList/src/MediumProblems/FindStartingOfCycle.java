package MediumProblems;

public class FindStartingOfCycle {

    static Node findStartingOfCycle(Node head){

        if (head==null || head.next==null) return head;

        Node slow = head;
        Node fast = head;

        while (fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;

            if (slow==fast) {
                slow = head;
                while (slow!=fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }

        return null;

    }

    public static void main(String[] args) {
        // creating LL
        Node n4 = new Node(4, null);
        Node n3 = new Node(3, n4);
        Node n2 = new Node(2, n3);
        Node head = new Node(1, n2);

        // making a loop by pointing n4 to n2
        n4.next = n2;

        Node cycleStartsFrom = findStartingOfCycle(head);

        if (cycleStartsFrom==null) System.out.println("NO CYCLE");
        else {
            Node temp = cycleStartsFrom;
            System.out.println("Tail Connect to node:" + temp.val);
        }
    }



}
