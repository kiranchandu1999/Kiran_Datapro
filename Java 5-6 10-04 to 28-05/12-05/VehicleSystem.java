interface Vehicle {
    void drive();

    default void start() {
        System.out.println("Started....");
    }

    // interface level
    static void design() {
        System.out.println("vehicle designed....");
    }
}

class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Car is running on the road...");
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
    }
}
