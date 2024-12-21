// parent class or super class
class Animal {
    String name = "sweety";
    String color;
    int legs;

    void eat(){
        System.out.println("Animal is eating");
    }
}

// child class or sub class
class Dog extends Animal{
    String breed;

    // void eat(){
    //     System.out.println("Dog is eating");
    // }

    void bark(){
        System.out.println("Dog is barking");
    }

}

public class EncapsulationTest {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Animal();

        Animal d1 = new Dog();

        // d1.name = "doggy";
        // d1.bark();
        d1.eat();

        // System.out.println(a2.name);
    }
}