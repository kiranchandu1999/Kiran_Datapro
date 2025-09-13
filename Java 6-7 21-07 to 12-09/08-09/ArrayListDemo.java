import java.util.*;

class ArrayListDemo {
    public static void main(String[] args) {
        // ArrayList object creation
        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(5, 8, 10));
        // adding elements
        l1.add(8);
        l1.add(10);
        l1.add(12);
        l1.add(6);
        l1.addAll(Arrays.asList(15, 18, 11));
        // accessing elements
        System.out.println(l1.get(3));
        // updating elements
        l1.set(4, 20);
        // inserting elements
        l1.add(4, 19);
        // deleting
        l1.remove(Integer.valueOf(8));
        // clearing all elements
        l1.clear();
        System.out.println(l1);
    }
}