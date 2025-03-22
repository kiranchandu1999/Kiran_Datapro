import sub.ProtectedExample;

class A {
    // variables
    // private variable
    private int num1;
    // default variable
    int num2;

    void setNum1(int num1) {
        this.num1 = num1;
    }

    int getNum1() {
        return this.num1;
    }
}

class ChildForProtect extends ProtectedExample {
    void print() {
        System.out.println(super.protectNum);
    }
}

public class AccessModifiersTest {
    public static void main(String[] args) {
        A a1 = new A();
        a1.setNum1(10);
        System.out.println(a1.getNum1());

        a1.num2 = 20;
        System.out.println(a1.num2);

        ChildForProtect ch1 = new ChildForProtect();
        ch1.print();
    }
}
