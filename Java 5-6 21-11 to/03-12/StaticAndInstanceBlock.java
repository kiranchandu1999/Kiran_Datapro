class A {
    String name;
    static String college;
    A() {
        System.out.println("Constructor A invoked..");
    }

    // static block
    // when the class get loaded into memory
    static {
        System.out.println("static block invoked..");
        college = "ABCD";
    }

    // instance block
    {
        System.out.println("Instance block invoked..");
    }
}

class StaticAndInstanceBlock {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
    }
}