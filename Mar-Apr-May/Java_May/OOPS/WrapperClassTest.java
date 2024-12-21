package OOPS;

public class WrapperClassTest {
    public static void main(String[] args) {
        // primitive
        int a = 5;

        // Integer a1 = Integer.valueOf(a); // boxing

        Integer a1 = a; // auto boxing

        Integer b1 = 5;

        // int b = b1.intValue(); // un boxing

        int b = b1; // auto unboxing
    }
}
