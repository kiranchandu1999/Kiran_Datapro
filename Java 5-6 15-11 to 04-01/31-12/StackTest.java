import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<String> st1 = new Stack<>();
        Stack<String> st2 = new Stack<>();

        // adding
        st1.push("item1");
        st1.push("item2");
        st1.push("item3");
        st1.push("item4");

        // removing
        // st1.pop();

        // reading top value
        // System.out.println(st1.peek());

        while(!st1.isEmpty()) {
            System.out.println(st1.peek());
            st2.push(st1.pop());
        }

        while(!st2.isEmpty()) {
            st1.push(st2.pop());
        }

        System.out.println(st1.search("item1"));

        System.out.println(st1);
    }
}
