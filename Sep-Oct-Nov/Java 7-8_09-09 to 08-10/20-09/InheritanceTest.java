class Person{
    String name = "kiran";
    int age;

    void talk(){
        System.out.println("person talking");
    }

    int add(int a, int b){
        return a + b;
    }

    // method overloading / compile time polymorphism
    int add(int a, int b, int c){
        return a+b+c;
    }

    float add(int a, float b){
       return a+b; 
    }
}

class Person2 {
    String name = "sai";
}

class Employee extends Person{
    int id;

    void talk(){
        System.out.println("employee talking");
    }

    void work(){
        System.out.println("emp working");
    }
}

class Child extends Employee {

}

public class InheritanceTest {
    public static void main(String[] args){
        Employee e1 = new Employee();
        // System.out.println(e1.name);
        e1.work();

        Child c1 = new Child();
        // System.out.println(c1.name);

        // long a = 5;
    }
}