@FunctionalInterface
interface Parent {
    // abstract
    String getPassword(int userId);

    default void printDetails() {
        System.out.println("showing company info");
    }

    static void display() {
        System.out.println("This is a static..");
    }
}

class Child implements Parent {
    public String getPassword(int userId) {
        if(userId < 10) {
            return "single_digit";
        }
        else {
            return "double digit";
        }
    }
}

public class DefaultAndStaticInInterface {
    public static void main(String[] args) {
        Parent p1 = new Child();
        String pass = p1.getPassword(5);
        System.out.println(pass);
        p1.printDetails();

        Parent.display();
    }
}
