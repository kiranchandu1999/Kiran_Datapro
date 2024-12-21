package main;

class A{
    // private variable
    private String name;
    // default variable
    int id;

    void display(){
        System.out.println(this.name);
    }

    // setter method
    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }
}

public class AccessModifiers {
    // default varibale
    protected int val = 500;

    public static void main(String[] args) {
        A a1 = new A();
        // a1.name = "datapro";
        a1.setName("datapro");
        a1.id = 101;

        System.out.println(a1.getName());

        A a2 = new A();
        // a2.name = "srikanth institute";
        a1.display();
    }
}
