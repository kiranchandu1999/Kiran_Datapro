interface ABC{
    // abstract method
    void print();

    void run();
}

// class Child implements ABC{
//     public void print(){
//         System.out.println("interface calling");
//     }
// }

public class AnonymousClass {
    public static void main(String[] args) {
        // ABC ob1 = new Child();
        // ob1.print();

        ABC ob2 = new ABC(){
            public void print(){
                System.out.println("anonymous");
            }

            public void run(){
                System.out.println("rnning");
            }
        };

        ob2.run();

    }
}
