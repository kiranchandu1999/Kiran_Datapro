class Animal {
    void sound() {
        System.out.println("Animal makes sound..");
    }

    Animal reproduce() {
        return new Animal();
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog is barking..");
    }

    void eat(String foodType) {
        System.out.println("Dog is eating " + foodType);
    }

    // Covariant return type
    @Override
    Dog reproduce() {
        return new Dog();
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat sounds meow..");
    }

    @Override
    Cat reproduce() {
        return new Cat();
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.sound();
        Dog d1 = new Dog();
        d1.sound();
        d1.eat("bones");
        Cat c1 = new Cat();
        c1.sound();

        Dog puppy = d1.reproduce();
        puppy.sound();
        puppy.eat("meat");
    }
}
