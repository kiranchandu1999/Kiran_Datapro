class Outer {
    // variables

    // methods
    void m1() {
        class MethodInner {
            void display() {
                System.out.println("method inner class");
            }
        }

        MethodInner mi = new MethodInner();
        mi.display();
    }

}

public class MethodLocalInnerClass {
    public static void main(String[] args) {
        Outer o1 = new Outer();
        o1.m1();
    }
}