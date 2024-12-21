package pack1;

class A{
    // private variable
    private String name = "kiran";

    // default variable
    int num1 = 10;

    void display(){
        System.out.println(this.name);
    }
}

public class AccessModifiers{
    // 
    protected int id = 101;

    public static void main(String[] args){
        A a1 = new A();
        // can't use private members
        // System.out.println(a1.name);
        // a1.name = "sai";
        a1.display();
    }
}