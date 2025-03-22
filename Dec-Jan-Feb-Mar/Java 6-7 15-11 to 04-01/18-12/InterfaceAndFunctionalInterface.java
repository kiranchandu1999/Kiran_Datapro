@FunctionalInterface
interface Parent {
    // abstract methods
    boolean login();

    // non abstract methods --> using default keyword or static keyword
    default void display(int a) {
        System.out.println("displaying... " + a);
    }

    static void print() {
        System.out.println("printing...");
    }
}

class Child implements Parent {
    int a;
    public boolean login() {
        return true;
    }
}

class Child2 implements Parent {
    public boolean login() {
        return false;
    }
}

public class InterfaceAndFunctionalInterface {
    public static void main(String[] args) {
        Child ch1 = new Child();
        ch1.a = 5;
        ch1.display(ch1.a);

        Child ch2 = new Child();
        ch2.a = 10;
        ch2.display(ch2.a);


        // creating object for Functional interface
        Parent p = new Parent() {
            public boolean login() {
                return true;
            }
        };

        System.out.println(p.login());
    }
}
