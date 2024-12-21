interface ABC{
    // abstract method
    void print();

    void run();
}

// class Child implements ABC{
//     public void print(){
//         System.out.println("interface calling");
//     }

//     public void run(){
//         System.out.println("running");
//     }
// }

public class AnonymousClass {
    public static void main(String[] args) {
        // ABC ob1 = new Child();
        // ob1.print();

        ABC ob2 = new ABC(){
            public void print(){
                System.out.println("interface calling");
            }
                
            public void run(){
                System.out.println("running");
            }
        };

        ob2.print();
    }
}
