import java.util.*;

class Browser {
    Stack<String> s1 = new Stack<>();
    Stack<String> s2 = new Stack<>();

    // visist url
    void visit(String url) {
        s1.push(url);
        System.out.println("Current viewing page: " + s1.peek());
    }

    void undo() {
        s2.push(s1.pop());
        System.out.println("Current viewing page: " + s1.peek());
    }

    void redo() {
        if(!s2.isEmpty()) {
            s1.push(s2.pop());
            System.out.println("Current viewing page: " + s1.peek());
        }
        else {
            System.out.println("Nothing to redo...");
        }
    }
}

class StackExample {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        // adding elements LIFO
        st.push(5);
        st.push(8);
        st.push(3);

        // accessing value
        System.out.println("Stack peek: " + st.peek()); // 3

        // removing values
        System.out.println("Last popped value: " + st.pop()); // removes top value (3)

        // iterator
        for(int x: st) {
            System.out.println(x);
        }

        System.out.println(st);

        // browser
        Browser b1 = new Browser();
        b1.visit("Fb login");
        b1.visit("Friends page");
        b1.visit("Reels page");

        b1.undo(); // Friends page
        b1.redo(); // Reels page
        b1.redo();
    }
}