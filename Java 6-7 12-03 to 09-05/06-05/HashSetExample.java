import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Email registration system
        // Set<String> emails = new HashSet<>();
        // Set<String> emails = new LinkedHashSet<>();
        Set<String> emails = new TreeSet<>((a, b) -> {
            return b.compareTo(a);
        });
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Enter email address or type exit to stop");
            String email = sc.nextLine();
            if(email.equals("exit")) {
                break;
            }
            // adding email
            if(emails.add(email)) {
                System.out.println("Registered email address...");
            }
            else {
                System.out.println("Already email exists, please try with new one");
            }
        }

        // remove xyz@gmail
        emails.remove("xyz@gmail");

        System.out.println("Registered email addresses:");
        for(String e: emails) {
            System.out.println(e);
        }
    }
}
