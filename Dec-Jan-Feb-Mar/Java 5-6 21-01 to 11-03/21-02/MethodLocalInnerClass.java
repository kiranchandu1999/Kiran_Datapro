class MethodOuter {
    // variables

    // methods
    void print() {
        class MethodInner {
            // variables

            // methods
            void display() {
                System.out.println("displaying from method inner class...");
            }
        }

        MethodInner obj1 = new MethodInner();
        obj1.display();
    }
}

public class MethodLocalInnerClass {
    public static void main(String[] args) {
        MethodOuter m1 = new MethodOuter();
        m1.print();
    }
}
