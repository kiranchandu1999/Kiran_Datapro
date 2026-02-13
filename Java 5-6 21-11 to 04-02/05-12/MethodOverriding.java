class Vehicle {
    void service() {
        System.out.println("General service for vehicle");
    }
}

class Car extends Vehicle {
    @Override
    void service() {
        System.out.println("Car service for changing engine oil and wheel alignment");
    }
}

class Bike extends Vehicle {
    @Override
    void service() {
        System.out.println("Bike service for changing chain and gear alignment");
    }
}


// Covariant return type example
class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }

    Animal reproduce() {
        return new Animal();
    }
}

class Dog extends Animal {
    // covariant return type
    @Override
    Dog reproduce() {
        return new Dog();
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        v1.service();

        Car c1 = new Car();
        c1.service();

        Bike b1 = new Bike();
        b1.service();

        Animal a1 = new Animal();
        Animal childAnim = a1.reproduce();

        Dog d1 = new Dog();
        Dog dogBaby = d1.reproduce();

        final double PI = 3.14;
        // PI = 4.36; // we can't update final variable
    }
}
