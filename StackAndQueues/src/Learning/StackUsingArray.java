package Learning;

class Stack{
    int size = 10;
    int arr[] = new int[size];
    int top = -1;

    // push method
    void push(int x){
        top++;
        arr[top] = x;
    }

    // pop method
    int pop(){
        int x = arr[top];
        top--;
        return x;
    }

    // top method
    int top(){
        return arr[top];
    }

    // size method
    int getSize(){
        return top+1;
    }
}

public class StackUsingArray {

    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push(45);
        stack.push(24);
        stack.push(12);

        System.out.println("Top of the stack before deleting any element: " + stack.top());
        System.out.println("Size of the stack before deleting any element: " + stack.getSize());
        System.out.println("The element deleted is " + stack.pop());
        System.out.println("Size of the stack after popping an element: " + stack.getSize());
        System.out.println("Top of the stack after popping an element: " + stack.top());
    }
}
