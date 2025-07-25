import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> undo = new Stack<>();
        Stack<String> redo = new Stack<>();

        // adding values
        undo.push("Home page");
        undo.push("About page");
        undo.push("Career page");
        undo.push("Contact page");

        // seeing current page
        System.out.println("Viewing: " + undo.peek());

        // back to prev page (undo)
        redo.push(undo.pop());
        System.out.println("Viewing: " + undo.peek());

        // again back to prev page
        redo.push(undo.pop());
        System.out.println("Viewing: " + undo.peek());

        // redo to next page
        if(!redo.isEmpty()) {
            undo.push(redo.pop());
            System.out.println("Viewing: " + undo.peek());
        }
        else {
            System.out.println("Nothing to redo...");
        }

        // again redo to next page
        if(!redo.isEmpty()) {
            undo.push(redo.pop());
            System.out.println("Viewing: " + undo.peek());
        }
        else {
            System.out.println("Nothing to redo...");
        }

        // again redo to next page
        if(!redo.isEmpty()) {
            undo.push(redo.pop());
            System.out.println("Viewing: " + undo.peek());
        }
        else {
            System.out.println("Nothing to redo...");
        }
    }
}