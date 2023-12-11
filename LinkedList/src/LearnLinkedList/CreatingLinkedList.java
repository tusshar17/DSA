package LearnLinkedList;


import org.w3c.dom.ls.LSOutput;

class Node{
    int data; // data value
    Node next; // reference to the next node of list

    // constructors
    Node(int data){
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
}

public class CreatingLinkedList {

    public static void main(String[] args) {

        // creating a new node
        Node x = new Node(10);

        // printing the data stored in node
        System.out.println(x.data);

        // creating a reference to the previous node
        Node y = x;
        System.out.println("Reference to the node : " + y);

    }


}
