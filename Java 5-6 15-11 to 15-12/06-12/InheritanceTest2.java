public class InheritanceTest2 {
    public static void main(String[] args) {
        Dog d1 = new Dog("black", 4, "puppy");
        d1.eat();
    }
}

class Animal {
    // variables
    String color;
    int legs;

    // default
    // Animal() {

    // }

    Animal(String color, int legs) {
        this.color = color;
        this.legs = legs;
    }

    // methods
    void eat() {
        System.out.println("eating..");
    }
}

class Dog extends Animal{
    String dogName;

    //default constructor
    // Dog() {
    //     super();
    // }

    Dog(String color, int legs, String dogName) {
        super(color, legs);
        this.dogName = dogName;
    }

    void bark() {
        System.out.println("barking..");
    }
}