class Car {
    // attributes or variables
    String brand;
    String color;
    int speedLimit;

    // methods
    void accelerate() {
        // method body
        System.out.println(brand + " Car accelerating...");
    }

    void reverse(String c) {
        System.out.println(c + " car reversing...");
    }
}

class CarExample {
    public static void main(String[] args) {
        // car object creation
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.color = "green";
        car1.speedLimit = 120;

        Car car2 = new Car();
        car2.brand = "Suzuki";
        car2.color = "Red";
        car2.speedLimit = 150;

        System.out.println(car1.brand + " " + car1.color + " " + car1.speedLimit);

        System.out.println(car2.brand + " " + car2.color + " " + car2.speedLimit);
        // method calling
        car1.accelerate();
        car2.accelerate();

        car1.reverse(car1.brand);
    }
}
