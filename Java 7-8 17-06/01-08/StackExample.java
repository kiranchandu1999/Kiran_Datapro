import java.util.Stack;

class Browser {
    Stack<String> undo = new Stack<>();
    Stack<String> redo = new Stack<>();

    // method to visit any website/url
    void visit(String page) {
        System.out.println("You are seeing: " + page);
        // add the page to the undo stack
        undo.push(page);
    }

    void undo() {
        // remove the top one
        redo.push(undo.pop());
        System.out.println("Previous page: " + undo.peek());
    }

    void redo() {
        undo.push(redo.pop());
        System.out.println("Next page: " + undo.peek());
    }

    void checkUndoStack() {
        if(undo.isEmpty()) {
            System.out.println("No previous pages");
        }
        else {
            System.out.println("No of prev pages: " + undo.size());
        }
    }
}

public class StackExample {
    public static void main(String[] args) {
        Browser b1 = new Browser();
        b1.visit("Home page");
        b1.visit("Career page");
        b1.visit("About page");
        b1.visit("Contact page");

        b1.undo(); // About page
        b1.undo(); // career page

        b1.redo(); // about page
        b1.redo(); // contact page
    }
}