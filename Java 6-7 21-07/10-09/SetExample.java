import java.util.*;

class SetExample {
    public static void main(String[] args) {
        // HashSet creation
        // Set<String> emailRegister = new HashSet<>();
        // Set<String> emailRegister = new LinkedHashSet<>();
        Set<String> emailRegister = new TreeSet<>((a, b) -> {
            return b.compareTo(a);
        });

        // registering emails
        // emailRegister.add("xyz@gmail.com");
        // emailRegister.add("cdf@gmail.com");
        // emailRegister.add("abc@gmail.com");

        Scanner sc = new Scanner(System.in);
        String newEmail;
        while(true) {
            System.out.println("Enter email: ");
            newEmail = sc.next();
            if(newEmail.equals("exit")) {
                break;
            }
            if(emailRegister.add(newEmail)) {
                System.out.println("Email registered: " + newEmail);
            }
            else {
                System.out.println("Email already exist..");
            }
        }

        // removing emails
        // emailRegister.remove("cdf@gmail.com");

        // reading values from set
        System.out.println("==== Registered Emails =====");
        for(String e: emailRegister) {
            System.out.println(e);
        }
    }
}