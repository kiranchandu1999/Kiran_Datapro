// blueprint
class Car {
    // attributes
    String brand;
    String modelName;
    String color;
    int speedLimit;

    // methods
    void accelerate() {
        System.out.println("Car is accelerating...");
    }
}

class CarExample {
    public static void main(String[] args) {
        // create car object
        Car car1 = new Car();
        // assigning values to the car1 object
        car1.brand = "Toyota";
        car1.modelName = "Innova";
        car1.color = "black";
        car1.speedLimit = 150;

        System.out.println(car1.color);

        // create another car object
        Car car2 = new Car();
        car2.brand = "Toyota";
        car2.modelName = "Fortuner";
        car2.color = "white";
        car2.speedLimit = 200;

        System.out.println(car2.modelName);
    }
}
