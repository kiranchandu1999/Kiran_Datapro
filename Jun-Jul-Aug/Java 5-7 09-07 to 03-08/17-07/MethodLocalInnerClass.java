class Outer3{
    int a = 5;
    // outer class methods
    public void print(){
        int b = 10;
        // local inner class
        class LocalClass{
            public void print(){
                System.out.println("local inner");
            }
        }

        // object
        LocalClass lc = new LocalClass();
        lc.print();
    }
}


public class MethodLocalInnerClass {
    public static void main(String[] args) {
        Outer3 o3 = new Outer3();
        o3.print();
    }
}
