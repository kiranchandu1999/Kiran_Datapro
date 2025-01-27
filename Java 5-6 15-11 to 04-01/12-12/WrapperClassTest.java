public class WrapperClassTest {
    public static void main(String[] args) {
        // boxing
        int a = 5;

        Integer a1 = Integer.valueOf(a);

        // un-boxing
        int b = a1.intValue();

        System.out.println(a + ", " + a1 + ", " + b);

        // auto boxing and auto unboxing
        int c = 10;

        Integer c1 = c;

        int d = c1;

        System.out.println(c + ", " + c1 + ", " + d);
    }
}
