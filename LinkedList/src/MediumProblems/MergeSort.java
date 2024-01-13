package MediumProblems;

public class MergeSort {

    static Node findMiddle(Node head){

        if (head==null) return null;

        Node slow = head;
        Node fast = head.next;

        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    static Node merge(Node left, Node right){

        if (left==null) return right;
        if (right==null) return left;

        Node dummyNode = new Node(-1, null);
        Node temp = dummyNode;

        while (left!=null && right!=null){
            if (left.val<=right.val){
                temp.next = left;
                left = left.next;
            } else {
                temp.next = right;
                right = right.next;
            }

            temp = temp.next;

        }

        if (left!=null) temp.next = left;
        if (right!=null) temp.next = right;


        return dummyNode.next;

    }

    static Node mergeSort(Node head){

        if (head==null || head.next==null) return head;

        Node middle = findMiddle(head);

        Node startOfRight = middle.next;
        middle.next=null;

        Node leftHead = mergeSort(head);
        Node rightHead = mergeSort(startOfRight);

        Node newHead = merge(leftHead, rightHead);

        return newHead;

    }

    public static void main(String[] args) {

        int arr[] = {1, 5, 2, 4, 3};

        Node head = LinkedList.convertArrayToLL(arr);
        System.out.println("Original List:");
        LinkedList.printList(head);

        head = mergeSort(head);
        System.out.println("Sorted List:");
        LinkedList.printList(head);

    }
}
