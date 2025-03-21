// unchecked or runtime exceptions automatically propagated
class Example1 {
    void m1(int a) {
        m2(a);
        System.out.println("m1 printing");
    }

    void m2(int a) {
        m3(a);
        System.out.println("m2 printing");
    }
    
    void m3(int a) {
        int b = 100 / a;
        System.out.println(b);
        
        System.out.println("m3 printing");
    }
}

public class ExceptionPropagation {
    public static void main(String[] args) {
        Example1 e1 = new Example1();
        try{
            e1.m1(0);
        }
        catch(Exception e) {
            e.printStackTrace();
        }

        System.out.println("program end");
    }
}