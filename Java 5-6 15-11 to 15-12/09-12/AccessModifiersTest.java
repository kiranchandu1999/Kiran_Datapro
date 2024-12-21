class A {
    // variables
    private int num1;
    private int num2;

    void setNum1(int num1) {
        this.num1 = num1;
    }

    int getNum1() {
        return this.num1;
    }
}

class ProtectedExample {
    // default
    String fName;

    // protected
    protected int val1;
}

public class AccessModifiersTest {
    public static void main(String[] args) {
        A a1 = new A();
        // a1.a = 10;
        a1.setNum1(10);

        System.out.println(a1.getNum1());
    }
}
