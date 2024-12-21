package pack;

import main.AccessModifiers;

class Example extends AccessModifiers{
    int val = 20;
    void display(){
        System.out.println(super.val);
    }
}

public class ProtectedExample{
    public static void main(String[] args) {
        
        Example a1 = new Example();
        a1.display();

        AccessModifiers a4 = new AccessModifiers();
        // System.out.println(a4.val);
    }
}
