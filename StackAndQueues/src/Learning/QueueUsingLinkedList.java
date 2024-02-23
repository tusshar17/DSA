package Learning;


class QueueLL{

    private class QueueNode{
        int data;
        QueueNode next;

        QueueNode(int d){
            data = d;
            next = null;
        }
    }

    QueueNode front, rear;
    int size;

    QueueLL(){
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public void enqueue(int val){
        QueueNode node = new QueueNode(val);

        if (front ==null){
            front = node;
            rear = node;
        }
        else {
            rear.next = node;
            rear = rear.next;
        }

        size++;
        System.out.println("Element Enqueued : " + val);
    }

    public int dequeue(){
        int dropped;

        if (front !=null){
            dropped = front.data;
            front = front.next;
            size--;
            return dropped;
        }

        return -1;
    }

    public int peek(){
        if (front ==null){
            System.out.println("Queue is empty");
            return -1;
        }

        return front.data;
    }

    public boolean isEmpty(){
        return front == null;
    }

    public int size(){
        return size;
    }


}

public class QueueUsingLinkedList {

    public static void main(String[] args) {
        QueueLL queue = new QueueLL();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println("The size of queue is : " + queue.size);
        System.out.println("The peek of queue is : " + queue.peek());
        System.out.println("-------------------------------------");
        System.out.println("First Dequeue : " + queue.dequeue());
        System.out.println("The peek of queue after first dequeue : " + queue.peek());
        System.out.println("The size of queue after first dequeue : " + queue.size);
    }
}
