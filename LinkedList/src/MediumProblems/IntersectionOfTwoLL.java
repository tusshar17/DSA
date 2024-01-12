package MediumProblems;

public class IntersectionOfTwoLL {

    static Node findIntersection(Node head1, Node head2){
        Node d1 = head1;
        Node d2 = head2;

        while (d1!=d2){

            if (d1==null){
                d1 = head2;
            } else {
                d1 = d1.next;
            }

            if (d2==null){
                d2 = head1;
            } else {
                d2 = d2.next;
            }
        }

        return d1;

    }


    public static void main(String[] args) {

        // creating 1st list
        Node n4 = new Node(15, null);
        Node n3 = new Node(14, n4);
        Node n2 = new Node(13, n3);
        Node n1 = new Node(12, n2);
        Node head1 = new Node(11, n1);

        // creating 2nd list
        Node m5 = new Node(26, n2);
        Node m4 = new Node(25, m5);
        Node m3 = new Node(24, m4);
        Node m2 = new Node(23, m3);
        Node m1 = new Node(22, m2);
        Node head2 = new Node(21, m1);

        System.out.println("List 1:");
        LinkedList.printList(head1);

        System.out.println("List 2:");
        LinkedList.printList(head2);

        Node commonNode = findIntersection(head1, head2);
        System.out.println("Common Node:");
        System.out.println(commonNode.val + " : " + commonNode);

    }
}
