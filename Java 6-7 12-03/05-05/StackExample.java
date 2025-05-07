import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        Stack<String> redo = new Stack<>();

        // adding values
        st.push("Home page");
        st.push("About page");
        st.push("Career page");
        st.push("Contact page");

        // seeing current page
        System.out.println("Viewing: " + st.peek());

        // back to prev page (undo)
        redo.push(st.pop());
        System.out.println("Viewing: " + st.peek());

        // again back to prev page
        redo.push(st.pop());
        System.out.println("Viewing: " + st.peek());

        // redo to next page
        if(!redo.isEmpty()) {
            st.push(redo.pop());
            System.out.println("Viewing: " + st.peek());
        }
        else {
            System.out.println("Nothing to redo...");
        }

        // again redo to next page
        if(!redo.isEmpty()) {
            st.push(redo.pop());
            System.out.println("Viewing: " + st.peek());
        }
        else {
            System.out.println("Nothing to redo...");
        }

        // again redo to next page
        if(!redo.isEmpty()) {
            st.push(redo.pop());
            System.out.println("Viewing: " + st.peek());
        }
        else {
            System.out.println("Nothing to redo...");
        }
    }
}