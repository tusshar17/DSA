package DoublyLinkedList.Insertion;


class Node{
    int data;
    Node next;
    Node prev;

    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    Node(int data, Node next, Node prev){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}

public class InsertAtHead {

    public static void printList(Node head){
        while (head!=null){
            System.out.print(head.data);
            System.out.print("->");
            head = head.next;
        }
        System.out.println("END");
    }

    public static Node convertArrayToDLL(int[] arr){
        Node head = new Node(arr[0]);
        Node prev = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }

        return head;
    }

    static Node insertAtHead(Node head,int x){

        // creating new node
        Node newNode = new Node(x, head, null);
        
        head.prev = newNode;

        return newNode;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Node head = convertArrayToDLL(arr);

        System.out.println("Before inserting at head");
        printList(head);

        head = insertAtHead(head, 0);

        System.out.println("After inserting at head");
        printList(head);
    }
}
