class Parent {
    int val1 = 20;
}

// single level
class Child extends Parent{
    int val2 = 10;
}

// multi level
class SubChild extends Child {
    int val3 = 30;
}

// heirarchical
class Child2 extends Parent{
    int val4 = 50;
}

public class InheritanceTest {
    public static void main(String[] args) {
        // Parent p1 = new Parent();
        // Child ch1 = new Child();
        // SubChild sc1 = new SubChild();
        Child2 ch2 = new Child2();
        System.out.println(ch2.val4);
    }
}
