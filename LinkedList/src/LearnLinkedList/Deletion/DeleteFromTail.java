package LearnLinkedList.Deletion;



public class DeleteFromTail {

    static Node insertAtFirst(int data, Node head){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }

    static void printList(Node head){
        Node current = head;
        while (current!=null){
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("end");
    }

    // deleting a node from tail
    static Node deleteFromTail(Node head){
        if (head == null || head.next==null) return null;

        Node current = head;
        while (current.next.next != null){
            current = current.next;
        }
        current.next = null;
        return head;
    }

    public static void main(String[] args) {

        Node head = null;

        head = insertAtFirst(30, head);
        head = insertAtFirst(20, head);
        head = insertAtFirst(10, head);

        System.out.println("Before deleting tail");
        printList(head);

        head = deleteFromTail(head);

        System.out.println("After deleting tail");
        printList(head);
    }
}
