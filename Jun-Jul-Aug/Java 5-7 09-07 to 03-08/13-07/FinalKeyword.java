class A1{
    // final variable
    final int val1;

    A1(int a){
        val1 = a; 
    }

    // void assign(int a){
    //     val1 = a;
    // }

    // final method
    final void run(){
        System.out.println(" A1 running");
    }
}

final class B1 extends A1{
    B1(){
        super(10);
    }

    // can't override final method
    // void run(){
    //     System.out.println(" B1 running");
    // }
}

// can't extend final class
// class C1 extends B1{

// }

public class FinalKeyword {
    public static void main(String[] args) {
        A1 a1 = new A1(10);
        // a1.assign(10);
        System.out.println(a1.val1);
    }
}
