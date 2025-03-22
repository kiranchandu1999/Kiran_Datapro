// throw keyword to throw an exception inside a method and 
// throws keyword for manual exception propagation
class Example2 {
    void m1() throws Exception {
        m2();
    }

    void m2() throws Exception {
        // throw new ClassNotFoundException("No class found.....");
        throw new InsufficientBalanceException("sorry, no balance...");
    }
}

public class CheckedExceptionPropagation {
    public static void main(String[] args) {
        Example2 e1 = new Example2();
        try{
            e1.m1();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("program end");
    }
}
