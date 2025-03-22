class MethodLocalOuter {
    void method1() {
        class MethodLocalInner {
            int a = 10;

            void print() {
                System.out.println("Method local inner class...");
            }
        }

        MethodLocalInner obj1 = new MethodLocalInner();
        obj1.print();
    }

}

interface Parent {
    void m1();
}

class Child implements Parent {
    public void m1() {
        System.out.println("child class implemented parent interface");
    }
}

public class MethodLocalAndAnonymousExample {
    public static void main(String[] args) {
        MethodLocalOuter out1 = new MethodLocalOuter();
        out1.method1();

        // Parent obj1 = new Child();
        // obj1.m1();

        Parent o1 = new Parent() {
            public void m1() {
                System.out.println("child class implemented parent interface");
            }
        };

        o1.m1();
    }
}