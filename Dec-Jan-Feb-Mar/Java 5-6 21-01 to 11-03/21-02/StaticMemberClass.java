class OuterClass {
    // outer class variables
    static int a = 10;

    // static member class
    static class InnerClass {
        // inner class variables
        int x = 100;

        // inner class methods
        void print() {
            System.out.println("inner class printing " + x);
        }
    }

    // outer class methods
    void print() {
        System.out.println("outer class printing " + a);
    }
}

public class StaticMemberClass {
    public static void main(String[] args) {
        // object creation
        OuterClass oc1 = new OuterClass();
        oc1.print();

        // inner static clas object create
        OuterClass.InnerClass ic1 = new OuterClass.InnerClass();
        ic1.print();
    }
}