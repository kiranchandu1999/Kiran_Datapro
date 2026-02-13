public class WrapperClassExample {
    public static void main(String[] args) {
        // 8 wrapper classes for 8 primitive data types
        // boxing: converting primitive to wrapper class object
        int a = 10;
        Integer aObj = Integer.valueOf(a);
        // System.out.println(aObj);
        // unboxing: from object to primitive
        int b = aObj.intValue();

        double x = 15.69;
        Double xObj = Double.valueOf(x);
        double y = xObj.doubleValue();

        // auto boxing and unboxing
        Integer a1 = a;
        int b1 = a1;

        int[] arr = {-5, -8, -2, -6, -9};
        int hi = Integer.MIN_VALUE;
        int lo = Integer.MAX_VALUE;

        char ch = 'Y';
        Character chObj = ch;
        System.out.println(Character.isLetter(chObj)); // true
        System.out.println(Character.isDigit(chObj)); // false
    }
}
