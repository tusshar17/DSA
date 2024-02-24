package Learning;


import java.util.Stack;

class StackMin{

    Stack<Long> st = new Stack<Long>();
    Long min;

    StackMin(){
        min = Long.MIN_VALUE;
    }

    public void push(int value){
        Long val = Long.valueOf(value);

        if (st.isEmpty()){
            min = val;
            st.push(val);
        }
        else {
            if (val<min){
                st.push(2 * val - min);
                min = val;
            }
            else {
                st.push(val);
            }
        }
    }

    public void pop(){
        if (st.isEmpty()) return;

        Long val = st.pop();
        if (val<min){
            min = 2 * min - val;
        }
    }

    public int top(){
        Long val = st.peek();
        if (val < min){
            return min.intValue();
        }

        return val.intValue();
    }

    public int getMin() {
        return min.intValue();
    }
}


public class MinStack {

    public static void main(String[] args) {

        StackMin stackMin = new StackMin();
        stackMin.push(23);
        stackMin.push(21);
        stackMin.push(13);
        stackMin.push(17);
        System.out.println("Minimum : " + stackMin.getMin());
        stackMin.pop();
        System.out.println("Pop!");
        stackMin.pop();
        System.out.println("Pop!");
        System.out.println("Minimum : " + stackMin.getMin());
    }
}
