class A{
    A(String a){
        System.out.println("const 1");
    }

    A(int id){
        this("Hi");
        System.out.println("const 2 " + id);
    }
}

class B extends A {
    // default constructor
    // B(){
    //     super();
    // }

    B(int a){
        super(a);
        System.out.println("B cont 1");
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
    }

    void display(){
        super.print();
    }
}

public class SuperKeyword {
    public static void main(String[] args){
        // A a1 = new A(5);

        B b1 = new B(10);

        // C c1 = new C();
        // System.out.println(c1);
    }
}