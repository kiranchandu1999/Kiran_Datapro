interface Vehicle {
    void accelerate();

    void reverse();

    // we can write non abstract methods using default or static keywords
    default void showLicense() {
        System.out.println("Showing license..");
    }
}

class Bike implements Vehicle {
    public void accelerate() {
        // bike logic
        System.out.println("Bike is accelerating...");
    }

    public void reverse() {
        System.out.println("Bike is reversing...");
    }
}

class Car implements Vehicle {
    public void accelerate() {
        System.out.println("Car is accelerating..");
    }

    public void reverse() {
        System.out.println("Car is reversing..");
    }
}

public class VehicleSystem {
    public static void main(String[] args) {
        Vehicle b1 = new Bike();
        b1.accelerate();
        // Vehicle.showLicense();
        b1.showLicense();
    }
}
