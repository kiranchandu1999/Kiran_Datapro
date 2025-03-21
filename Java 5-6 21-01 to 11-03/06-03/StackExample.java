import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        // adding elements
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(25);
        st.push(50);

        // removing elements
        System.out.println("stack top removed: " + st.pop());

        // accessing stack top element
        System.out.println("stack top element: " + st.peek());

        // searching
        System.out.println(st.search(20));

        // popping elements
        while (!st.isEmpty()) {
            System.out.println(st.pop());
        }

        System.out.println(st);
    }
}
