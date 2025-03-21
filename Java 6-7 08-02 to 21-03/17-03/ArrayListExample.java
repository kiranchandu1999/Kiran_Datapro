import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        // adding elements
        al.add(5);
        al.add(10);
        al.add(15);
        al.add(8);

        // adding element at given index
        al.add(2, 25);

        // update element
        al.set(2, 22);

        // delete element
        al.remove(Integer.valueOf(15));
        
        // adding collection of elements
        Integer[] arr = {1, 2, 3};
        al.addAll(Arrays.asList(arr));

        // getting values
        // al.get(0);
        for(int i=0; i<al.size(); i++) {
            System.out.println(al.get(i));
        }

        // to convert into an array
        Object[] arr1 = al.toArray();

        // searching
        if(al.contains(Integer.valueOf(18))) {
            System.out.println("Exist");
        }

        // complete list clean
        // al.clear();

        Iterator<Integer> bag = al.iterator();

        while(bag.hasNext()) {
            System.out.println(bag.next());
        }

        al.indexOf(Integer.valueOf(18));
        System.out.println();
    }
}