interface Vehicle {
    void drive();

    default void start() {
        System.out.println("Started");
    }

    // interface level
    static void design() {
        System.out.println("vehicle designed....");
    }
}

class Car implements Vehicle {
    CarType type;
    @Override
    public void drive() {
        System.out.println("Car is running on the road...");
    }
}

class Bike implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Bike is running on the road...");
    }
}

public class VehicleSystem {
    public static void main(String[] args) {
        // design vehicle
        Vehicle.design();

        // make vehicle object
        Vehicle v1 = new Car();
        v1.start();
        v1.drive();

        Car c1 = new Car();
        c1.type = CarType.SEDAN;
    }
}
