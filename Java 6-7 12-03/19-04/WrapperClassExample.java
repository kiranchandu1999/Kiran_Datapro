public class WrapperClassExample {
    public static void main(String[] args) {
        // 8 wrapper classes for 8 primitive data types
        // boxing: converting primitive to wrapper class object
        int a = 10;
        Integer obj1 = Integer.valueOf(a);

        System.out.println("primitive: " + a);
        System.out.println("wrapper object: " + obj1);

        // un-boxing: converting wrapper class object to primitive
        int b = obj1.intValue();
        System.out.println(b);

        // auto boxing and auto unboxing
        int x = 50;
        Integer obj2 = x; // jvm internally calls Integer.valueOf(x);

        int y = obj2; // jvm internally calls obj2.intValue();

        System.out.println("primitive: " + x);
        System.out.println("wrapper: " + obj2);
        System.out.println("converted to primitive: " + y);


        // Double
        double dNum1 = 16.85;
        Double dObj1 = Double.valueOf(dNum1);

        // Character
        char ch1 = '5';
        char ch2 = 'a';
        Character chObj1 = ch1;
        Character chObj2 = ch2;

        System.out.println(Character.isDigit(ch1));
        System.out.println(Character.isDigit(ch2));
        System.out.println(Character.isLetter(ch1));
        System.out.println(Character.isLetter(ch2));
    }
}
