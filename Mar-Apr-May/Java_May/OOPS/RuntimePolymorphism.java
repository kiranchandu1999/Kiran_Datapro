package OOPS;

// parent
class Parent {
    int a = 10;

    void run () {
        System.out.println("parent running");
    }
}

// child 1
class Child1 extends Parent{
    int a = 20;

    void run () {
        System.out.println("child 1 running");
    }
}

// child 2
class Child2 extends Parent{

}

class Child11 extends Child1 {

}

class Child21 extends Child2 {

}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        int a = (byte) 2;

        Parent ch = new Child1();

        // Parent ch1 = new Child1();  // upcasting
        
        // Child1 ch2 = (Child1) ch1; // down casting
        // ch.run();
        System.out.println(ch.a);
    }
}
