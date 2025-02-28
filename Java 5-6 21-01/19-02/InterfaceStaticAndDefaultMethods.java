interface Parent {
    void print();

    // static methods
    static void display() {
        System.out.println("display method");
    }

    // default methods
    default void run() {
        System.out.println("run method");
    }
}

class Child implements Parent {
    public void print() {
        System.out.println("sensitive data");
    }
}

public class InterfaceStaticAndDefaultMethods {
    public static void main(String[] args) {
        Parent obj1 = new Child();
        obj1.print();
        Parent.display();
        obj1.run();
    }
}
