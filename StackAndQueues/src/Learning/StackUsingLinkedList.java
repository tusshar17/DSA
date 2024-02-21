package Learning;


class StackLL{
    private class StackNode{
        int data;
        StackNode next;

        StackNode(int d){
            data = d;
            next = null;
        }
    }

    StackNode top;
    int size;

    StackLL(){
        this.top = null;
        this.size = 0;
    }

    public void stackPush(int x){
        StackNode element = new StackNode(x);
        element.next = top;
        top = element;
        System.out.println("Element pushed");
        size++;
    }

    public int stackPop(){
        if (top==null) return -1;

        int topData = top.data;
        top = top.next;
        return topData;
    }

    public int stackSize(){
        return size;
    }

    public boolean stackIsEmpty(){
        return top == null;
    }

    public void printStack(){
        StackNode curr = top;
        while (curr!=null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}


public class StackUsingLinkedList {

    public static void main(String[] args) {
        StackLL s = new StackLL();
        s.stackPush(10);
        s.stackPush(20);
        s.printStack();
        System.out.println("Element popped " + s.stackPop());
        System.out.println("Stack size: " + s.stackSize());
        System.out.println("Stack is empty or not: " + s.stackIsEmpty());
    }
}
