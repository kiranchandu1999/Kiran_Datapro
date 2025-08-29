class ExceptionExample {
    void m1() throws ClassNotFoundException {
        System.out.println("M1 start..");
        m2();
        System.out.println("M1 end..");
    }

    void m2() throws ClassNotFoundException {
        System.out.println("M2 start..");
        m3();
        System.out.println("M2 end..");
    }
    
    void m3() throws ClassNotFoundException {
        System.out.println("M3 start..");
        int[] arr = {5, 8, 3};
        System.out.println(arr[3]);
        System.out.println(Class.forName("java.lang.String"));
        System.out.println("M3 end..");
    }
}

class ExceptionPropagation {
    public static void main(String[] args) {
        ExceptionExample e1 = new ExceptionExample();
        try {
            e1.m1();
        }
        catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        catch (ClassNotFoundException ce) {
            ce.printStackTrace();
        }
        System.out.println("Remainging program...");
    }
}