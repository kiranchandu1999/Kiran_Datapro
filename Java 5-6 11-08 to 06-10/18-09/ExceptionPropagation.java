class ExceptionDemo {
    void m1() {
        m2();
        System.out.println("m1 method end..");
    }

    void m2() {
        m3();
        System.out.println("m2 method end..");
    }

    void m3() {
        int[] arr = {5, 8};
        System.out.println(arr[2]);
        System.out.println("m3 method end..");
        // I don't want to handle exception here
        // try {
        //     System.out.println(arr[2]);
        // }
        // catch(ArrayIndexOutOfBoundsException aie) {
        //     System.out.println(aie);
        // }
    }
}

public class ExceptionPropagation {
    public static void main(String[] args) {
        ExceptionDemo ed = new ExceptionDemo();
        try {
            ed.m1();
        }
        catch(ArrayIndexOutOfBoundsException aie) {
            aie.printStackTrace();
        }

        // remaing program
        System.out.println("remaing program..");
    }
}
