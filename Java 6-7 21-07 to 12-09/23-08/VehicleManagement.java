interface Vehicle {
    void drive();
    void reverse();

    default void startEngine() {
        System.out.println("Starting engine...");
    }

    static void showVehicleBluePrint() {
        System.out.println("This is vehicle interface...");
    }
}

class Car implements Vehicle {
    public void drive() {
        startEngine();
        System.out.println("Car is moving forward..");
    }

    public void reverse() {
        System.out.println("Car is moving reverse...");
    }
}

class Bus implements Vehicle {
    public void drive() {
        startEngine();
        System.out.println("Bus is moving forward..");
    }

    public void reverse() {
        System.out.println("Bus is moving reverse...");
    }
}

class VehicleManagement {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bus();

        v1.drive();
        v2.drive();

        // calling interface static method
        Vehicle.showVehicleBluePrint();
    }
}