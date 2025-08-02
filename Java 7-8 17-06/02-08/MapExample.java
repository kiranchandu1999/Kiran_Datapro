import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        // storing username and password credentails using map
        Map<String, String> credentails = new HashMap<>();
        // adding key/value pairs
        credentails.put("alice", "alice@987");
        credentails.put("john", "john@123");
        credentails.put("doe", "doe@586");

        // try to login into the system using username and password
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username:");
        String userName = sc.next();

        if(credentails.containsKey(userName)) {
            System.out.println("Enter password:");
            String password = sc.next();
            if(credentails.get(userName).equals(password)) {
                System.out.println("Login successful..");
            }
            else {
                System.out.println("Wrong password..");
            }
        }
        else {
            System.out.println("Invalid username..");
        }

        // iteration
        for(String k: credentails.keySet()) {
            System.out.println(k);
        }

        for(String v: credentails.values()) {
            System.out.println(v);
        }

        for(Map.Entry<String, String> kv: credentails.entrySet()) {
            System.out.println(kv);
        }
    }
}
