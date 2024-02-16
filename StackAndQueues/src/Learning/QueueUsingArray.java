package Learning;

class Queue{

    private int arr[];
    private int start, end, currSize, maxSize;

    public Queue(int maxSize){
        arr = new int[16];
        start = -1;
        end = -1;
        currSize = 0;
        this.maxSize = maxSize;
    }

    public void push(int newElement){
        if (currSize == maxSize){
            System.out.println("Queue is full\nExiting...");
            System.exit(1);
        }
        if (end == -1){
            start = 0;
            end = 0;
        } else {
            end = (end+1)%maxSize;
        }
        arr[end] = newElement;
        System.out.println("The element pushed is " + newElement);
        currSize++;
    }

    public int pop(){
        if (start == -1){
            System.out.println("Queue is empty\nExiting..");
            System.exit(1);
        }

        int popped = arr[start];
        if (currSize==1){
            start--;
            end--;
        }else{
            start = (start+1)%maxSize;
        }
        currSize--;
        return popped;
    }

    public int top(){
        if (start == -1){
            System.out.println("Queue is empty\nExiting...");
            System.exit(1);
        }
        return arr[start];
    }

    public int getSize(){
        return currSize;
    }

}
public class QueueUsingArray {

    public static void main(String[] args) {
        Queue q = new Queue(6);
        q.push(12);
        q.push(15);
        q.push(23);
        q.push(16);
        System.out.println("The peek of Queue before deleting any element: " + q.top());
        System.out.println("The size of Queue before deleting any element: " + q.getSize());
        System.out.println("First element to be deleted: " + q.pop());
        System.out.println("The peek of Queue after deleting an element: " + q.top());
        System.out.println("The size of Queue after deleting an element: " + q.getSize());
    }
}
