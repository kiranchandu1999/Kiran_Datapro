// blueprint
class Car {
    String model;
    String brand;
    int speedLimit;
    String color;
}

class CarExample {
    public static void main(String[] args) {
        // objects creation
        Car c1 = new Car();
        c1.model = "Innova";
        c1.brand = "Toyota";
        c1.color = "black";
        c1.speedLimit = 200;

        System.out.println(c1.brand);
    }
}