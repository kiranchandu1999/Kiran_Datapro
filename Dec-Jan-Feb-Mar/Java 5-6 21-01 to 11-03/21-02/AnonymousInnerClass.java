interface Mobile {
    // method
    void call();
}

// class MobileImpl implements Mobile {
//     // override
//     public void call() {
//         System.out.println("calling...");
//     }
// }

public class AnonymousInnerClass {
    public static void main(String[] args) {
        // Mobile m1 = new MobileImpl();
        // m1.call();

        // anonymous class
        Mobile m2 = new Mobile() {
            // override
            public void call() {
                System.out.println("calling...");
            }
        };

        m2.call();
    }
}
