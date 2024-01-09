package MediumProblems;

public class PalindromeCheck {

    static boolean checkPalindrome(Node head){

        if (head==null || head.next==null) return true;

        // find middle of list
        Node slow = head;
        Node fast = head;

        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // Now, slow is the middle of list
        // reverse second half
        Node current = slow;
        Node prev = null;

        while (current!=null){
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        slow = prev; // starting of second half of list

        // compare first and second half
        Node start = head; // starting of first half of list
        while (slow!=null){
            if (slow.val!=start.val) return false;
            slow = slow.next;
            start = start.next;
        }

        return true;
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 3, 2, 1};

        Node head = LinkedList.convertArrayToLL(arr);
        System.out.println("List:");
        LinkedList.printList(head);

        System.out.println("Is given list palindrome?");
        System.out.println(checkPalindrome(head));

    }
}
