class OuterNonStatic {
    class InnerNonStatic {
        void fun() {
            System.out.println("Inner class: " + InnerNonStatic.class);
        }
    }

    void fun() {
        System.out.println("Outer class: " + OuterNonStatic.class);
    }

    InnerNonStatic getInnerObject() {
        return new InnerNonStatic();
    }
}

public class NonStaticMemberClass {
    public static void main(String[] args) {
        OuterNonStatic out1 = new OuterNonStatic();
        out1.fun();

        OuterNonStatic.InnerNonStatic inner1 = out1.getInnerObject();
        inner1.fun();
    }
}
