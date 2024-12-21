class A{
    A(){
        System.out.println(this);
    }
}

class B extends A {
    // default constructor
    // B(){
    //     super();
    //     // System.out.println(this);
    // }

    B(int a){

    }

    void print(){
        System.out.println("printing");
    }
}

class C extends B{
    //default
    C(){
        super(5);
        System.out.println(this);
        super.print();
    }


}

public class SuperKeyword {
    public static void main(String[] args){
        // A a1 = new A();

        // B b1 = new B();

        C c1 = new C();
        System.out.println(c1);
    }
}