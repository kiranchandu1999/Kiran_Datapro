package main;

class A{
    String name = "datapro";

    void display(){
        System.out.println(this.name);
    }
}

public class AccessModifiers {
    public int val = 5;

    public static void main(String[] args) {
        A a1 = new A();
        // a1.name = "srikanth instu=itur";
        // System.out.println(a1.name);
        a1.display();
    }
}
