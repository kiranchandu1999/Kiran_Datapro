class SMCO{
    int a = 5;

    // static member class
    static class SMCI{
        int b = 10;
        // inner class method
        public void print(){
            System.out.println();
            System.out.println("SMCI");
        }
    }

    // outer class method
    public void print(){
        System.out.println("SMCO");
        // can't access 'b'
        // System.out.println(a + b);
    }
}


public class StaticMemberClass{
    public static void main(String[] args) {
        SMCO.SMCI o1 = new SMCO.SMCI();

        o1.print();
    }
}