import java.io.FileNotFoundException;

class Parent{
    void m1() throws FileNotFoundException{
        m2();
    }

    void m2() throws FileNotFoundException{
        m3();
    }

    void m3() throws FileNotFoundException{
        int[] arr = {};

        // System.out.println(arr[0]);
        throw new FileNotFoundException();
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
