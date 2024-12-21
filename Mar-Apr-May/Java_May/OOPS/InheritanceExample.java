package OOPS;

// parent
class Animal {
    void eat () {
        System.out.println("animal eating");
    }

    void walk () {
        System.out.println("walking");
    }
    // overloading
    long add (int a, int b){
        return a + b;
    }

    long add (int a, long b){
        return  a + b;
    }
}

// child
class Human extends Animal{
    void eat () {
        System.out.println("human eating");
    }
    void talk () {
        System.out.println("talking");
    }
}

// multiple inheritance not possible in java
// class Adult extends Animal, Human {

// }

// child
class MEN extends Animal{
    // void talk () {
    //     System.out.println("talking");
    // }
    void fight () {
        System.out.println("fighting");
    }
}

// child 2
class WOMEN extends Animal {
    void cook () {
        System.out.println("cooking");
    }
}

// // sub child
// class Child extends Human {
//     void cry () {
//         System.out.println("crying");
//     }
// }

public class InheritanceExample {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        // a1.eat();
        // Human h1 = new Human();
        // h1.eat();
        // h1.walk();
        // h1.talk();

        // Child c1 = new Child();
        // c1.walk();
        // c1.talk();
        // c1.cry();

        // Adult a1 = new Adult();
        // a1.eat();
    }    
}
