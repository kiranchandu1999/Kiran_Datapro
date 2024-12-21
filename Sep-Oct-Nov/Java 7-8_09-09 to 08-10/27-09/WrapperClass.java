public class WrapperClass {
    public static void main(String[] args) {
        // wrapper class object
        // boxing
        Integer a1 = Integer.valueOf(10);
        System.out.println(a1);

        Double d1 = Double.valueOf(15);
        System.out.println(d1);

        // unboxing
        int a2 = a1.intValue();

        // auto boxing
        Integer a3 = 5;

        // auto un-boxing
        int a4 = a3;
    }
}
