class Outer {
    // inner class
    static class Inner {
        // variables
        int a = 10;

        void print() {
            System.out.println("printing.. " + a);
        }
    }

    // variables
    String color = "white";

    // methods
    void print() {
        System.out.println("printing.. " + color);
    }
}

public class StaticMemberClass {
    public static void main(String[] args) {
        // Outer o1 = new Outer();

        Outer.Inner obj1 = new Outer.Inner();

        obj1.print();
    }
}