import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> studentsData = new HashMap<>();
        // adding data
        studentsData.put(101, "Vandhana");
        studentsData.put(102, "Prameela");
        studentsData.put(103, "Yamini");
        studentsData.put(104, "Varshini");

        studentsData.put(104, "Prameela"); // 104 value will be replaced

        // if(!studentsData.containsKey(104)) {
        //     studentsData.put(104, "Prameela");
        // }
        studentsData.putIfAbsent(102, "Raju");

        // reading values
        System.out.println(studentsData.get(103)); // Yamini

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
