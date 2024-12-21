package pack;

import main.AccessModifiers;

class Example extends AccessModifiers{
    
    void print(){
        AccessModifiers am = new AccessModifiers();
        System.out.println(super.val);
    }
}

public class ProtectedExample{
    public static void main(String[] args) {
        
        Example a1 = new Example();
        a1.print();

        AccessModifiers a4 = new AccessModifiers();
        // System.out.println(a4.val);
    }
}
