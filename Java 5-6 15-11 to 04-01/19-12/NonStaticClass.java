class Outer1 {
    // non static member class (inner class)
    class Inner1 {
        void display() {
            System.out.println("displaying...");
        }
    }

    private int a = 10;

    int getA() {
        return this.a;
    }

    // method to return inner class object
    Inner1 getInnerObject() {
        return new Inner1();
    }
 }

public class NonStaticClass {
    public static void main(String[] args) {
        // outer class object
        Outer1 o1 = new Outer1();

        // inner class object
        Outer1.Inner1 obj1 = o1.getInnerObject();
        obj1.display();
    }
}
