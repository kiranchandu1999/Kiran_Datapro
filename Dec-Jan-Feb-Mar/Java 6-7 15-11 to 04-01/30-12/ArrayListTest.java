import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        // arraylist object creation
        ArrayList<Integer> al1 = new ArrayList<Integer>();

        // adding elements
        al1.add(5);
        al1.add(10);
        al1.add(2, 20);
        al1.add(32);
        al1.add(56);

        // update
        al1.set(1, 12);

        // remove
        al1.remove(Integer.valueOf(12)); // using object
        al1.remove(1); // using index

        if(al1.contains(12)) {
            System.out.println("exist");
        }

        // al1.clear();

        System.out.println(al1.isEmpty());

        System.out.println(al1.indexOf(32));

        System.out.println(al1);

        // storing into an array
        Object[] arr1 = al1.toArray();
        System.out.println(arr1);

        for(int i=0; i<arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}