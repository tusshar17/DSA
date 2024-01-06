package MediumProblems;

class Node{
    int val;
    Node next;

    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }

    public Node() {
    }
}

public class LinkedList {

   public static Node convertArrayToLL(int[] arr){
       Node head = new Node(arr[0], null);

       Node prev = head;

       for (int i=1; i<arr.length; i++) {
           Node newNode = new Node(arr[i], null);
           prev.next = newNode;
           prev = newNode;
       }

       return head;
   }
    
   public static void printList(Node head){
       Node current = head;

       while (current.next!=null){
        System.out.print(current.val + "-->");
        current = current.next;
       }

       System.out.print(current.val + "-->");
       System.out.println("end");

   }



}
