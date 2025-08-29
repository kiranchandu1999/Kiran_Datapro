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
        System.out.println("Dog makes sound as bark...");
    }

    // covariant return type
    @Override
    Dog reproduce() {
        return new Dog();
    }
}

class Cat extends Animal {

}

public class MethodOverriding {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.sound();
        Dog d1 = new Dog();
        d1.sound();

        Dog puppy = d1.reproduce();
        puppy.sound();

        // final variable
        final int a = 10;
        // a = 20; // can't update final variable
        System.out.println(a);
    }
}
