package LearnLinkedList.Deletion;

public class DeleteKthNode {

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

    // deleting Kth node of Linked List
    static Node deleteKthNode(Node head, int k){

        // if list is empty
        if (head == null) return null;

        // if k is 1, which means it's a headshot
        if (k==1){
            head = head.next;
            return head;
        }

        //
        Node current = head;
        while (current!=null){
            k--;
            if (k==1){
                current.next = current.next.next;
                break;
            }
            current = current.next;
        }

        return head;

    }


    public static void main(String[] args) {

        Node head = null;

        head = insertAtFirst(50, head);
        head = insertAtFirst(40, head);
        head = insertAtFirst(30, head);
        head = insertAtFirst(20, head);
        head = insertAtFirst(10, head);

        System.out.println("Before deleting any node");
        printList(head);

        // deleting second node
        head = deleteKthNode(head, 3);

        System.out.println("After deleting 3rd node");
        printList(head);


    }



}
