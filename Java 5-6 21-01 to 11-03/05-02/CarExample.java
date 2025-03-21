class Car {
    // variables
    String brand;
    String model;
    String color;
    String carNumber;
    int numOfWheels;

    // methods
    int add(int a, int b) {
        // method body
        int sum = a + b;
        return sum;
    }
}

class CarExample {
    public static void main(String[] args) {
        int b;
        b = 5;
        // object creation
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.model = "Innova";
        car1.color = "White";
        car1.numOfWheels = 4;
        car1.carNumber = "4689";

        Car car2 = new Car();
        car2.brand = "Suzuki";
        car2.model = "Breeza";
        car2.color = "Black";
        car2.numOfWheels = 4;
        car2.carNumber = "1111";

        System.out.println(car2.model);
        System.out.println(car1.carNumber);

        System.out.println(car1.add(5,8));
        System.out.println(car2.add(10, 20));
    }
}