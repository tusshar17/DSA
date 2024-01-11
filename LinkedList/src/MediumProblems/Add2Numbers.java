package MediumProblems;

public class Add2Numbers {

    static Node add2Numbers(Node l1, Node l2){
        Node dummy = new Node();
        Node temp = dummy;

        int carry = 0;

        while (l1!=null || l2!=null || carry==1){
            int sum = 0;

            if (l1!=null){
                sum += l1.val;;
                l1 = l1.next;
            }

            if (l2!=null){
                sum += l2.val;;
                l2 = l2.next;
            }

            sum += carry;
            carry = sum/10;
            Node node = new Node(sum%10, null);
            temp.next = node;
            temp = temp.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        int num1[] = {1, 0, 9};
        int num2[] = {4, 3, 2};

        Node l1 = LinkedList.convertArrayToLL(num1);
        System.out.println("Num 1:");
        LinkedList.printList(l1);
        Node l2 = LinkedList.convertArrayToLL(num2);
        System.out.println("Num 2:");
        LinkedList.printList(l2);

        Node sum = add2Numbers(l1, l2);
        System.out.println("Sum:");
        LinkedList.printList(sum);
    }
}
