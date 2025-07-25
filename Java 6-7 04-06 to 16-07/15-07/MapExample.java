import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        // Map<String, String> credentials = new HashMap<>();
        // Map<String, String> credentials = new LinkedHashMap<>();
        Map<String, String> credentials = new TreeMap<>((a, b)-> {
            return b.compareTo(a);
        });

        credentials.put("john", "john@123");
        credentials.put("doe", "doe@897");
        credentials.put("krish", "krish@111");
        // credentials.put("doe", "doe@258");

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your user name..");
        // String userName = sc.next();
        // System.out.println("Enter your password..");
        // String password = sc.next();

        // if(credentials.containsKey(userName)) {
        //     if(password.equals(credentials.get(userName))) {
        //         System.out.println("Login successful..");
        //     }
        //     else {
        //         System.out.println("Wrong password...");
        //     }
        // }
        // else {
        //     System.out.println("Not a valid user...");
        // }


        // Iterating over map
        for(String k: credentials.keySet()) {
            System.out.println(k);
        }

        for(String v: credentials.values()) {
            System.out.println(v);
        }

        for(Map.Entry<String, String> pair: credentials.entrySet()) {
            System.out.println(pair);
        }
    }
}
