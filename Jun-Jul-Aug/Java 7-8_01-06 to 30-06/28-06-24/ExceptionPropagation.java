class Parent{
    void m1() throws ClassNotFoundException{
        m2();
    }

    void m2() throws ClassNotFoundException{
        m3();
    }

    void m3() throws ClassNotFoundException{
        int[] arr = new int[3];

        // System.out.println(arr[3]);

        // throwing exception intentionally
        // throw new NumberFormatException();
        
        // checked exceptions will not be propagated automatically, so should handle or throw to previous calling method
        throw new ClassNotFoundException();
    }
}

public class ExceptionPropagation {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        try{
            p1.m1();
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("program end");
        
    }
}
