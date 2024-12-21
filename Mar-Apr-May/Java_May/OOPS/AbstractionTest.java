package OOPS;

abstract class AbstractParent {
    AbstractParent () {
        System.out.println("constructor");
    }
    abstract void run();

    void display () {
        System.out.println("diplaying");
    }
}

class AbstractChild extends AbstractParent {
    void run () {
        System.out.println("password");
    }
}

public class AbstractionTest {
    public static void main(String[] args) {
        // AbstractParent ap = new AbstractChild();

    }
}
