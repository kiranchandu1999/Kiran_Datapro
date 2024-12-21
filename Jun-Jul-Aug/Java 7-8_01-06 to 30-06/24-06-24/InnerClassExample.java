class Outer{
    // non static or inner class
    public class Inner{
        public void print(){
            System.out.println("Inner");
        }
    }

    private class Inner2{

    }

    protected class Inner3{

    }

    public void print(){
        // object creation
        Inner in = new Inner();
        in.print();
    }

    public Inner getObject(){
        return new Inner();
    }

    public Inner2 getObjectInner2(){
        return new Inner2();
    }

    public Inner3 getObjectInner3(){
        return new Inner3();
    }

}

public class InnerClassExample {
    public static void main(String[] args) {
        Outer o1 = new Outer();

        Outer.Inner ob1 = o1.getObject();
        ob1.print();

        // Outer.Inner2 ob3 = o1.getObjectInner2();

        Outer.Inner3 ob2 = o1.getObjectInner3();
    }
}
