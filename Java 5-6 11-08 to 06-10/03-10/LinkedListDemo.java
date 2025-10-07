import java.util.*;

// class Node {
//     int val;
//     Node next;

//     Node(int val, Node next) {
//         this.val = val;
//         this.next = next;
//     }
// }

public class LinkedListDemo {
    public static void main(String[] args) {
        // LinkedList
        LinkedList<String> ll1 = new LinkedList<>();
        ll1.add("Item1");
        ll1.add("Item2");
        ll1.add("Item4");
        ll1.add("Item5");

        ll1.addFirst("Item0");

        // inserting item3 in after item2
        ll1.add(2, "Item3");

        // removing 
        ll1.removeLast();

        System.out.println(ll1);
        // Node n1 = new Node(5, null);
        // Node n2 = new Node(8, null);
        // Node n3 = new Node(7, null);
        // n1.next = n2;
        // n2.next = n3;

        // Node temp = n1;
        // while(temp != null) {
        //     System.out.println(temp.val);
        //     temp = temp.next;
        // }
        
    }
}
