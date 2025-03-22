public class WrapperClassExample {
    public static void main(String[] args) {
        // primitive value
        int a = 10;

        // Wrapper class object (boxing)
        Integer b = Integer.valueOf(a);

        // un-boxing - converting to primitive from wrapper object
        int c = b.intValue();

        System.out.println(a + "," + b + "," + c);

        // auto boxing & auto un-boxing
        int x = 20;

        Integer y = x;

        int z = y;
    }
}
