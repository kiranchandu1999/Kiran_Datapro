import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> studentsData = new HashMap<>();
        // adding data
        studentsData.put(101, "Roshan");
        studentsData.put(102, "Naresh");
        studentsData.put(103, "Priyanka");
        studentsData.put(104, "Ujjwala");

        studentsData.put(104, "Roshan"); // 104 value will be replaced

        // if(!studentsData.containsKey(104)) {
        //     studentsData.put(104, "Roshan");
        // }
        studentsData.putIfAbsent(102, "Raju");

        // reading values
        System.out.println(studentsData.get(103)); // Priyanka

        // iteraing over map
        for(int key: studentsData.keySet()) {
            System.out.println(key);
        }

        for(String val: studentsData.values()) {
            System.out.println(val);
        }

        for(Map.Entry<Integer, String> pair : studentsData.entrySet()) {
            System.out.println(pair);
        }

        // removing data
        studentsData.remove(103);

        System.out.println(studentsData);
    }
}
