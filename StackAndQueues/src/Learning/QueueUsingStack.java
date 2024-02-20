package Learning;


import java.util.Stack;

class MyQueue{
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public MyQueue(){}

    public void push(int x){
        s1.push(x);
        System.out.println("The element pushed : " + x);
    }

    public int pop(){
        while (!s1.empty()){
            s2.push(s1.pop());
        }

        int ans = s2.pop();

        while (!s2.empty()){
            s1.push(s2.pop());
        }

        return ans;
    }

    public int top(){
        while (!s1.empty()){
            s2.push(s1.pop());
        }

        int ans = s2.peek();

        while (!s2.empty()){
            s1.push(s2.pop());
        }

        return ans;
    }

    public int size(){
        return s1.size();
    }
}


public class QueueUsingStack {

    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.push(3);
        q.push(4);
        System.out.println("The element popped is " + q.pop());
        q.push(5);
        System.out.println("The top element is " + q.top());
        System.out.println("The size of the queue is " + q.size());
    }
}
