import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        int[] studentIds = new int[3];
        studentIds[0] = 101;
        studentIds[1] = 102;
        studentIds[2] = 103;
        // new student joined, so need to add that id as well,
        // but array size fixed so we can't increase

        ArrayList<Integer> arrList = new ArrayList<Integer>();

        // adding elements
        arrList.add(10);
        arrList.add(20);
        arrList.add(30);
        arrList.add(40);

        // updating elements
        arrList.set(1, 50);

        // removing elements
        arrList.remove(Integer.valueOf(30));
        // or
        // arrList.remove(2);

        System.out.println(arrList.contains(20));

        System.out.println(arrList.isEmpty());

        System.out.println(arrList.indexOf(40));

        System.out.println(arrList);

        // printing elements in arraylist
        for(int i=0; i<arrList.size(); i++) {
            System.out.println(arrList.get(i));
        }

        Object[] res1 = arrList.toArray();

        Object[] res2 = new Object[arrList.size()];

        arrList.toArray(res2);

        System.out.println(res1[0]);
        System.out.println(res2[0]);
    }
}