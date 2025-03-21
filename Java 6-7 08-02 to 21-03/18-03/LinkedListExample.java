import java.util.LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class MyLinkedList {
    Node head;

    void add(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
        }
        else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void remove() {
        if(head == null) {
            System.out.println("list is empty");
        }
        else if(head.next == null) {
            head = null;
        }
        else {
            Node temp = head;
            while(temp.next != null && temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    void display() {
        Node temp = head;
        while(temp.next != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print(temp.data);
    }
}

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        // adding elements
        list.add(5);
        list.add(8);
        list.addFirst(10);
        list.addLast(12);

        list.add(2, 15);
        list.add(5);

        // update
        list.set(3, 16);
        // list.replaceAll(x -> {
        //     if(x % 2 == 0) {
        //         return x * 2;
        //     }
        //     return x * 3;
        // });

        // getting elements
        System.out.println(list.get(2));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        // removing elements
        // list.remove(); // removes the head
        // list.removeFirst();
        // list.removeLast();
        // list.remove(1);
        list.removeLastOccurrence(5);

        // misc
        if(list.contains(40)) {
            System.out.println("exists");
        }

        System.out.println(list.size());

        System.out.println(list);


        MyLinkedList ml = new MyLinkedList();
        ml.add(10);
        ml.add(15);
        ml.add(25);
        ml.add(30);

        ml.remove();
        ml.remove();

        ml.display();
    }
}