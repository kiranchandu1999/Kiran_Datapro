public class WrapperClass {
    public static void main(String[] args) {
        // boxing === primitive to object
        int a = 10;
        Integer aObj = Integer.valueOf(a);
        System.out.println(aObj);

        // unboxing === object to primitive
        int b = aObj.intValue();
        System.out.println(b);

        // auto boxing and auto unboxing
        int x = 20;
        Integer xObj = x;

        int y = xObj;
        System.out.println(y);
    }
}
