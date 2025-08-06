public class ExceptionPropagation {

    void m1() throws ClassNotFoundException {
        System.out.println("Method m1 start"); // 1
        m2();
        System.out.println("Method m1 end");
    }

    void m2() throws ClassNotFoundException {
        System.out.println("Method m2 start"); // 2
        m3();
        System.out.println("Method m2 end");
    }

    void m3() throws ClassNotFoundException {
        System.out.println("Method m3 start"); // 3
        int[] arr = {5, 10, 20};
        // System.out.println(arr[3]);
        throw new ArrayIndexOutOfBoundsException("Hello");
        // try {
        //     System.out.println(Class.forName("java.lang.String"));
        // } 
        // catch(Exception e) {
        //     System.out.println(e);
        // }
        // System.out.println(Class.forName("java.lang.String"));
        // System.out.println("Method m3 end");
    }

    public static void main(String[] args) {
        ExceptionPropagation obj = new ExceptionPropagation();
        try {
            obj.m1();
        }
        catch(Exception e) {
            e.printStackTrace();
        }

        System.out.println("Remaining program...");
        System.out.println("Program end..");
    }
}
