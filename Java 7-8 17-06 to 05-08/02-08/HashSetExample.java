import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Register email ids
        // Set<String> emailRegister = new HashSet<>();
        // Set<String> emailRegister = new LinkedHashSet<>();
        Set<String> emailRegister = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        // adding emails ids
        while(true) {
            String newEmail = sc.next();
            if(newEmail.equals("stop")) {
                break;
            }
            if(emailRegister.add(newEmail)) {
                System.out.println("Email Registered...");
            }
            else {
                System.out.println("Sorry, Email already exist..");
            }
        }

        // Removing emails from set
        if(emailRegister.remove("abc@example.com")) {
            System.out.println("Email id removed..");
        }
        else {
            System.out.println("This email id not exist to remove..");
        }

        // check whether this email exist or not
        if(emailRegister.contains("xyz@example.com")) {
            System.out.println("This email exist in this Register");
        }

        // iteration over set
        System.out.println("======= Final list of emails are ======");
        for(String e: emailRegister) {
            System.out.println(e);
        }

    }
}
