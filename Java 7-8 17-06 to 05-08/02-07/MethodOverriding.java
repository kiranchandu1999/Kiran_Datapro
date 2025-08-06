class Animal {
    void eat() {
        System.out.println("Animal is eating..");
    }
}

// It's not an overriding because no relation is there
class Tiger {
    void eat() {
        System.out.println("Tiger is eating..");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking..");
    }

    // method overriding
    // @Override
    void eat() {
        System.out.println("Dog is eating in his style...");
    }

    void callEat() {
        super.eat();
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat is sounding meow meow...");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.bark();
        d1.eat();

        d1.callEat();
    }
}
