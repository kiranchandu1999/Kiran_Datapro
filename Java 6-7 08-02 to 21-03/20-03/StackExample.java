import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        // adding
        st.push(15);
        st.push(8);
        st.push(20);
        st.push(10);

        // get elements
        // for(int x: st) {
        //     System.out.println(x);
        // }
        System.out.println(st.peek());

        // remove
        // System.out.println(st.pop());
        // st.remove(Integer.valueOf(8));

        // removing element using stack behaviour
        Stack<Integer> temp = new Stack<>();

        while(!st.isEmpty() && st.peek() != 8) {
            temp.push(st.pop());
        }

        st.pop();

        while(!temp.isEmpty()) {
            st.push(temp.pop());
        }

        System.out.println(st);

    }
}