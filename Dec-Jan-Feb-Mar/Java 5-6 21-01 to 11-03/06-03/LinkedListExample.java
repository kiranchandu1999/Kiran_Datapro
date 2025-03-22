import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // adding elements
        list.add("mango");
        list.add("orange");
        list.add("banana");
        list.add("kiwi");

        // adding elements at particular index
        list.add(2, "guava");

        // adding elements at first or last
        list.addFirst("apple");
        list.addLast("dragon fruit");

        // update elements
        list.set(1, "grapes");

        // removing elements
        // list.remove(); // removes first element (head)
        // list.remove("banana");
        System.out.println("removed last element: " + list.removeLast());

        // loop on list
        // for(String fruit: list) {
        //     System.out.println(fruit);
        // }

        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("before clearing the list: " + list);

        // to delete all the elements
        list.clear();

        System.out.println("after clearing list: " + list);
    }
}