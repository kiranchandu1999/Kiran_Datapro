class Car {
    String brand;
    String color;
    int topSpeed;

    void accelerate(int speed) {
        System.out.println("car is accelerated to " + speed);
    }
}

public class CarExample {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.brand = "Benz";
        car1.color = "black";
        car1.topSpeed = 250;

        car2.brand = "Ford";
        car2.color = "white";
        car2.topSpeed = 210;

        car1.accelerate(100);
    }
}