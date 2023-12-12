package LearnLinkedList.Deletion;

public class DeleteNodeOfValue {

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
    static Node deleteKthNode(Node head, int val){

        // if list is empty
        if (head == null) return null;


        //
        Node current = head;
        Node prev = null;
        while (current!=null){
            if (current.data == val){
                if (prev == null){
                    head = head.next;
                }

                else {
                    prev.next = current.next;
                }
            }

            else {
                prev = current;
            }
            current = current.next;

        }

        return head;

    }


    public static void main(String[] args) {

        Node head = null;

        head = insertAtFirst(1, head);
        head = insertAtFirst(7, head);
        head = insertAtFirst(2, head);
        head = insertAtFirst(3, head);

        System.out.println("Before deleting 7");
        printList(head);

        // deleting second node
        head = deleteKthNode(head, 7);

        System.out.println("After deleting node");
        printList(head);


    }



}
