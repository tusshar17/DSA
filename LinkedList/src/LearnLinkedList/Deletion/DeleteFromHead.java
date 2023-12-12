package LearnLinkedList.Deletion;



class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
}

public class DeleteFromHead {

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


    // deleting node from head
    static Node deleteFromHead(Node head){
        if (head==null) return head;
        head = head.next;
        return head;
    }

    public static void main(String[] args) {

        Node head = null;

        head = insertAtFirst(30, head);
        head = insertAtFirst(20, head);
        head = insertAtFirst(10, head);

        System.out.println("Before deleting head");
        printList(head);

        head = deleteFromHead(head);

        System.out.println("After deleting from head");
        printList(head);
    }


}
