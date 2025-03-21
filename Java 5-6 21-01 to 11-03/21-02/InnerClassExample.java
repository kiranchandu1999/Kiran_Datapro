class Outer {
    // variables

    // non static member class
    class Inner {
        String type = "non static inner class";

        void show() {
            System.out.println("class type : " + type);
        }

        static void print() {
            System.out.println("static method inside inner class");
        }
    }

    // methods
    void print() {
        System.out.println("outer class...");
    }

    // method to return inner class object
    Inner getInnerObject() {
        return new Inner();
    }
}

public class InnerClassExample {
    public static void main(String[] args) {
        // outer class object
        Outer o1 = new Outer();
        o1.print();

        // calling a method to get the inner class object
        Outer.Inner ic1 = o1.getInnerObject();
        ic1.show();
        Outer.Inner.print();
    }
}
