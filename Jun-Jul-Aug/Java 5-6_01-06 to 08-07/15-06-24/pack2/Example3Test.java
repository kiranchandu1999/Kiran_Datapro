package pack2;

import pack1.*;

class B extends AccessModifiers{
    void display(){
        System.out.println(super.id);
    }
}

public class Example3Test {
    public static void main(String[] args) {
        AccessModifiers am1 = new AccessModifiers();
        
        B b1 = new B();
        b1.display();
    
    }
}
