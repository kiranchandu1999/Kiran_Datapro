package pack2;

final class ABC{
    final int a = 10;

    // void change(int a){
    //     this.a = a;
    // }

    final void run(){
        System.out.println();
    }
}

// can't inherit the final class
// class C extends ABC{
//     // can't override final method
//     // void run(){
//     //     System.out.println("class C");
//     // }
// }

public class FinalVariable {
    public static void main(String[] args) {
        ABC a1 = new ABC();
        // a1.change(5);
        System.out.println(a1.a);
    }
}
