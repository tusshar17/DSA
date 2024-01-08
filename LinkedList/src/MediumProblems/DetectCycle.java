package MediumProblems;

public class DetectCycle {

    static boolean hasCycle(Node head){

        if (head==null || head.next==null) return false;

        Node slow = head;
        Node fast = head;

        while (fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;

            if (slow==fast) return true;
        }

        return false;

    }


    public static void main(String[] args) {

        // creating LL
        Node n4 = new Node(4, null);
        Node n3 = new Node(3, n4);
        Node n2 = new Node(2, n3);
        Node head = new Node(1, n2);

        // making a loop by pointing n4 to n2
        n4.next = n2;

        System.out.println("Does given linked list has a cycle?");
        System.out.println(hasCycle(head));

    }
}
