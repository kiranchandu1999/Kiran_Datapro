import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[3] = 5;
        arr[0] = 3;
        int len = arr.length;
        ArrayList<Integer> al = new ArrayList<Integer>();

        al.add(5);
        al.add(3);
        al.add(9);
        al.add(15);
        al.add(2);

        // System.out.println(al);

        // arr[0] = 5;
        // // to add elements in order
        // al.add(5);

        // // to add at particular index
        // al.set(2, 8);

        // // get element at index 3
        // int val1 = arr[3];
        // int val2 = al.get(3);

        // al.remove(2);

        // al.clear();

        // System.out.println(al.contains(5));

        for(int i=0; i<al.size(); i++){
            System.out.println(al.get(i));
        }
        
    }
}
