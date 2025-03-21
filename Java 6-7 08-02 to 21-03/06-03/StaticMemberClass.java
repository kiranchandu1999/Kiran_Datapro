class Outer {
    // variables
    static int a = 10;

    // static class
    static class Inner {
        int b = 20;

        void print() {
            System.out.println("Inner class printing...");
        }
    }

    // methods
    void print() {
        System.out.println("Outer class printing...");
    }
}

public class StaticMemberClass {
    public static void main(String[] args) {
        Outer o1 = new Outer();
        o1.print();

        Outer.Inner obj1 = new Outer.Inner();
        obj1.print();
    }
}
