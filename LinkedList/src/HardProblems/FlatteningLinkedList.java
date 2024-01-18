package HardProblems;


class LLNode{
    int val;
    LLNode bottom;
    LLNode next;

    LLNode(int value){
        this.val = value;
    }

    public LLNode(int val, LLNode next) {
        this.val = val;
        this.next = next;
    }
}

public class FlatteningLinkedList {

    static LLNode mergeTwoLL(LLNode a, LLNode b){
        LLNode temp = new LLNode(0);
        LLNode res = temp;

        while (a!=null && b!=null){
            if (a.val<b.val){
                temp.bottom = a;
                temp = temp.bottom;
                a = a.bottom;
            }
            else {
                temp.bottom = b;
                temp = temp.bottom;
                b = b.bottom;
            }
        }

        if (a!=null) temp.bottom = a;
        else temp.bottom = b;

        return res.bottom;
    }

    static LLNode flattenList(LLNode head){

        if (head == null || head.next==null) return head;

        head.next = flattenList(head.next);

        head = mergeTwoLL(head, head.next);

        return head;
    }


    static void printList(LLNode head){
        LLNode current = head;

        while (current!=null){
            System.out.print(current.val + " : ");
            LLNode temp = current.bottom;
            while (temp!=null){
                System.out.print(temp.val + "->");
                temp = temp.next;
            }
            System.out.println("-> END");
            current = current.next;
        }
    }

    static void printFlattenedList(LLNode head){
        LLNode temp = head;
        while (temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.bottom;
        }
        System.out.println();
    }


    public static void main(String[] args) {

        // creating a sublist 1
        LLNode s13 = new LLNode(8, null);
        LLNode s12 = new LLNode(7, s13);
        LLNode s11 = new LLNode(5, s12);

        // creating a sublist 2
        LLNode s22 = new LLNode(20, null);
        LLNode s21 = new LLNode(10, s22);

        // creating a sublist 3
        LLNode s34 = new LLNode(45, null);
        LLNode s33 = new LLNode(40, s34);
        LLNode s32 = new LLNode(35, s33);
        LLNode s31 = new LLNode(28, s32);

        // creating main list
        LLNode m2 = new LLNode(22);
        m2.bottom = s31;
        m2.next = null;

        LLNode m1 = new LLNode(10);
        m1.bottom = s21;
        m1.next = m2;

        LLNode head = new LLNode(4);
        head.bottom = s11;
        head.next = m1;

        System.out.println("Original List:");
        printList(head);

        head = flattenList(head);
        System.out.println("Flattened List:");
        printFlattenedList(head);
    }
}
