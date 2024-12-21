package OOPS;

public class Car {
    // states / properties
    String model;
    int noOfWheels;
    String brand;

    // methods / behaviours
    void drive(){
        System.out.println("car can move");
    }

    public static void main(String[] args) {
        // creating object 1
        Car car1 = new Car();
        car1.model = "Alto 800";
        car1.noOfWheels = 4;
        car1.brand = "Suzuki";
        car1.drive();

        // creating object 2
        Car car2 = new Car();
        car2.brand = "Benz";
        car2.model = "Maybacc 650";
        car2.noOfWheels = 6;

        System.out.println(car2.model);
    }
}
