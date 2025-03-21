public class WrapperClassExample {
    public static void main(String[] args) {
        // primitive value
        int a = 10;

        // boxing
        Integer aObj = Integer.valueOf(a);

        // unboxing
        int b = aObj.intValue();

        System.out.println(b);

        // auto boxing
        int x = 20;

        Integer xObj = x;

        // auto unboxing
        int y = xObj;

        System.out.println(y);
    }
}
