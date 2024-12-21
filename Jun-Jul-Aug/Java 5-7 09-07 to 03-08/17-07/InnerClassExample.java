class Outer{
    // non static or inner class
    class Inner{
        public void print(){
            System.out.println("Inner");
        }

        void run(){
            System.out.println("running");
        }
    }

    public void print(){
        // object creation
        Inner in = new Inner();
        in.print();
        in.run();
    }

    public Inner getObject(){
        return new Inner();
    }

}

public class InnerClassExample {
    public static void main(String[] args) {
        Outer o1 = new Outer();
        Outer.Inner ob1 = o1.getObject();

        ob1.print();
    }
}
