import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        // Map to store user credentials
        Map<String, String> credentials = new HashMap<>();
        // adding data to the map
        credentials.put("bob", "bob@123");
        credentials.put("john", "john@987");
        credentials.put("doe", "doe@111");
        // add if not present
        credentials.putIfAbsent("john", "john@555");

        // accessing values
        // System.out.println(credentials.get("john"));
        // accessing value that not exist in map
        // System.out.println(credentials.getOrDefault("alice", "Empty"));

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter userId: ");
        // String userId = sc.nextLine();

        // if(credentials.containsKey(userId)) {
        //     System.out.println("Enter password: ");
        //     String password = sc.nextLine();
        //     if(credentials.get(userId).equals(password)) {
        //         System.out.println("Successfully Logged in...");
        //     }
        //     else {
        //         System.out.println("Wrong password!!!");
        //     }
        // }
        // else {
        //     System.out.println("Not a valid userId!!!");
        // }

        // iterating on map
        for(String key: credentials.keySet()) {
            System.out.println(key);
        }

        for(String val: credentials.values()) {
            System.out.println(val);
        }

        for(Map.Entry<String, String> e: credentials.entrySet()) {
            System.out.println(e);
        }
    }
}
