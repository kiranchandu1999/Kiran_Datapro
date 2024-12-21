class Outer {
    // non static or inner class
    class Inner {
        public void print() {
            System.out.println("Inner");
        }

        void run(){
            System.out.println("running");
        }
    }

    public void print() {
        System.out.println("Outer");
    }

    public Inner getInner() {
        return new Inner();
    }

}

public class InnerClassExample {
    public static void main(String[] args) {
        Outer o1 = new Outer();
        Outer.Inner a = o1.getInner();
        a.run();
    }
}
