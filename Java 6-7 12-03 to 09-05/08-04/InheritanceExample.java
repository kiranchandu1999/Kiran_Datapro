// parent class
class Animal {
    // default constructor
    Animal() {

    }

    void eat() {
        System.out.println("Animal eating...");
    }
}

// child class
class Dog extends Animal {
    // default constructor
    Dog() {
        super();
    }

    void bark() {
        System.out.println("Dog barking...");
    }
}

// sub child class
class BabyDog extends Dog {
    void weep() {
        System.out.println("baby dog weeping...");
    }
}

class InheritanceExample {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.eat();

        Dog d1 = new Dog();
        d1.eat();
    }
}